package com.myblog.customerservice.controller;


import com.myblog.customerservice.config.RandomByUserId;
import com.myblog.customerservice.entity.User;
import com.myblog.customerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;
    @GetMapping("/login/{userid}/{password}")
    public User userLogin(@PathVariable("userid") Integer userid , @PathVariable("password") String password){

        return userService.findByUseridAndPassword(userid,password);
    }
    @PostMapping("/register")
    public String userRegister(@RequestBody User user){
        RandomByUserId randomByUserId = new RandomByUserId();
        Integer integer = randomByUserId.randomByUserId();

        if(userService.existsByUserid(integer)){

            return null;
        }else{

            user.setUserid(integer);
            User user1 =userService.save(user);

            Integer userid=user1.getUserid();
            if(user1!=null){
                return ""+userid;
            }else{
                return "error";
            }
        }
    }

}
