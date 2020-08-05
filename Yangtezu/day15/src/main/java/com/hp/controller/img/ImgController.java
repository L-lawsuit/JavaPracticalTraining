package com.hp.controller.img;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RequestMapping("/common")
@Controller
public class ImgController {

    @RequestMapping("/getImage")
    @ResponseBody
    public void getImage(String image, HttpServletResponse response){


        ClassPathResource classPathResource = new ClassPathResource("eshop/" + image);
        try {
            File file = classPathResource.getFile();
            if (file.exists()){
                FileInputStream fileInputStream = new FileInputStream(file);
                ServletOutputStream outputStream = response.getOutputStream();
                IOUtils.copy(fileInputStream,outputStream);
            }else {
                response.setStatus(404);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
