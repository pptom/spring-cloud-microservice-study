package com.itmuch.cloud.study.repository;

import com.itmuch.cloud.study.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Mr Tom
 * @date: 2018/3/10
 * @since: 2018/3/10
 * @email: ptomjie@gmail.com
 * @description:
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
