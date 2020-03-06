package com.lc.labmanagementsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lc.labmanagementsys.dao.LaboratoryDao;
import com.lc.labmanagementsys.pojo.Laboratory;
import com.lc.labmanagementsys.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class LaboratoryServiceImpl implements LaboratoryService {
    @Autowired
    private LaboratoryDao laboratoryDao;

    @Override
    public List<Laboratory> findAll() {
        // 查询全部实验室的信息
        QueryWrapper<Laboratory> queryWapper = new QueryWrapper<>();
        queryWapper.orderByAsc("id");
        List<Laboratory> laboratoryList = laboratoryDao.selectList(queryWapper);
        return laboratoryList;
    }

    // 分页查询
    @Override
    public List<Laboratory> findByPage(Integer currentPage) {
        int pageSize = 12; // TODO 自定义每页查询条数
        if (currentPage == null) {
            currentPage = 1;
        }
        if (currentPage < 1){
            currentPage = 1;
        }
        int startIndex = (currentPage - 1) * pageSize;
        return laboratoryDao.findByPage(startIndex, pageSize);
    }

    @Override
    public Laboratory findByUuid(String uuid) {
        Objects.requireNonNull(uuid);
        return laboratoryDao.selectById(uuid);
    }

    @Override
    public void deleteByUuid(String uuid) {
        laboratoryDao.deleteById(uuid);
    }

    @Override
    public void add(Laboratory laboratory) {
        // 生成主键uuid
        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 32);
        System.out.println(uuid);
        laboratory.setUuid(uuid);
        laboratoryDao.insert(laboratory);
    }

    @Override
    public void update(Laboratory laboratory) {
        laboratoryDao.updateById(laboratory);
    }

}
