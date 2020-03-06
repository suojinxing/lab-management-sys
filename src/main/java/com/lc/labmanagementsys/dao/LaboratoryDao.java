package com.lc.labmanagementsys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.labmanagementsys.pojo.Laboratory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LaboratoryDao extends BaseMapper<Laboratory> {
    List<Laboratory> findByPage(@Param("startIndex") Integer startIndex,
                                @Param("pageSize") int pageSize);
}
