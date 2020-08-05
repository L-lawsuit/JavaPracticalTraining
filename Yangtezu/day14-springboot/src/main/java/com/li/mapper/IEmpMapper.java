package com.li.mapper;

import com.li.domain.Emps;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpMapper {

    //查询所有数据
    @Select("select * from emps")
    List<Emps> selectAll();
}
