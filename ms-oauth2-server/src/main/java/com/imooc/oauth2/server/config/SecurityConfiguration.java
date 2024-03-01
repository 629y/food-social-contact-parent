package com.imooc.oauth2.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Security 配置类
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //注入 Redis 连接工厂

    //初始化 RedisTokenStore 用于将 token 存储至 Redis

    //初始化密码编码器，用 MD5 加密密码

    //初始化认证管理对象

    //放行和认证规则
}
