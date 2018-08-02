package com.blackberry.analytics.geoLocation.dao;

import com.blackberry.analytics.geoLocation.entity.IssModelClusterDao;
import com.blackberry.analytics.geoLocation.entity.IssModelClusterKeyDao;
import com.blackberry.analytics.geoLocation.entity.IssModelDao;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface IssModelClusterRepository extends CassandraRepository<IssModelClusterDao, IssModelClusterKeyDao> {
    List<IssModelClusterDao> getAllByKeyClusterId(final int clusterId);
}
