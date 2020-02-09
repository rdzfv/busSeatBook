package com.BUS.Controller;

import com.BUS.Service.BusService;
import com.BUS.Service.DriverService;
import com.BUS.Service.LAFService;
import com.BUS.Service.model.*;
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

@Controller("Driver")
@RequestMapping("/Driver")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class DriverController extends baseController{
    @Autowired
    private DriverService driverService;
    @Autowired
    private HttpServletRequest httpServletRequest;


//    busNo date routeId driverId
    // 获取乘客下车信息
    @RequestMapping(value = "/getDropOffDeteil",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType getDropOffDeteil(
            @RequestParam(name = "busNo")String busNo,
            @RequestParam(name = "date")String date,
            @RequestParam(name = "routeId")String routeId,
            @RequestParam(name = "driverId")String driverId
    )throws BusinessException{
        System.out.println("进入获取乘客下车信息接口");
        date = date + " 00:00:00";
        // 查询流程
        ArrayList<DropOffModel> dropOffModels = driverService.getDropOffDeteil(busNo,date,routeId,driverId);
        return CommonReturnType.create(dropOffModels);
    }

    // 结束行程
    @RequestMapping(value = "/end",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType end(
            @RequestParam(name = "busNo")String busNo,
            @RequestParam(name = "date")String date,
            @RequestParam(name = "routeId")String routeId,
            @RequestParam(name = "driverId")String driverId
    )throws BusinessException{
        System.out.println("进入获取乘客下车信息接口");
        date = date + " 00:00:00";
        busNo = busNo.substring(1);
        // 查询流程
        System.out.println(busNo);
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(driverId);
        int status = driverService.end(busNo,date,routeId,driverId);
        return CommonReturnType.create(status);
    }
}