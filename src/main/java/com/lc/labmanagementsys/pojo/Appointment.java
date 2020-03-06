package com.lc.labmanagementsys.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("appointment")
public class Appointment {
    @TableId(type = IdType.UUID)
    private String uuid;
    private String appointmentPerson;
    private Date appointmentTime;
    private String laboratoryUuid;
    private Integer state;
    private String department;
    private Integer appointmentNumber;

}
