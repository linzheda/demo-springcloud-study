package com.yc.mappers;

import com.yc.entity.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 查询所有学生
     * @return
     */
    List<Student> getAll();
}
