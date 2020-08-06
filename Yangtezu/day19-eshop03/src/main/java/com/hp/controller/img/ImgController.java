package com.hp.controller.img;

import com.hp.utils.CodeUtil;
import com.sun.deploy.net.HttpResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

    @RequestMapping("/code")
    @ResponseBody
    public void code(HttpSession session, HttpServletResponse response){
        //响应验证码
        try {
            String code = CodeUtil.generateCodeAndPic(response.getOutputStream());
            session.setAttribute("code1",code);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
