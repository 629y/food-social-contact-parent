package com.imooc.diners.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Rest 配置类
 */
@Configuration
public class RestTemplateConfiguration {

    @LoadBalanced
    @Bean
    public RedisTemplate redisTemplate(){
        return new RedisTemplate();
    }

}
