package com.example.service.impl;

import com.example.dao.DemoDao;
import com.example.pojo.Actor;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public List<Actor> readActors() throws Exception {
        System.out.println("[Server Log]: This is Service Impl");
        return demoDao.getActors();
    }
}
