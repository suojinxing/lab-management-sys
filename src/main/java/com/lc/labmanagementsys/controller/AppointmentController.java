package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.pojo.Appointment;
import com.lc.labmanagementsys.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/findAll")
    public JsonResult findAll() {
        JsonResult result = new JsonResult();
        List<Appointment> appointmentList = appointmentService.findAll();
        result.setObj(appointmentList);
        result.setMessage("返回数据成功");
        return result;
    }

    @GetMapping("/findByPage")
    public JsonResult findByPage(Integer currentPage) {
        List<Appointment> appointmentList = appointmentService.findByPage(currentPage);
        JsonResult result = new JsonResult();
        result.setObj(appointmentList);
        result.setMessage("返回分页数据成功");
        return result;
    }

    @GetMapping("/findByUuid")
    public JsonResult findByUuid(String uuid) {
        Appointment appointment = appointmentService.findByUuid(uuid);
        JsonResult result = new JsonResult();
        result.setObj(appointment);
        result.setMessage("返回数据成功");
        return result;
    }


    @DeleteMapping("/delete")
    public JsonResult deleteByUuid(String uuid) {
        JsonResult result = new JsonResult();
        result.setMessage("删除成功" + uuid);
        appointmentService.deleteByUuid(uuid);
        return result;
    }

    @PostMapping("/add")
    public JsonResult add(@RequestBody Appointment appointment) {
        appointmentService.add(appointment);
        JsonResult result = new JsonResult("添加成功", appointment);
        return result;
    }

    @PostMapping("/update")
    public JsonResult update(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        appointmentService.update(appointment);
        JsonResult result = new JsonResult("添加成功", appointment);
        return result;
    }
}
