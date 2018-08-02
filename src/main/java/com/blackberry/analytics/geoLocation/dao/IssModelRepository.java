package com.blackberry.analytics.geoLocation.dao;

import com.blackberry.analytics.geoLocation.entity.IssModelDao;
import com.blackberry.analytics.geoLocation.entity.IssModelKeyDao;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface IssModelRepository extends CassandraRepository<IssModelDao, IssModelKeyDao> {
    List<IssModelDao> getAllByKeyUserId(final String userId);

    List<IssModelDao> getAllByKeyUserIdAndKeyGeoHash(final String userId, final String geoHash);

    List<IssModelDao> getAllByKeyUserIdAndKeyGeoHashAndKeyIpAddress(final String userId, final String geoHash, final String ipAddress);

    List<IssModelDao> getAllByKeyUserIdAndKeyGeoHashAndKeyIpAddressAndKeyTargetApp(final String userId, final String geoHash, final String ipAddress, final String targetApp);
}
