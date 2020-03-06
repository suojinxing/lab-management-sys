package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.vo.LoginInfoVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public JsonResult login(@RequestBody LoginInfoVo loginInfoVo){
        JsonResult result = new JsonResult("login success" + loginInfoVo.getUsername() + loginInfoVo.getPassword());
        return result;
    }
}
