package com.blackberry.analytics.geoLocation.controller;

import com.blackberry.analytics.geoLocation.dao.IssModelClusterRepository;
import com.blackberry.analytics.geoLocation.dao.IssModelRepository;
import com.blackberry.analytics.geoLocation.entity.IssModelClusterDao;
import com.blackberry.analytics.geoLocation.entity.IssModelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class IssController {

    @Autowired
    private IssModelRepository issModelRepository;
    @Autowired
    private IssModelClusterRepository issModelClusterRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/issModel")
    public List<IssModelDao> getAllByKeyUserIdAndKeyGeoHashAndKeyIpAddressAndKeyTargetApp(@RequestParam(value = "userId", defaultValue = "") String userId,
                                                                                          @RequestParam(value = "geoHash", defaultValue = "") String geoHash,
                                                                                          @RequestParam(value = "ipAddress", defaultValue = "") String ipAddress,
                                                                                          @RequestParam(value = "targetApp", defaultValue = "") String targetApp) {
        if (userId.isEmpty()) {
            return issModelRepository.findAll();
        } else if (geoHash.isEmpty()) {
            return issModelRepository.getAllByKeyUserId(userId);
        } else if (ipAddress.isEmpty()) {
            return issModelRepository.getAllByKeyUserIdAndKeyGeoHash(userId, geoHash);
        } else if (targetApp.isEmpty()) {
            return issModelRepository.getAllByKeyUserIdAndKeyGeoHashAndKeyIpAddress(userId, geoHash, ipAddress);
        } else {
            return issModelRepository.getAllByKeyUserIdAndKeyGeoHashAndKeyIpAddressAndKeyTargetApp(userId, geoHash, ipAddress, targetApp);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/issModelCluster")
    public List<IssModelClusterDao> getAllByKeyClusterId(@RequestParam(value = "clusterId", defaultValue = "-1") int clusterId) {
        if (clusterId == -1) {
            return issModelClusterRepository.findAll();
        } else {
            return issModelClusterRepository.getAllByKeyClusterId(clusterId);
        }
    }
}
