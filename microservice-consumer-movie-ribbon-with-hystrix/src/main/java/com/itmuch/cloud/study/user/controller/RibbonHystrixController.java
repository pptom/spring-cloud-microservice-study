package com.itmuch.cloud.study.user.controller;

import com.itmuch.cloud.study.user.domain.User;
import com.itmuch.cloud.study.user.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr Tom
 * @date 2018/3/15
 * @email ptomjie@gmail.com
 * @description
 * @since 2018/3/15
 */
@RestController
public class RibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}
