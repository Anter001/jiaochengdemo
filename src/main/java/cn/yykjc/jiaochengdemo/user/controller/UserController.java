package cn.yykjc.jiaochengdemo.user.controller;

import cn.yykjc.jiaochengdemo.user.entity.UserEntity;
import cn.yykjc.jiaochengdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @RestController = @ResponseBody +@Controller
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping("/test")
//    public String test(){
//        return "hello word";
//    }

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    //保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {

        userService.save(userEntity);
        return "success";
    }

    //根据id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserByid(Integer id){
        return userService.getUserById(id);
    }

    //根据id修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
        userService.updateUserById(userEntity);
        return "success";
    }
}
