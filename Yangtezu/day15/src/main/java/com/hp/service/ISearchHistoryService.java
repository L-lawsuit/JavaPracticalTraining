package com.hp.service;

import com.hp.domain.SearchHistory;

import java.util.List;

public interface ISearchHistoryService {

    //查询历史关键字
    List<SearchHistory> searchWords();
}
