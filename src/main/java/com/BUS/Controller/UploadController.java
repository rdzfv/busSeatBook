package com.BUS.Controller;


import com.BUS.Service.LAFService;
import com.BUS.Service.UploadService;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.error.BusinessException;
import com.BUS.response.CommonReturnType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Controller("upload")
@RequestMapping("/upload")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class UploadController extends baseController{
    @Autowired
    private UploadService uploadService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "/uploadFile")
    @ResponseBody
    public CommonReturnType uploadSubmit(HttpServletRequest request,@RequestParam("upfile")MultipartFile[] files) throws BusinessException {
        // 输出接受的参数
        System.out.println("打印接受的file参数"+files[0]);
        System.out.println("打印request为"+request);
        String realPath = "C:\\Users\\admin\\WeChatProjects\\book\\images\\updatePic";
        String realPath2 = "/images/updatePic/";
        String fileName = "";
        //使用Apache文件上传组件处理文件上传步骤：
        //1、创建一个DiskFileItemFactory工厂
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        //2、创建一个文件上传解析器
        ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
        //解决上传文件名的中文乱码
        fileUpload.setHeaderEncoding("UTF-8");
        //3、判断提交上来的数据是否是上传表单的数据
        if(!fileUpload.isMultipartContent(request)){
            //按照传统方式获取数据
            return CommonReturnType.create("获取失败");
        }
        //4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
        try {
//            List<FileItem> list = fileUpload.parseRequest(request);
            fileName = files[0].getOriginalFilename();
            System.out.println(fileName);
            System.out.println("文件名是："+fileName);
                //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
                //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
            fileName = fileName.substring(fileName.lastIndexOf(File.separator) + 1);
            System.out.println("文件名是："+fileName);
            try {
                FileOutputStream fos = new FileOutputStream(realPath + File.separator + fileName);
                System.out.println("新建的文件流fos是"+fos);
                //获取item中的上传文件的输入流
                InputStream is = files[0].getInputStream();
                //创建一个缓冲区
                byte buffer[] = new byte[1024];
                //判断输入流中的数据是否已经读完的标识
                int length = 0;
                //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
                while ((length = is.read(buffer)) > 0) {
                    //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
                    fos.write(buffer, 0, length);
                }
                //关闭输入流
                is.close();
                //关闭输出流
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        String[] myPath = new String[2];
        myPath[0] = realPath + File.separator + fileName;
        myPath[1] = realPath2 + File.separator + fileName;
        return CommonReturnType.create(myPath);
    }



    @RequestMapping(value = "/upload",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType upload(@RequestParam("name")String name,
                                   @RequestParam("description")String description,
                                   @RequestParam("date")String datedate,
                                   @RequestParam("tel")String tel,
                                   @RequestParam("picUrl")String picUrl,
                                   @RequestParam("lafType")int lafType,
                                   @RequestParam("userId")String userId
                                   ) throws BusinessException {
        // 输出接受的参数
        System.out.println(name);
        System.out.println(description);
        System.out.println(datedate);
        System.out.println(tel);
        // 进入service
        InquireLAFResponse inquireLAFResponse = new InquireLAFResponse();
        try{
            inquireLAFResponse.setName(name);
            inquireLAFResponse.setDescription(description);
            SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
            Date date = sdf.parse(datedate);
            inquireLAFResponse.setReleasetime(date);
            inquireLAFResponse.setPicurl(picUrl);
            inquireLAFResponse.setLaftype(lafType);
            inquireLAFResponse.setUserid(userId);
            inquireLAFResponse.setTel(tel);
        }catch (Exception e){
            System.out.println(e);
        }
        int status = uploadService.uploadForm(inquireLAFResponse);
        return CommonReturnType.create(status);
    }
}
