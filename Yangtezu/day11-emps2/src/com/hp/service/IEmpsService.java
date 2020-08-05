package com.hp.service;

import com.hp.entity.Emps;

import java.util.List;

public interface IEmpsService {

    /**
     * 返回emps表中的所有数据集合
     * @return
     */
    List<Emps> selectAll();

    /**
     * 删除指定id的emps表中的数据
     * @param id
     * @return
     */
    int deleteEmps(String id);

    /**
     * 添加emp成员
     * @param emp
     * @return
     */
    int addEmp(Emps emp);

    /**
     * 通过id得到一个emp数据
     * @param id
     * @return
     */
    Emps getEmpsById(String id);

    /**
     * 更新一条数据
     * @param emp
     * @return
     */
    int updateEmps(Emps emp);
}
