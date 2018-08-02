package com.blackberry.analytics.geoLocation.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("iss_model_clusters")
public class IssModelClusterDao {
    @Column("cluster_size")
    private final String clusterSize;
    @Column("unique_dps")
    private final String uniqueDps;
    @Column("user_freq")
    private final String userFreq;
    @PrimaryKey
    private IssModelClusterKeyDao key;

    public IssModelClusterDao(String clusterSize, String uniqueDps, String userFreq, IssModelClusterKeyDao key) {
        this.clusterSize = clusterSize;
        this.uniqueDps = uniqueDps;
        this.userFreq = userFreq;
        this.key = key;
    }

    public String getClusterSize() {
        return clusterSize;
    }

    public String getUniqueDps() {
        return uniqueDps;
    }

    public String getUserFreq() {
        return userFreq;
    }

    public IssModelClusterKeyDao getKey() {
        return key;
    }

    public void setKey(IssModelClusterKeyDao key) {
        this.key = key;
    }
}
