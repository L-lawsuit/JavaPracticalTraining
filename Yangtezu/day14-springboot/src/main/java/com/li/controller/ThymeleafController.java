package com.li.controller;

import com.li.domain.Emps;
import com.li.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/thy")
public class ThymeleafController {

    @Autowired
    private IEmpService service;

    //查询所有员工数据 用thymeleaf来显示
    @RequestMapping("/all")
    public String selectAll(Model model){
        List<Emps> list = service.selectAll();
        model.addAttribute("emps",list);
        return "thy/emp";

    }
}
