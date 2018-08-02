package com.blackberry.analytics.geoLocation.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("iss_model_poc")
public class IssModelDao {
    @PrimaryKey
    private IssModelKeyDao key;

    @Column("cluster_id")
    private int clusterId;
    @Column("cluster_size")
    private int clusterSize;
    @Column("unique_dps")
    private int uniqueDps;
    @Column("user_freq")
    private int userFreq;

    public IssModelDao(IssModelKeyDao key, int clusterId, int clusterSize, int uniqueDps, int userFreq) {
        this.key = key;
        this.clusterId = clusterId;
        this.clusterSize = clusterSize;
        this.uniqueDps = uniqueDps;
        this.userFreq = userFreq;
    }

    public IssModelKeyDao getKey() {
        return key;
    }

    public void setKey(IssModelKeyDao key) {
        this.key = key;
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public int getClusterSize() {
        return clusterSize;
    }

    public void setClusterSize(int clusterSize) {
        this.clusterSize = clusterSize;
    }

    public int getUniqueDps() {
        return uniqueDps;
    }

    public void setUniqueDps(int uniqueDps) {
        this.uniqueDps = uniqueDps;
    }

    public int getUserFreq() {
        return userFreq;
    }

    public void setUserFreq(int userFreq) {
        this.userFreq = userFreq;
    }
}
