package com.yc.web;

import com.yc.dao.BaseDao;
import com.yc.entity.Student;

import com.yc.mappers.StudentMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lzd
 * @date 2018/01/17
 */
@RestController
public class StudentController {
    @Autowired
    @Qualifier("baseDaoImpl")
    private BaseDao bd;

    @ApiOperation(value="获取学生用户",notes = "查询study表")
    @RequestMapping(value = "/getAll.action", method = RequestMethod.GET)
    public List<Student> getAll() {
        System.out.println("6666");
        List<Student> list=bd.findAll(new Student(),"getAll");
        return list;
    }


}
