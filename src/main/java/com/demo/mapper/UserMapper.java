package com.demo.mapper;

import com.demo.entity.User;
import com.demo.util.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: chenyue
 * @Date: 2020/3/3 14:54
 */
@Repository
public interface UserMapper extends MyMapper<User> {

    int addInfo(User user);

    int updateInfo(User user);

    int deleteInfo(List<User> user);

    List<User> getAllInfo();
}
