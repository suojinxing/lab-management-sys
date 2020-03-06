package com.lc.labmanagementsys.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Accessors(chain = true)
@TableName("laboratory")
public class Laboratory {
    @TableId(type = IdType.UUID)
    private String uuid;
    private String id;
    private String name;
    private String operator;
    private String capacity;
    private Date startTime;
    private Date endTime;
    private Integer enable;
}
