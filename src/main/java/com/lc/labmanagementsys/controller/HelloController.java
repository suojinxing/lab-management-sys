package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "hello world接口")
public class HelloController {
    //接口简单描述和详细描述
    @ApiOperation(value = "测设界面", notes = "测试springboot启动成功")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @ApiOperation(value = "展示用户界面", notes = "获取所有的用户用li标签展示在界面上")
    @GetMapping("/indexUser")
    public String indexUser() {
        return "indexUser";
    }

    //swagger注解解释
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "user", value = "用户对象")
    })
    @ApiOperation(value = "swagger使用", notes = "swagger start")
    @GetMapping("/swagger")
    @ResponseBody
    public JsonResult swagger(String name, User user) {
        JsonResult result = new JsonResult();
        result.setData(new User("sjx", "sjx", 2));
        return result;
    }

    @ApiOperation(value = "swagger使用", notes = "swagger start")
    @PostMapping("/swagger2")
    @ResponseBody
    public JsonResult swagger2(@RequestBody User user) {
        JsonResult result = new JsonResult();
        result.setData(user);
        return result;
    }


}
