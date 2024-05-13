package com.isxcode.rainbow.modules.cluster.service;

import com.isxcode.rainbow.api.cluster.pojos.req.*;
import com.isxcode.rainbow.backend.api.base.exceptions.IsxAppException;
import com.isxcode.rainbow.modules.cluster.entity.ClusterEntity;
import com.isxcode.rainbow.modules.cluster.repository.ClusterRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 计算引擎模块.
 */
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ClusterService {

    private final ClusterRepository clusterRepository;

    public ClusterEntity getCluster(String clusterId) {

        return clusterRepository.findById(clusterId).orElseThrow(() -> new IsxAppException("计算引擎不存在"));
    }

    public void checkCluster(String clusterId) {

        clusterRepository.findById(clusterId).orElseThrow(() -> new IsxAppException("计算引擎不存在"));
    }
}
