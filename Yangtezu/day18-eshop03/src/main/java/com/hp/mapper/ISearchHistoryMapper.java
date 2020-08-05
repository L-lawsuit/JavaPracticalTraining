package com.hp.mapper;

import com.hp.domain.SearchHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISearchHistoryMapper {

    @Select("select * from s_search_history order by num desc limit 10")
    List<SearchHistory> searchHistory();

    @Select("SELECT COUNT(num) FROM s_search_history WHERE search_words = #{words}")
    boolean isWordsExist(String words);

    @Update("UPDATE s_search_history SET num = num + 1 WHERE search_words = #{words}")
    void updateSearchWordsNum(String words);

    @Insert("insert into s_search_history values(#{id},#{search_words},#{num},#{search_time})")
    void addSearchHistory(SearchHistory searchHistory);
}
