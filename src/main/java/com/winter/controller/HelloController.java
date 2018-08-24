package com.winter.controller;

import com.winter.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author wyatt
 * @Data 2018/08/24 17:40
 */
@RestController
public class HelloController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/hello/sql", method = RequestMethod.GET)
    public ResponseEntity addTestData(){

        return ResponseEntity.ok("导入成功!!");

    }
}
