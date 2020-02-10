package com.lizk.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.lizk.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 增加 fallback 指定类
 */
@FeignClient(value = "nacos-provider" , fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
