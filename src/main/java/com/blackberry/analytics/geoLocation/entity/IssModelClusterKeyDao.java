package com.blackberry.analytics.geoLocation.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class IssModelClusterKeyDao {
    @PrimaryKeyColumn(name = "cluster_id", type = PrimaryKeyType.PARTITIONED)
    private String clusterId;
    @PrimaryKeyColumn(name = "user_id")
    private String userId;
    @PrimaryKeyColumn(name = "geo_hash")
    private String geoHash;
    @PrimaryKeyColumn(name = "ip_address")
    private String ipAddress;
    @PrimaryKeyColumn(name = "target_app")
    private String targetApp;

    public IssModelClusterKeyDao(String clusterId, String userId, String geoHash, String ipAddress, String targetApp) {
        this.clusterId = clusterId;
        this.userId = userId;
        this.geoHash = geoHash;
        this.ipAddress = ipAddress;
        this.targetApp = targetApp;
    }

    public String getClusterId() {
        return clusterId;
    }

    public String getUserId() {
        return userId;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getTargetApp() {
        return targetApp;
    }
}
