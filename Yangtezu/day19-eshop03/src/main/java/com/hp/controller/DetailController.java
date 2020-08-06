package com.hp.controller;

import com.hp.domain.Product;
import com.hp.domain.ProductType;
import com.hp.domain.SearchHistory;
import com.hp.service.IProductService;
import com.hp.service.IProductTypeService;
import com.hp.service.ISearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/front/product_detail")
@Controller
public class DetailController {
    @Autowired
    private ISearchHistoryService searchHistoryService;
    @Autowired
    private IProductTypeService productTypeService;
    @Autowired
    private IProductService productService;

    @RequestMapping("/productDetail")
    public String detail(String id, Model model){

        //查询搜索热词
        List<SearchHistory> searchHistorys = searchHistoryService.searchWords();
        model.addAttribute("searchHistorys",searchHistorys);
        System.out.println(searchHistorys);

        //查询所有商品分类
        List<ProductType> allProductTypes = productTypeService.selectAll();
        model.addAttribute("allProductTypes",allProductTypes);
        System.out.println(allProductTypes);

        //查询商品详情
        Product product = productService.selectProductById(id);
        model.addAttribute("product",product);
        System.out.println(product);

        //查询同类型的商品
        List<Product> list = productService.selectProductByType(product.getProductType().getId(), null, null);
        model.addAttribute("list",list);
        System.out.println(list);


        return "type/product_detail";

    }
}
