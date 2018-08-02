package com.blackberry.analytics.geoLocation.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@PrimaryKeyClass
public class IssModelKeyDao implements Serializable {

    @PrimaryKeyColumn(name = "user_id", type = PrimaryKeyType.PARTITIONED)
    private String userId;
    @PrimaryKeyColumn(name = "geo_hash")
    private String geoHash;
    @PrimaryKeyColumn(name = "ip_address")
    private String ipAddress;
    @PrimaryKeyColumn(name = "target_app")
    private String targetApp;

    public IssModelKeyDao(String userId, String geoHash, String ipAddress, String targetApp) {
        this.userId = userId;
        this.geoHash = geoHash;
        this.ipAddress = ipAddress;
        this.targetApp = targetApp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTargetApp() {
        return targetApp;
    }

    public void setTargetApp(String targetApp) {
        this.targetApp = targetApp;
    }
}
