package com.hp.controller;

import com.hp.domain.Carousel;
import com.hp.domain.Product;
import com.hp.domain.ProductType;
import com.hp.domain.SearchHistory;
import com.hp.service.ICarouselService;
import com.hp.service.IProductService;
import com.hp.service.IProductTypeService;
import com.hp.service.ISearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/front")
public class IndexController {

    @Autowired
    private ISearchHistoryService searchHistoryService;
    @Autowired
    private IProductTypeService productTypeService;
    @Autowired
    private ICarouselService carouselService;
    @Autowired
    private IProductService productService;


    @RequestMapping("/index")
    public String index(Model model){

        //1、查找历史记录表
        selectHistoryWords(model);

        //2、查找商品类型表
        selectProductType(model);

        //3、查找所有轮播图
        selectCarousel(model);

        //4、查询新品
        selectNewProduct(model);

        //5、查询排行榜
        selectRanking(model);

        //6、根据类型名称查询商品
        selectProductByTypeName("全球进口",model,12,"list");
        selectProductByTypeName("服装服饰",model,6,"list2");
        selectProductByTypeName("护肤美妆",model,5,"list3");
        selectProductByTypeName("图书学习",model,8,"list4");



        return "index/index";
    }

    private void selectProductByTypeName(String typeName, Model model,int num,String attribute) {
        List<Product> list = productService.selectByTypeName(typeName,num);
        model.addAttribute(attribute,list);
        System.out.println(list);
    }


    private void selectHistoryWords(Model model) {
        List<SearchHistory> searchHistorys = searchHistoryService.searchWords();
        model.addAttribute("searchHistorys",searchHistorys);
        System.out.println(searchHistorys);
    }

    private void selectProductType(Model model) {
        List<ProductType> allProductTypes = productTypeService.selectAll();
        model.addAttribute("allProductTypes",allProductTypes);
        System.out.println(allProductTypes);
    }

    private void selectCarousel(Model model) {
        List<Carousel> allcarouselFigures = carouselService.selectAll();
        model.addAttribute("allcarouselFigures",allcarouselFigures);
        System.out.println(allcarouselFigures);
    }

    private void selectNewProduct(Model model) {
        List<Product> newProducts = productService.newProduct();
        model.addAttribute("newProducts",newProducts);
        System.out.println(newProducts);
    }

    private void selectRanking(Model model) {
        //rankings
        List<Product> rankings = productService.rank();
        model.addAttribute("rankings",rankings);
        System.out.println(rankings);
    }



}
