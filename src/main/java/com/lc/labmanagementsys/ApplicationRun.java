package com.lc.labmanagementsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 扫描dao包下的mapper接口
@MapperScan("com.lc.labmanagementsys.dao")
@SpringBootApplication
public class ApplicationRun {

    public static void main(String[] args) {
        System.out.println("spring启动成功");
        SpringApplication.run(ApplicationRun.class, args);
    }



}
