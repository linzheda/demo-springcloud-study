package com.yc.web;

import com.yc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author lzd
 * @date 2018/01/18
 */
@RestController
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "getAll.do")
    public List<Student> getAll(){
       return  this.restTemplate.getForObject("http://localhost:8082/getAll.action",List.class);
    }

}
