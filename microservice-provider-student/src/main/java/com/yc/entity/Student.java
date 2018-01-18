package com.yc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author lzd
 * @date 2018/01/17
 *
 */
@Data
public class Student implements Serializable{
    private  static  final long serialVersionID=1L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 备注
     */
    private String remark;
    /**
     * 性别
     */
    private String sex;
}
