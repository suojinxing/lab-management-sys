package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.pojo.Laboratory;
import com.lc.labmanagementsys.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratory")
public class LaboratoryController {
    @Autowired
    private LaboratoryService laboratoryService;

    @GetMapping("/findAll")
    public JsonResult findAll() {
        JsonResult result = new JsonResult();
        List<Laboratory> laboratoryList = laboratoryService.findAll();
        result.setObj(laboratoryList);
        result.setMessage("返回数据成功");
        return result;
    }

    @GetMapping("/findByPage")
    public JsonResult findByPage(Integer currentPage) {
        List<Laboratory> laboratoryList = laboratoryService.findByPage(currentPage);
        JsonResult result = new JsonResult();
        result.setObj(laboratoryList);
        result.setMessage("返回分页数据成功");
        return result;
    }

    @GetMapping("/findByUuid")
    public JsonResult findByUuid(String uuid) {
        Laboratory laboratory = laboratoryService.findByUuid(uuid);
        JsonResult result = new JsonResult();
        result.setObj(laboratory);
        result.setMessage("返回数据成功");
        return result;
    }


    @DeleteMapping("/delete")
    public JsonResult deleteByUuid(String uuid) {
        JsonResult result = new JsonResult();
        result.setMessage("删除成功" + uuid);
        laboratoryService.deleteByUuid(uuid);
        return result;
    }

    @PostMapping("/add")
    public JsonResult add(@RequestBody Laboratory laboratory) {
        laboratoryService.add(laboratory);
        JsonResult result = new JsonResult("添加成功", laboratory);
        return result;
    }

    @PostMapping("/update")
    public JsonResult update(@RequestBody Laboratory laboratory) {
        System.out.println(laboratory);
        laboratoryService.update(laboratory);
        JsonResult result = new JsonResult("添加成功", laboratory);
        return result;
    }
}
