package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.domain.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr Tom
 * @date: 2018/3/10
 * @since: 2018/3/10
 * @email: ptomjie@gmail.com
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id){
        User findone = this.userRepository.findOne(id);
        return findone;
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }


}
