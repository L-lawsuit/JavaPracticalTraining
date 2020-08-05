package com.hp.mapper;

import com.hp.domain.SearchHistory;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISearchHistoryMapper {

    @Select("select * from s_search_history order by num desc limit 10")
    List<SearchHistory> searchHistory();
}
