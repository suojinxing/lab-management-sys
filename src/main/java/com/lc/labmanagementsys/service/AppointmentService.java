package com.lc.labmanagementsys.service;

import com.lc.labmanagementsys.pojo.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment findByUuid(String uuid);

    List<Appointment> findAll();

    void deleteByUuid(String uuid);

    void add(Appointment appointment);

    void update(Appointment appointment);

    List<Appointment> findByPage(Integer currentPage);
}
