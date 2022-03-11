package com.example.controller;

import com.example.pojo.Actor;
import com.example.service.DemoService;
import com.example.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import java.util.List;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/readActor", method = RequestMethod.POST)
    public ModelAndView serviceController() throws Exception{
        System.out.println("[Server Log]: This is controller");
        List<Actor> result =this.demoService.readActors();
        System.out.println("[Server Log Controller]: \n"+result);

        String printTable = "<table>";
        for(int i=0;i<result.size();i++){
            printTable+=
                    "<tr>"+
                        "<td>"+result.get(i).getActor_id()+"</td>"+
                        "<td>"+result.get(i).getFirst_name()+"</td>"+
                        "<td>"+result.get(i).getLast_name()+"</td>"+
                        "<td>"+result.get(i).getLast_update()+"</td>"+
                    "</tr>";
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("printTable",printTable);
        mav.setViewName("/index");
        return mav;
    }
}
