package com.lc.labmanagementsys.service;

import com.lc.labmanagementsys.pojo.Laboratory;

import java.util.List;

public interface LaboratoryService {
    Laboratory findByUuid(String uuid);

    List<Laboratory> findAll();

    void deleteByUuid(String uuid);

    void add(Laboratory laboratory);

    void update(Laboratory laboratory);

    List<Laboratory> findByPage(Integer currentPage);
}
