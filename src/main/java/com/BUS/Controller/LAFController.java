package com.BUS.Controller;

import com.BUS.Service.BusService;
import com.BUS.Service.LAFService;
import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.Service.UserService;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import com.BUS.response.CommonReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller("LAF")
@RequestMapping("/LAF")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class LAFController extends baseController{
    @Autowired
    private LAFService lafService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    // 查询总失物招领记录
    @RequestMapping(value = "/inquireLAF")
    @ResponseBody
    public CommonReturnType inquireLAF()throws BusinessException{
        System.out.println("进入查询失物招领接口");
        //查询流程
        ArrayList<InquireLAFResponse> inquireLAFResponses = lafService.inquireLAFs();
        return CommonReturnType.create(inquireLAFResponses);
    }

    // 查询用户个人失物招领记录
    @RequestMapping(value = "/inquireMyLAF")
    @ResponseBody
    public CommonReturnType inquireMyLAF(@RequestParam(name = "username")String username)throws BusinessException{
        System.out.println("进入查询用户个人失物招领接口");
        //查询流程
        ArrayList<InquireLAFResponse> inquireLAFResponses = lafService.inquireMyLAFs(username);
        return CommonReturnType.create(inquireLAFResponses);
    }

    // 修改用户个人失物招领记录状态
    @RequestMapping(value = "/TagLAFAlready")
    @ResponseBody
    public CommonReturnType TagLAFAlready(@RequestParam(name = "id")int id)throws BusinessException{
        System.out.println("修改用户个人失物招领记录状态");
        //查询流程
        int status = lafService.TagLAFAlready(id);
        return CommonReturnType.create(status);
    }
}
