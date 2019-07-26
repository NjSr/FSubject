package com.czxy.score.service.impl;

import com.czxy.score.dao.DeptMapper;
import com.czxy.score.domain.Dept;
import com.czxy.score.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;


    @Override
    public List<Dept> findAll() {
        return deptMapper.selectAll();
    }
}
