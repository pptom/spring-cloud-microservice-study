package com.itmuch.cloud.study.service;

import com.itmuch.cloud.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr Tom
 * @date: 2018/3/11
 * @since: 2018/3/11
 * @email: ptomjie@gmail.com
 * @description:
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }
}
