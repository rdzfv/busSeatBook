package com.BUS.Controller;

import com.BUS.Service.SeatService;
import com.BUS.Service.UploadService;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.Service.model.InquireMyOrder;
import com.BUS.Service.model.MySeatBookModel;
import com.BUS.Service.model.SeatBookModel;
import com.BUS.error.BusinessException;
import com.BUS.response.CommonReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller("seat")
@RequestMapping("/seat")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class seatController extends baseController {
    @Autowired
    private SeatService seatService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "/inquire",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
//    @RequestMapping(value = "/inquire")
    @ResponseBody
    public CommonReturnType upload(@RequestParam("date")String date,
                                   @RequestParam("routeId")String routeId,
                                   @RequestParam("busId")String busId
    ) throws BusinessException {
        System.out.println("进入定座查询接口");
        // 输出接受的参数
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(busId);
        // 载入数据
        SeatBookModel seatBookModel = new SeatBookModel();
        seatBookModel.setDate(date+" 00:00:00");
        seatBookModel.setBusid(busId);
        seatBookModel.setRouteid(routeId);
        // 进入service
        SeatBookModel seatBookModel1 = new SeatBookModel();
        try {
            seatBookModel1 = seatService.inquireBookSeat(seatBookModel);
        }catch (Exception e){
            System.out.println(e);
        }
        return CommonReturnType.create(seatBookModel1);
    }


    @RequestMapping(value = "/bookSeat",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType bookSeat(@RequestParam("date")String date,
                                     @RequestParam("routeId")String routeId,
                                     @RequestParam("busId")String busId,
                                     @RequestParam("afterOp")String afterOp,
                                     @RequestParam("startPlace")String startPlace,
                                     @RequestParam("targetPlace")String targetPlace
    ) throws BusinessException {
        System.out.println("进入定座接口");
        // 输出接受的参数
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(busId);
        System.out.println(afterOp);
        System.out.println(startPlace);
        System.out.println(targetPlace);
        // 载入数据
        SeatBookModel seatBookModel = new SeatBookModel();
        seatBookModel.setDate(date);
        seatBookModel.setBusid(busId);
        seatBookModel.setRouteid(routeId);
        seatBookModel.setSeatstring(afterOp);
        seatBookModel.setStartplace(startPlace);
        seatBookModel.setTargetplace(targetPlace);
        // 进入service
        int status = 0;
        status = seatService.pullBookSeat(seatBookModel);
        return CommonReturnType.create(status);
    }

    @RequestMapping(value = "/bookMySeat",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType bookMySeat(@RequestParam("date")String date,
                                       @RequestParam("routeId")String routeId,
                                       @RequestParam("busId")String busId,
                                       @RequestParam("afterOp")String afterOp,
                                       @RequestParam("userId")String userId,
                                       @RequestParam("startPlace")String startPlace,
                                       @RequestParam("targetPlace")String targetPlace
    ) throws BusinessException {
        System.out.println("进入我的定座接口");
        // 输出接受的参数
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(busId);
        System.out.println(afterOp);
        System.out.println(userId);
        System.out.println(startPlace);
        System.out.println(targetPlace);
        // 载入数据
        MySeatBookModel mySeatBookModel = new MySeatBookModel();
        mySeatBookModel.setDate(date);
        mySeatBookModel.setBusno(busId);
        mySeatBookModel.setRouteid(routeId);
        //seatBookModel.setSeatstring(afterOp);
        mySeatBookModel.setSeat(afterOp);
        mySeatBookModel.setUserid(userId);
        mySeatBookModel.setStatus(1);
        mySeatBookModel.setStartplace(startPlace);
        mySeatBookModel.setTargetplace(targetPlace);
        // 进入service
        int status = 0;
        status = seatService.pullMyBookSeat(mySeatBookModel);
        return CommonReturnType.create(status);
    }

    @RequestMapping(value = "/inquireMySeat",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType inquireMySeat(@RequestParam("date")String date,
                                          @RequestParam("routeId")String routeId,
                                          @RequestParam("busId")String busId,
                                          @RequestParam("userId")String userId
    ) throws BusinessException {
        System.out.println("进入查询我的定座接口");
        // 输出接受的参数
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(busId);
        System.out.println(userId);
        // 载入数据
        MySeatBookModel mySeatBookModel = new MySeatBookModel();
        mySeatBookModel.setDate(date);
        mySeatBookModel.setBusno(busId);
        mySeatBookModel.setRouteid(routeId);
        mySeatBookModel.setUserid(userId);
        // 进入service
        MySeatBookModel mySeatBookModel1 = seatService.getMyBookSeat(mySeatBookModel);
        return CommonReturnType.create(mySeatBookModel1);
    }

    @RequestMapping(value = "/cancelMySeat",method = {RequestMethod.POST},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonReturnType cancelMySeat(@RequestParam("date")String date,
                                         @RequestParam("routeId")String routeId,
                                         @RequestParam("busId")String busId,
                                         @RequestParam("userId")String userId,
                                         @RequestParam("afterOp")String afterOp,
                                         @RequestParam("startPlace")String startPlace,
                                         @RequestParam("targetPlace")String targetPlace
    ) throws BusinessException {
        System.out.println("进入取消我的定座接口");
        // 输出接受的参数
        System.out.println(date);
        System.out.println(routeId);
        System.out.println(busId);
        System.out.println(userId);
        System.out.println(afterOp);
        // 载入数据
        MySeatBookModel mySeatBookModel = new MySeatBookModel();
        mySeatBookModel.setDate(date);
        mySeatBookModel.setBusno(busId);
        mySeatBookModel.setRouteid(routeId);
        mySeatBookModel.setUserid(userId);
        mySeatBookModel.setSeat(afterOp);

        SeatBookModel seatBookModel = new SeatBookModel();
        seatBookModel.setDate(date);
        seatBookModel.setBusid(busId);
        seatBookModel.setRouteid(routeId);
        seatBookModel.setSeatstring(afterOp);
        seatBookModel.setStartplace(startPlace);
        seatBookModel.setTargetplace(targetPlace);
        int status = 0;
        // 进入取消我的订座service
        status = seatService.cancelMyBookSeat(mySeatBookModel);
        // 进入修改订座service
        status = seatService.pullBookSeat(seatBookModel);
        return CommonReturnType.create(status);
    }

    @RequestMapping(value = "/inquireMyOrders")
    @ResponseBody
    public CommonReturnType inquireMyOrders(@RequestParam("userId")String userId
    ) throws BusinessException {
        System.out.println("进入查询我的订单接口");
        // 输出接受的参数
        System.out.println(userId);
        // 进入service
        ArrayList<InquireMyOrder> inquireMyOrders = seatService.getMyOrders(userId);
        return CommonReturnType.create(inquireMyOrders);
    }
}
