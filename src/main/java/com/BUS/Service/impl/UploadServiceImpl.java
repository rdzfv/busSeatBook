package com.BUS.Service.impl;

import com.BUS.Dao.LAFDOMapper;
import com.BUS.Service.UploadService;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.dataObject.LAFDO;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UploadServiceImpl implements UploadService {
    @Autowired(required = false)
    private LAFDOMapper lafdoMapper;

    @Override
    public String upload(String localPath) throws BusinessException {
        String relativePath = "";
//        if (localPath == null || "".equals(localPath)){
//            System.out.println("路径错误");
//            throw new BusinessException(EnumBusinessError.PATH_NOT_VALID);
//        }
//        CommonsMultipartFile faultImage = null;
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//        if (multipartResolver.isMultipart(request)){
//            MultipartHttpServletRequest httpServletRequest = (MultipartHttpServletRequest) request;
//            faultImage = (CommonsMultipartFile) httpServletRequest.getFile("file");
//        }
//        filesService.save(msg,faultImage);

        return relativePath;
    }

    @Override
    public int uploadForm(InquireLAFResponse inquireLAFResponse) throws BusinessException {
        int status = 99;
        // 判空处理
        if(inquireLAFResponse == null){
            System.out.println("userLoginModel为null");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        if(StringUtils.isEmpty(inquireLAFResponse.getName())
                ||StringUtils.isEmpty(inquireLAFResponse.getDescription())
                ||StringUtils.isEmpty(inquireLAFResponse.getPicurl())
                ||StringUtils.isEmpty(inquireLAFResponse.getTel())
                ||inquireLAFResponse.getReleasetime() == null
                ||StringUtils.isEmpty(inquireLAFResponse.getUserid())
        ){
            System.out.println("参数不全");
            System.out.println(inquireLAFResponse.getName());
            System.out.println(inquireLAFResponse.getDescription());
            System.out.println(inquireLAFResponse.getPicurl());
            System.out.println(inquireLAFResponse.getTel());
            System.out.println(inquireLAFResponse.getUserid());
            System.out.println(inquireLAFResponse.getReleasetime());
            System.out.println(inquireLAFResponse.getLaftype());
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        System.out.println("参数通过验证");
        // 新建DO,赋值
        LAFDO lafdo =new LAFDO();
        lafdo.setName(inquireLAFResponse.getName());
        lafdo.setDescription(inquireLAFResponse.getDescription());
        lafdo.setReleasetime(inquireLAFResponse.getReleasetime());
        lafdo.setTel(inquireLAFResponse.getTel());
        lafdo.setPicurl(inquireLAFResponse.getPicurl());
        lafdo.setLaftype(inquireLAFResponse.getLaftype());
        lafdo.setUserid(inquireLAFResponse.getUserid());
        // 数据库操作
        status = lafdoMapper.insert(lafdo);
        return status;
    }
}
