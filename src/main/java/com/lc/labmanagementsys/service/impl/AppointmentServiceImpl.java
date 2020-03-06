package com.lc.labmanagementsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lc.labmanagementsys.dao.AppointmentDao;
import com.lc.labmanagementsys.pojo.Appointment;
import com.lc.labmanagementsys.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public List<Appointment> findAll() {
        // 查询全部实验室的信息
        QueryWrapper<Appointment> queryWapper = new QueryWrapper<>();
        queryWapper.orderByAsc("appointment_time");
        List<Appointment> appointmentList = appointmentDao.selectList(queryWapper);
        return appointmentList;
    }

    // 分页查询
    @Override
    public List<Appointment> findByPage(Integer currentPage) {
        int pageSize = 12; // TODO 自定义每页查询条数
        if (currentPage == null) {
            currentPage = 1;
        }
        if (currentPage < 1) {
            currentPage = 1;
        }
        int startIndex = (currentPage - 1) * pageSize;
        return appointmentDao.findByPage(startIndex, pageSize);
    }

    @Override
    public Appointment findByUuid(String uuid) {
        Objects.requireNonNull(uuid);
        return appointmentDao.selectById(uuid);
    }

    @Override
    public void deleteByUuid(String uuid) {
        appointmentDao.deleteById(uuid);
    }

    @Override
    public void add(Appointment appointment) {
        // 生成主键uuid
        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 32);
        System.out.println(uuid);
        appointment.setUuid(uuid);
        appointmentDao.insert(appointment);
    }

    @Override
    public void update(Appointment appointment) {
        appointmentDao.updateById(appointment);
    }

}
