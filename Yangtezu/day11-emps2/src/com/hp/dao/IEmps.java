package com.hp.dao;

import com.hp.entity.Emps;

import java.util.List;

public interface IEmps {

    /**
     *
     * @return 返回emps表中的数据list集合
     */
    List<Emps> selectAll();

    /**
     *
     * @param id  要删除的id
     * @return  返回受影响的行数
     */
    int deleteEmps(String id);

    /**
     * 添加一行数据
     * @param emp
     * @return
     */
    int addEmp(Emps emp);

    /**
     * 通过id查找一行数据
     * @param id
     * @return
     */
    Emps getEmpsByid(String id);

    /**
     * 更新一条数据
     * @param emp
     * @return
     */
    int updateEmps(Emps emp);
}
