package com.myblog.customerservice.service;

import com.myblog.customerservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User,Integer> {

    //登录查询
    User findByUseridAndPassword(Integer userid ,String password);
    boolean existsByUserid(Integer userid);

}
