package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.pojo.Laboratory;
import com.lc.labmanagementsys.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@ApiIgnore // 表示这个类被swagger忽略
public class LaboratoryController {
    @Autowired
    private LaboratoryService laboratoryService;

    @GetMapping("/getLaboratories")
    public JsonResult getLaboratories(){
        List<Laboratory> laboratories = laboratoryService.listLaboratories();
        JsonResult result = new JsonResult("返回实验室信息",laboratories);
        return result;
    }
}
