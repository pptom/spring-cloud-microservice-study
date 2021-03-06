package com.itmuch.cloud.study.user.controller;

import com.itmuch.cloud.study.user.domain.User;
import com.itmuch.cloud.study.user.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr Tom
 * @date 2018/3/14
 * @email ptomjie@gmail.com
 * @description
 * @since 2018/3/14
 */
@RestController
public class FeignHystrixController {
//    @Qualifier("hystrixClientFallback")
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("/feign/{id}")
    public User findByFeign(@PathVariable Long id) {
        User user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }
}
