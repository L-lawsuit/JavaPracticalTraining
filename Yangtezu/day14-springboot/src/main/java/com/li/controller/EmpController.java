package com.li.controller;


import com.li.domain.Emps;
import com.li.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.List;

@RequestMapping("/emp")
@Controller
public class EmpController {

    @Autowired
    private IEmpService service;

    //查询所有员工数据
    @RequestMapping("/all")
    @ResponseBody
    public List<Emps> selectAll(){
        return service.selectAll();
    }


}
