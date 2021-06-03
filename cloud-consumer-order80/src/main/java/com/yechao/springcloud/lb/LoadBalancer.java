package com.yechao.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/2 10:32
 * @version: 1.0
 */
public interface LoadBalancer {
    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
