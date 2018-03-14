package com.itmuch.cloud.study.user.feign;

import com.itmuch.cloud.study.user.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tom.tang
 * @date 2018/3/14
 * @email tom.tang@sainstore.com
 * @description 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 * @since 2018/3/14
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);
}
