package com.li.service.imp;

import com.li.domain.Emps;
import com.li.mapper.IEmpMapper;
import com.li.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements IEmpService {

    @Autowired
    private IEmpMapper mapper;

    @Override
    public List<Emps> selectAll() {
        return mapper.selectAll();
    }
}
