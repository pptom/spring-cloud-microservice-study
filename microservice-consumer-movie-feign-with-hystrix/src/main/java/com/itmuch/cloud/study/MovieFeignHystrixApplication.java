package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author tom.tang
 * @date 2018/3/15
 * @email tom.tang@sainstore.com
 * @description
 * @since 2018/3/15
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MovieFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieFeignHystrixApplication.class, args);
    }

}
