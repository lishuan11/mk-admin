package com.lishuan.mk.service.fallback;

import com.qianfeng.ms.pojo.entity.User;
import com.qianfeng.ms.pojo.query.UserQuery;
import com.qianfeng.ms.service.UserServiceFeign;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * creator：杜夫人
 * date: 2020/6/24
 */

@Service
public class UserServiceFallBack implements UserServiceFeign {// 证明它是一个服务

    @Override
    public User findUserById(Long id) {

        System.err.println("我是服务降级的findUserById");


        return null;
    }

    @Override
    public List<User> listUser(UserQuery query) {
        System.err.println("我是服务降级的listUser");
        return null;
    }

    @Override
    public List<User> listUsers(String name, Long userId) {
        return null;
    }
}
