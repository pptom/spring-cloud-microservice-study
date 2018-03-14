package com.itmuch.cloud.study.user.controller;

import com.itmuch.cloud.study.user.domain.User;
import com.itmuch.cloud.study.user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom.tang
 * @date 2018/3/14
 * @email tom.tang@sainstore.com
 * @description
 * @since 2018/3/14
 */
@RestController
public class FeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/feign/{id}")
    public User findByFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }
}
