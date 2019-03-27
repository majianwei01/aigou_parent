package com.majianwei.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //加入注册中心
@EnableConfigServer //启用配置服务端
public class ConfigApplication_1299 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication_1299.class);
    }
}
