package com.hp.service.impl;

import com.hp.domain.SearchHistory;
import com.hp.mapper.ISearchHistoryMapper;
import com.hp.service.ISearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchHistoryWordsServiceImp implements ISearchHistoryService {
    @Autowired
    private ISearchHistoryMapper searchHistoryMapper;

    @Override
    public List<SearchHistory> searchWords() {
        return searchHistoryMapper.searchHistory();
    }
}
