package com.hp.service.impl;

import com.hp.domain.SearchHistory;
import com.hp.mapper.ISearchHistoryMapper;
import com.hp.service.ISearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SearchHistoryWordsServiceImp implements ISearchHistoryService {
    @Autowired
    private ISearchHistoryMapper searchHistoryMapper;

    @Override
    public List<SearchHistory> searchWords() {
        return searchHistoryMapper.searchHistory();
    }

    @Override
    public void updateSearchWords(String words) {
        boolean isExist = searchHistoryMapper.isWordsExist(words);
        if (isExist){
            searchHistoryMapper.updateSearchWordsNum(words);
        }else {
            SearchHistory searchHistory = new SearchHistory(UUID.randomUUID().toString().replace("-", ""), words, 1, new Date());
            searchHistoryMapper.addSearchHistory(searchHistory);
        }
    }
}
