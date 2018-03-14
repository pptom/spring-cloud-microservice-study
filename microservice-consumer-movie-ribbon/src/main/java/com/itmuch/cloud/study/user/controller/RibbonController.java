package com.itmuch.cloud.study.user.controller;

import com.itmuch.cloud.study.user.domain.User;
import com.itmuch.cloud.study.user.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr Tom
 * @date: 2018/3/11
 * @since: 2018/3/11
 * @email: ptomjie@gmail.com
 * @description:
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }
}
