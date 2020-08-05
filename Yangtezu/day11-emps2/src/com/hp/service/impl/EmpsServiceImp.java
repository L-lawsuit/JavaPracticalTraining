package com.hp.service.impl;

import com.hp.dao.IEmps;
import com.hp.dao.impl.EmpsImp;
import com.hp.entity.Emps;
import com.hp.service.IEmpsService;

import java.util.List;

public class EmpsServiceImp implements IEmpsService {

    private IEmps empsImp = new EmpsImp();


    @Override
    public List<Emps> selectAll(){
        return empsImp.selectAll();
    }

    @Override
    public int deleteEmps(String id) {

        return empsImp.deleteEmps(id);
    }

    @Override
    public int addEmp(Emps emp) {


        return empsImp.addEmp(emp);
    }

    @Override
    public Emps getEmpsById(String id) {
        return empsImp.getEmpsByid(id);
    }

    @Override
    public int updateEmps(Emps emp) {
        return empsImp.updateEmps(emp);
    }
}
