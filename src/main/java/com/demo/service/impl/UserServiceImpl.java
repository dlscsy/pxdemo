package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @Description
 * @Author chenyue
 * @Date 2020/3/4 13:31
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	/**
	 * 查询所有的信息
	 * @param
	 * @return
	 */
	@Override
	public ResultUtil getAllInfo() {
		ResultUtil resultUtil = new ResultUtil();
		List<User> list = userMapper.getAllInfo();
		resultUtil.setMessage("添加成功");
		resultUtil.setStatus(0);
		resultUtil.setData(list.size());
		resultUtil.setList(list);
		return resultUtil;
	}

	/**
	 * 添加相应的信息
	 * @param user
	 * @return
	 */
	@Override
	public ResultUtil addInfo(User user) {
		ResultUtil resultUtil = new ResultUtil();
		if(user == null || "".equals(user)){
			resultUtil.setStatus(0);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		user.setId(new Random().nextInt(10000));
		int count = userMapper.addInfo(user);
		resultUtil.setMessage("添加成功");
		resultUtil.setStatus(0);
		resultUtil.setData(count);
		return resultUtil;
	}

	/**
	 * 根据id删除相应的信息
	 * @param list
	 * @return
	 */
	@Override
	public ResultUtil deleteInfo(List<User> list) {
		ResultUtil resultUtil = new ResultUtil();
		if(list == null || list.size()<=0){
			resultUtil.setStatus(0);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		int count = userMapper.deleteInfo(list);
		resultUtil.setMessage("删除成功");
		resultUtil.setStatus(0);
		resultUtil.setData(count);
		return resultUtil;
	}

	/**
	 * 根据id修改相应的信息
	 * @param user
	 * @return
	 */
	@Override
	public ResultUtil updateInfo(User user) {
		ResultUtil resultUtil = new ResultUtil();
		if(user == null || "".equals(user)){
			resultUtil.setStatus(0);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		if(user.getId() == null || "".equals(user.getId())){
			resultUtil.setStatus(0);
			resultUtil.setMessage("id不能为空");
			return resultUtil;
		}
		int count = userMapper.updateInfo(user);
		resultUtil.setMessage("修改成功");
		resultUtil.setStatus(0);
		resultUtil.setData(count);
		return resultUtil;
	}
}
