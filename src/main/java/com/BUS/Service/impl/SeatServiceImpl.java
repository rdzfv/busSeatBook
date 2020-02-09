package com.BUS.Service.impl;

import com.BUS.Dao.LAFDOMapper;
import com.BUS.Dao.RouteDOMapper;
import com.BUS.Dao.SeatsbookdetailDOMapper;
import com.BUS.Dao.UserOrderDOMapper;
import com.BUS.Service.SeatService;
import com.BUS.Service.model.DriverBoundRes;
import com.BUS.Service.model.InquireMyOrder;
import com.BUS.Service.model.MySeatBookModel;
import com.BUS.Service.model.SeatBookModel;
import com.BUS.dataObject.SeatsbookdetailDO;
import com.BUS.dataObject.UserOrderDO;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired(required = false)
    private SeatsbookdetailDOMapper seatsbookdetailDOMapper;
    @Autowired(required = false)
    private UserOrderDOMapper userOrderDOMapper;
    @Autowired(required = false)
    private RouteDOMapper routeDOMapper;



    @Override
    public SeatBookModel inquireBookSeat(SeatBookModel seatBookModel) throws BusinessException {
        // 取出数据
        String date = seatBookModel.getDate();
        String busId = seatBookModel.getBusid();
        String routeId = seatBookModel.getRouteid();
        // 查询业务
        SeatBookModel seatBookModel1 = seatsbookdetailDOMapper.selectByDateAndBusNoAndRouteId(date,routeId,busId);
        // 输出获得数据
        System.out.println(seatBookModel1);
        System.out.println(seatBookModel1.getDate());
        return seatBookModel1;
    }

    @Override
    public int pullBookSeat(SeatBookModel seatBookModel) throws BusinessException {
        System.out.println("进入订座service");
        int status = 0;
        // 取出数据和载入数据
        String date = seatBookModel.getDate();
        String busno = seatBookModel.getBusid();
        String routeid = seatBookModel.getRouteid();
        String detail = seatBookModel.getSeatstring();
        // 数据库操作
        status = seatsbookdetailDOMapper.updateBySeatsbookdetail(date,busno,routeid,detail);
        if(status == 0){
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        return status;
    }

    @Override
    public int pullMyBookSeat(MySeatBookModel myseatBookModel) throws BusinessException {
        System.out.println("进入我的订座service");
        int status = 0;
        // 取出数据和载入数据
        String date = myseatBookModel.getDate();
        System.out.println(date);
        String busno = myseatBookModel.getBusno();
        System.out.println(busno);
        String routeid = myseatBookModel.getRouteid();
        System.out.println(routeid);
        String detail = myseatBookModel.getSeat();
        System.out.println(detail);
        String userid = myseatBookModel.getUserid();
        System.out.println(userid);
        int status0 = myseatBookModel.getStatus();
        System.out.println(status0);
        String startPlace = myseatBookModel.getStartplace();
        System.out.println(startPlace);
        String targetPlace = myseatBookModel.getTargetplace();
        System.out.println(targetPlace);

        // 查询此用户之前有否此订单
        MySeatBookModel mySeatBookModel = userOrderDOMapper.select(date,busno,routeid,userid);
        if(mySeatBookModel == null){
            System.out.println("此前没有此订单");
            // 插入记录
            status = userOrderDOMapper.insert(date,busno,routeid,detail,userid,status0,startPlace,targetPlace);
        }else {
            // 修改记录
            status = userOrderDOMapper.updateMyBySeatsbookdetail(date, busno, routeid, detail, userid, status0);
        }
        if(status == 0){
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        return status;
    }

    @Override
    public MySeatBookModel getMyBookSeat(MySeatBookModel myseatBookModel) throws BusinessException {
        System.out.println("进入查询我的订座service");
        // 取出数据和载入数据
        String date = myseatBookModel.getDate();
        String busno = myseatBookModel.getBusno();
        String routeid = myseatBookModel.getRouteid();
        String username = myseatBookModel.getUserid();
        // 数据库操作
        MySeatBookModel mySeatBookModel1 = userOrderDOMapper.select(date,busno,routeid,username);
        if(mySeatBookModel1 == null){
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        return mySeatBookModel1;
    }

    @Override
    public int cancelMyBookSeat(MySeatBookModel myseatBookModel) throws BusinessException {
        int status = 0;
        // 取出数据
        String date = myseatBookModel.getDate();
        String busno = myseatBookModel.getBusno();
        String routeid = myseatBookModel.getRouteid();
        String username = myseatBookModel.getUserid();
        // 数据库操作
        status = userOrderDOMapper.cancelMyBookSeat(date,busno,routeid,username);
        if(status == 0){
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        return status;
    }

    @Override
    public ArrayList<InquireMyOrder> getMyOrders(String username) throws BusinessException {
        ArrayList<InquireMyOrder> inquireMyOrders = new ArrayList<InquireMyOrder>();
        // 数据库操作
        ArrayList<MySeatBookModel> mySeatBookModels = userOrderDOMapper.getMyOrders(username);
        // 取出routrid
        for(int i = 0;i < mySeatBookModels.size();i++){
            String date = mySeatBookModels.get(i).getDate();
            int status = mySeatBookModels.get(i).getStatus();
            String busNo = mySeatBookModels.get(i).getBusno();
            String routeId = mySeatBookModels.get(i).getRouteid();
            InquireMyOrder inquireMyOrder = new InquireMyOrder();
            inquireMyOrder.setDate(date);
            inquireMyOrder.setStatus(status);
            inquireMyOrder.setBusno(busNo);
            inquireMyOrder.setRouteid(routeId);
            // 通过routeId查询发车时间、起点站、终点站
            InquireMyOrder inquireMyOrder1 = routeDOMapper.inquireRoute(routeId);
            inquireMyOrder1.setBusno(busNo);
            inquireMyOrder1.setDate(date);
            inquireMyOrder1.setStatus(status);
            inquireMyOrder1.setBusno(busNo);
            inquireMyOrder1.setRouteid(routeId);
            // 添加记录
            inquireMyOrders.add(inquireMyOrder1);
        }
        return inquireMyOrders;
    }

    @Override
    public ArrayList<DriverBoundRes> checkBusBybusNoAnddriverIdAnddateAndrouteId(DriverBoundRes driverBoundRes) throws BusinessException {
        // 取出数据
        String date = driverBoundRes.getDate();
        String routeid = driverBoundRes.getRouteid();
        String busno = driverBoundRes.getBusno();
        String driverid = driverBoundRes.getDriverid();
        ArrayList<DriverBoundRes> driverBoundRes1 = seatsbookdetailDOMapper.selectByDateAndBusNoAndRouteIdAndDriverId(date, routeid, busno, driverid);
        return driverBoundRes1;
    }
}
