package com.BUS.Controller;

import com.BUS.Service.BusService;
import com.BUS.Service.SeatService;
import com.BUS.Service.model.*;
import com.BUS.Service.UserService;
import com.BUS.dataObject.SeatsbookdetailDO;
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

@Controller("route")
@RequestMapping("/route")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class RouteController extends baseController{
    @Autowired
    private BusService busService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private HttpServletRequest httpServletRequest;
    //查询车次接口
    @RequestMapping(value = "/inquireBus",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType inquireBus(@RequestParam(name = "date")String date,
                                       @RequestParam(name = "startTime")String startTime,
                                       @RequestParam(name = "userStartPlace")String userStartPlace,
                                       @RequestParam(name = "targetPlace")String targetPlace,
                                       @RequestParam(name = "dateType")int dateType
    )throws BusinessException{
        System.out.println("进入查询接口");
        // 打印接受的数据
        System.out.println(date);
        System.out.println(startTime);
        System.out.println(userStartPlace);
        System.out.println(targetPlace);
        // 取出数据
        UserInquireBusModel userInquireBusModel = new UserInquireBusModel();
        userInquireBusModel.setDate(date);
        userInquireBusModel.setStartTime(startTime);
        userInquireBusModel.setStartPlace(userStartPlace);
        userInquireBusModel.setTargetPlace(targetPlace);
        userInquireBusModel.setDateType(dateType);
        // 查询业务
        ArrayList<InquireBusResponse> inquireBusResponses = busService.inquireBus(userInquireBusModel);
        return CommonReturnType.create(inquireBusResponses);
    }

    //检查busNo、driverId、date、routeId是否存在对应记录
    @RequestMapping(value = "/checkBusBybusNoAnddriverIdAnddateAndrouteId")
    @ResponseBody
    public CommonReturnType checkBusBybusNoAnddriverIdAnddateAndrouteId(
            @RequestParam(name = "date")String date,
            @RequestParam(name = "busNo")String busNo,
            @RequestParam(name = "driverId")String driverId,
            @RequestParam(name = "routeId")String routeId
    )throws BusinessException {
        System.out.println("进入检查busNo、driverId、date、routeId是否存在对应记录接口");
        // 打印数据
        System.out.println(date);
        System.out.println(busNo);
        System.out.println(driverId);
        System.out.println(routeId);
        // 取出数据
        DriverBoundRes driverBoundRes = new DriverBoundRes();
        driverBoundRes.setDate(date);
        driverBoundRes.setBusno(busNo);
        driverBoundRes.setDriverid(driverId);
        driverBoundRes.setRouteid(routeId);
        // 查询业务
        ArrayList<DriverBoundRes> driverBoundRes1 = seatService.checkBusBybusNoAnddriverIdAnddateAndrouteId(driverBoundRes);
        return CommonReturnType.create(driverBoundRes1);
    }

    //查询车次接口
    @RequestMapping(value = "/inquireAllBus")
    @ResponseBody
    public CommonReturnType inquireAllBus()throws BusinessException {
        System.out.println("进入查询全部接口");
        // 查询业务
        ArrayList<InquireBusResponse> inquireBusResponses = busService.inquireAllBus();
        return CommonReturnType.create(inquireBusResponses);
    }

    //根据routeNo查询所有经停点
    @RequestMapping(value = "/inquireAllFinalPlaceByRouteId")
    @ResponseBody
    public CommonReturnType inquireAllFinalPlaceByRouteId(
            @RequestParam(name = "routeNo")String routeNo
    )throws BusinessException {
        System.out.println("进入根据routeNo查询所有经停点接口");
        // 查询业务
        ArrayList<String> dropOffModels = busService.inquireAllPlaceByRouteId(routeNo);
        return CommonReturnType.create(dropOffModels);
    }
}
