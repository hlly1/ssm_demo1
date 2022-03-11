package com.example.service;
import com.example.pojo.Actor;
import java.util.List;


public interface DemoService {
    List<Actor> readActors() throws Exception;

}
