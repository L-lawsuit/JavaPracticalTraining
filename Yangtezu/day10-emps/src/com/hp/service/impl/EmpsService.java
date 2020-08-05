package com.hp.service.impl;

import com.hp.dao.IEmps;
import com.hp.dao.impl.EmpsImp;
import com.hp.entity.Emps;


import java.util.List;

public class EmpsService {

    private IEmps empsImp = new EmpsImp();

    /**
     *
     * @return 返回emps表中的所有数据集合
     */
    public List<Emps> selectAll(){
        return empsImp.selectAll();
    }

    public int deleteEmps(String id) {

        return empsImp.deleteEmps(id);
    }
}
