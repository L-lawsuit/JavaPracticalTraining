package com.hp.controller;

import com.hp.domain.Brand;
import com.hp.domain.Product;
import com.hp.domain.ProductType;
import com.hp.domain.SearchHistory;
import com.hp.service.IBrandService;
import com.hp.service.IProductService;
import com.hp.service.IProductTypeService;
import com.hp.service.ISearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/front/productType")
@Controller
public class TypeController {
    @Autowired
    private ISearchHistoryService searchHistoryService;
    @Autowired
    private IProductTypeService productTypeService;
    @Autowired
    private IBrandService brandService;
    @Autowired
    private IProductService productService;


    @RequestMapping("/index")
    public String index(String type,String words ,String brands, Model model){

        model.addAttribute("words",words);
        model.addAttribute("brands",brands);


        //查询热搜词
        List<SearchHistory> searchHistorys = searchHistoryService.searchWords();
        model.addAttribute("searchHistorys",searchHistorys);
        System.out.println(searchHistorys);

        //查询所有商品类型
        List<ProductType> allProductTypes = productTypeService.selectAll();
        model.addAttribute("allProductTypes",allProductTypes);
        System.out.println(allProductTypes);

        //查询当前类型分类信息
        ProductType productType2 = productTypeService.selectProductTypeByTypeId(type);
        model.addAttribute("productType2",productType2);
        System.out.println(productType2);

        //查询当前类型分类下的所有品牌
        List<Brand> listBrand = brandService.selectBrandByTypeId(type);
        model.addAttribute("listBrand",listBrand);
        System.out.println(listBrand);

        //更新搜索词
        if (words != null && words.length() > 0){
            searchHistoryService.updateSearchWords(words);
        }


        //查询类型、品牌、关键字对应的商品
        List<Product> datas = productService.selectProductByType(type,brands,words);
        model.addAttribute("datas",datas);
        System.out.println(datas);



        return "type/product_type";
    }
}
