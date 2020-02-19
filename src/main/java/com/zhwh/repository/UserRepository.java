package com.zhwh.repository;

import com.zhwh.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 账号密码登录
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);

}
