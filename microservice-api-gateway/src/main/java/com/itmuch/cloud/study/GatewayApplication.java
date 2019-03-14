package com.itmuch.cloud.study;

import com.itmuch.cloud.study.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Mr Tom
 * @date 2019/3/13
 * @email ptomjie@gmail.com
 * @description
 * @since 2019/3/13
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
