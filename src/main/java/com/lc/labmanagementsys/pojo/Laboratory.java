package com.lc.labmanagementsys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Laboratory implements Serializable {
    private static final long serialVersionUID = -8475615696826844447L;
    private String name;
    private String location;
}
