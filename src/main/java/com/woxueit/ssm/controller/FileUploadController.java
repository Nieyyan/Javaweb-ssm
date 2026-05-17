package com.woxueit.ssm.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileUploadController {

    // 单文件上传的API：/file/upload，变量名：file
    @PostMapping("/upload")
    public Object fileUpload(@RequestParam("file") MultipartFile file,
                             HttpServletRequest request) throws IOException {
        //定义返回结果
        Map<String, Object> result = new HashMap<String, Object>();

        //如果文件为空
        if (file.isEmpty()) {
            result.put("code", 500);
            result.put("message", "请选择文件！");
            return result;
        }

        //如果文件不为空
        // 上传路径/文件夹
        String realPath = request.getServletContext().getRealPath("/statics/upload/");// /静态资源目录/上传目录
        File path = new File(realPath);
        if (!path.exists()) {//如果文件夹不存在
            path.mkdirs();//就创建文件夹
        }

        // 个人简历.pdf---张三，先上传
        // 个人简历.pdf---李四，后上传，如果不改文件默认名字，那么就会产生覆盖
        // 唯一文件名       uuid + 文件扩展名
        //                uuid：UUID是全球唯一，uuid:version1 基于时间的UUID，通过计算当前时间戳、随机数和机器MAC地址得到。
        //                                         获取原始文件名(xxx.yyy.png).截取(最后一个.号之后的内容)
        String fileName = UUID.randomUUID() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        // 上传
        file.transferTo(new File(path, fileName));

        //上传成功
        result.put("code", 200);
        result.put("message", "上传成功！"+fileName);
        return result;
    }

    // 多文件上传的API：/file/uploadBatch，变量名：files
    @PostMapping("/uploadBatch")
    public Object fileUpload(@RequestParam("files") MultipartFile[] files,
                             HttpServletRequest request) throws IOException {
        //定义返回结果
        Map<String, Object> result = new HashMap<String, Object>();
        //如果文件为空
        if (files==null || files.length == 0) {
            result.put("code", 500);
            result.put("message", "请选择文件！");
            return result;
        }

        //如果文件不为空
        for (MultipartFile file : files) {
            // 上传路径/文件夹
            String realPath = request.getServletContext().getRealPath("/statics/upload/");// /静态资源目录/上传目录
            File path = new File(realPath);
            if (!path.exists()) {//如果文件夹不存在
                path.mkdirs();//就创建文件夹
            }

            String fileName = UUID.randomUUID() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

            // 上传
            file.transferTo(new File(path, fileName));
        }

        //上传成功
        result.put("code", 200);
        result.put("message", "上传成功！");
        return result;
    }
}

