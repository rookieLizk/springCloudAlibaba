package com.lizk.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.lizk.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Service;

/**
 * 创建熔断器类并实现对应的 Feign 接口
 */
@Service
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}
