package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import com.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: chenyue
 * @Date: 2020/3/3 14:50
 */

@RequestMapping("/userController")
@RestController
//@Slf4j
//@Api("Demo")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 获取所有的信息
     * @return
     */
//    @PostMapping("/getAllInfo")
    @RequestMapping("/getAllInfo")
    public ResultUtil getAllInfo(){
        ResultUtil resultUtil = null;
        try {
            resultUtil =  userService.getAllInfo();
        }catch (Exception e){
        }finally{
            return resultUtil;
        }
    }
    /**
     * 添加信息
     * @return
     */
    @PostMapping("/addInfo")
    public ResultUtil addInfo(@RequestBody User user){
        System.out.println(user);

        ResultUtil resultUtil = null;
        try {
            resultUtil =  userService.addInfo(user);
        }catch (Exception e){
        }finally{
            return resultUtil;
        }
    }
    /**
     * 删除信息
     * @return
     */
    @PostMapping("/deleteInfo")
    public ResultUtil deleteInfo(@RequestBody List<User> user){
        ResultUtil resultUtil = null;
        try {
            resultUtil =  userService.deleteInfo(user);
        }catch (Exception e){
        }finally{
            return resultUtil;
        }
    }
    /**
     * 修改信息
     * @return
     */
    @PostMapping("/updateInfo")
    public ResultUtil updateInfo(@RequestBody User user){

        System.out.println(user);

        ResultUtil resultUtil = null;
        try {
            resultUtil =  userService.updateInfo(user);
        }catch (Exception e){
        }finally{
            return resultUtil;
        }
    }
}
