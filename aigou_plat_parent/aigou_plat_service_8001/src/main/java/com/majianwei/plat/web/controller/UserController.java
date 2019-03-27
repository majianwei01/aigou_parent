package com.majianwei.plat.web.controller;

import com.majianwei.domain.User;
import com.majianwei.util.AjaxResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id){
        return new User(id, "aaa","123456" );
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(User user){
        if (user!=null&& !StringUtils.isEmpty(user.getUsername())&&!StringUtils.isEmpty(user.getPassword())){
            if ("fengbo".equals(user.getUsername())&&"123456".equals(user.getPassword())){
                return AjaxResult.me().setMsg("登录成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }return  AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
