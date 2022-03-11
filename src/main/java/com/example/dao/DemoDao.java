package com.example.dao;

import com.example.pojo.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoDao {
    List<Actor> getActors() throws Exception;

}
