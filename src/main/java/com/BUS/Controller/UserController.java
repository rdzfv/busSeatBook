package com.BUS.Controller;

import com.BUS.Service.BusService;
import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.Service.UserService;
import com.BUS.Service.model.UserModifiModel;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import com.BUS.response.CommonReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
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

@Controller("user")
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class UserController extends baseController{
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    // 用户登录接口
    @RequestMapping(value = "/login")
    @ResponseBody
    public CommonReturnType login(@RequestParam(name = "username")String username,
                                  @RequestParam(name = "password")String password
    )throws BusinessException{
        System.out.println("进入登录口");
        //打印接受的数据
        System.out.println(username);
        System.out.println(password);
        //用户的注册流程
        UserLoginModel userLoginModel = new UserLoginModel();
        userLoginModel.setUsername(username);
        userLoginModel.setPassword(password);
        UserLoginModel userLoginModel1 = userService.login(userLoginModel);
        return CommonReturnType.create(userLoginModel1);
    }

    // 用户修改密码接口
    @RequestMapping(value = "/modifiPSW")
    @ResponseBody
    public CommonReturnType modifiPSW(@RequestParam(name = "username")String username,
                                      @RequestParam(name = "prePassword")String prePassword,
                                      @RequestParam(name = "newPassword")String newPassword,
                                      @RequestParam(name = "rePassword")String rePassword
    )throws BusinessException{
        System.out.println("进入修改密码接口 ");
        //打印接受的数据
        System.out.println(username);
        System.out.println(prePassword);
        System.out.println(newPassword);
        System.out.println(rePassword);
        //用户的注册流程
        UserModifiModel userModifiModel = new UserModifiModel();
        userModifiModel.setUsername(username);
        userModifiModel.setPrePassword(prePassword);
        userModifiModel.setNewPassword(newPassword);
        userModifiModel.setRePassword(rePassword);
        int status = userService.modifiPSW(userModifiModel);
        return CommonReturnType.create(status);
    }

    // 用户提交意见或举报接口
    @RequestMapping(value = "/pushResponse")
    @ResponseBody
    public CommonReturnType pushResponse(@RequestParam(name = "content")String content)throws BusinessException{
        System.out.println("进入用户提交意见或举报接口");
        //打印接受的数据
        System.out.println(content);
        //用户提交意见或举报流程
        int status = userService.pushResponse(content);
        return CommonReturnType.create(status);
    }

    // 更新司机位置接口
//    date  busNo  driverId  routeId
    @RequestMapping(value = "/updateDriverLocation",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType updateDriverLocation(
            @RequestParam(name = "latitude")float latitude,
            @RequestParam(name = "longitude")float longitude,
            @RequestParam(name = "date")String date,
            @RequestParam(name = "busNo")String busNo,
            @RequestParam(name = "driverId")String driverId,
            @RequestParam(name = "routeId")String routeId
    )throws BusinessException{
        System.out.println("进入更新司机位置接口");
        // 更改时间数据
        date = date + " 00:00:00";
        busNo = busNo.substring(1);
        //打印接受的数据
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(date);
        System.out.println(busNo);
        System.out.println(driverId);
        System.out.println(routeId);

        int status = userService.updateDriverLocation(latitude,longitude,date,busNo,driverId,routeId);
        return CommonReturnType.create(status);
    }

//    // 获取token
//    @RequestMapping(value = "/getAccessToken")
//    @ResponseBody
//    public CommonReturnType getAccessToken()throws BusinessException{
//        // 微信小程序ID
//        String appId = "wxc80f6fe4d1258003";
//        // 微信小程序密钥
//        String secret = "ad2f6047ea4b52711266e36e0ac85b21";
//        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appId + "&secret=" + secret;
//        String str = WechatUtil.httpRequest(url, "get", null);
//        JSONObject jsonObject = JSONObject.parseObject(str);
//        String accessToken = jsonObject.get("access_token").toString();
//        return CommonReturnType.create(accessToken);
//    }
}
