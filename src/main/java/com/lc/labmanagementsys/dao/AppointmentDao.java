package com.lc.labmanagementsys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.labmanagementsys.pojo.Appointment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AppointmentDao extends BaseMapper<Appointment> {
    List<Appointment> findByPage(@Param("startIndex") Integer startIndex,
                                 @Param("pageSize") int pageSize);
}
