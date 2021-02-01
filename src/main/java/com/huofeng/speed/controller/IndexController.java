package com.huofeng.speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linchong
 * @date 2021/2/1 14:44
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/start")
    public String start(){
        return "start";
    }

    @GetMapping("/getCurrList")
    @ResponseBody
    public String getCurrList(){
        return "success";
    }


    @GetMapping("filedown")
    public void filedown(HttpServletRequest request, HttpServletResponse resp) throws IOException {
//        resp.setCharacterEncoding("utf-8");
//        resp.setContentType("application/json; charset=utf-8");
//        PrintWriter writer = resp.getWriter();
//        Map<String, String> map = new HashMap<>();
//        map.put("status", "success");
//        writer.write(map.toString());
//
//        request.getHeader("")
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;

        URL url = new URL("http://1.199.16.253:8085/backup/xld.apk");

        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("d:/xld.apk");

            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
