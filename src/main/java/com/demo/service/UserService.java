package com.demo.service;

import com.demo.entity.User;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: chenyue
 * @Date: 2020/3/3 15:53
 */
@Service
public interface UserService{

    ResultUtil getAllInfo();

    ResultUtil addInfo(User user);

    ResultUtil deleteInfo(List<User> list);

    ResultUtil updateInfo(User user);

}
