package com.lc.labmanagementsys.service.impl;

import com.lc.labmanagementsys.pojo.Laboratory;
import com.lc.labmanagementsys.service.LaboratoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaboratoryServiceImpl implements LaboratoryService {
    @Override
    public List<Laboratory> listLaboratories() {
        // 模拟数据库数据
        List<Laboratory> laboratories = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            laboratories.add(new Laboratory("实验室" + i + "号", "东南角"));
        }
        return laboratories;
    }
}
