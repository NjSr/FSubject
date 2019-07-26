package com.czxy.score.controller;

import com.czxy.score.domain.Dept;
import com.czxy.score.service.DeptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Resource
    private DeptService deptService;

    @GetMapping
    public ResponseEntity<List<Dept>> findAll(){
        try {
            List<Dept> list = deptService.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
