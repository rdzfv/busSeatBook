package com.BUS.Service.impl;
import com.BUS.Service.model.*;
import com.alibaba.druid.util.StringUtils;
import com.BUS.Service.BusService;
import com.BUS.Dao.*;
import com.BUS.dataObject.*;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BusServiceImpl implements BusService{

    @Autowired(required = false)
    private RouteDOMapper routeDOMapper;
    @Autowired(required = false)
    private BusNoRouteDOMapper busNoRouteDOMapper;

    @Override
    public ArrayList<InquireBusResponse> inquireBus(UserInquireBusModel userInquireBusModel) throws BusinessException {
        // 参数校验
        if(userInquireBusModel == null){
            System.out.println("userInquireBusModel为null");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        if(StringUtils.isEmpty(userInquireBusModel.getDate())
                ||StringUtils.isEmpty(userInquireBusModel.getStartPlace())
                ||StringUtils.isEmpty(userInquireBusModel.getTargetPlace())
                ||userInquireBusModel.getDateType()==0
        ){
            System.out.println("参数不全");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        System.out.println("参数通过验证");

        // 取出数据
        String date = userInquireBusModel.getDate();
        String startTime = userInquireBusModel.getStartTime();
        String startPlace = userInquireBusModel.getStartPlace();
        String targetPlace = userInquireBusModel.getTargetPlace();
        int dateType = userInquireBusModel.getDateType();

        // 查询全部车次
        ArrayList<InquireBusResponse> inquireBusResponses = routeDOMapper.selectByDateTypeAndStartTime(dateType,startTime);

        // 取出含有用户起点和终点的记录
        System.out.println(inquireBusResponses);
        ArrayList<InquireBusResponse> inquireBusResponses1 = new ArrayList<>();
        for (int i = 0; i < inquireBusResponses.size(); i++){
            if(
                (startPlace.equals(inquireBusResponses.get(i).getStartPlace()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace1()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace2()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace3()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace4()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace5()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace6()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace7()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace8()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace9()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace10()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace11()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace12()) ||
                 startPlace.equals(inquireBusResponses.get(i).getPlace13())
                ) && (
                 targetPlace.equals(inquireBusResponses.get(i).getFinalPlace()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace1()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace2()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace3()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace4()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace5()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace6()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace7()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace8()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace9()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace10()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace11()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace12()) ||
                 targetPlace.equals(inquireBusResponses.get(i).getPlace13())
                )
            ){
                System.out.println("找到");
                System.out.println(inquireBusResponses.get(i));
                inquireBusResponses1.add(inquireBusResponses.get(i));
            }
        }

        for (int i = 0; i < inquireBusResponses1.size(); i++) {
            System.out.println(inquireBusResponses.get(i));
        }

        for(int i = 0;i < inquireBusResponses1.size();i++){
            //每一个的routeNo查询所有存在的busNo
            System.out.println(inquireBusResponses1);
            ArrayList<BusNoRouteDO> busNoRouteDOs = busNoRouteDOMapper.getBusNosByRouteNo(inquireBusResponses1.get(i).getrouteno());
            for(int j = 0;j < busNoRouteDOs.size();j++){
                BusNoRouteDO busNoRouteDO =busNoRouteDOs.get(j);
                System.out.println("取出了一组路线车牌对应记录");
                RouteBusModel routeBusModel =convertFromDataObject(busNoRouteDO);
                System.out.println("转换成功");
                String BusNo = routeBusModel.getBusNo();
                System.out.println(BusNo);
                System.out.println("取出了车牌");
                InquireBusResponse inquireBusResponse = inquireBusResponses1.get(i);
                System.out.println(inquireBusResponse);
                System.out.println("取出了一组路线记录");
                inquireBusResponse.setbusno(BusNo);
                System.out.println("加入车牌");
            }
        }

        System.out.println("数据库操作成功");
        return inquireBusResponses1;
    }

    @Override
    public ArrayList<InquireBusResponse> inquireAllBus() throws BusinessException {
        ArrayList<InquireBusResponse> inquireBusResponses = routeDOMapper.selectAll();
        return inquireBusResponses;
    }

    @Override
    public ArrayList<String> inquireAllPlaceByRouteId(String routeNo) throws BusinessException {
        ArrayList<String> dropOffPlaces = new ArrayList<>();
        InquireBusResponse places = new InquireBusResponse();
        places = routeDOMapper.selectAllPlaceByRouteId(routeNo);
        System.out.println(places);
        if(places.getPlace1() != null && places.getPlace1() != "") {
            dropOffPlaces.add(places.getPlace1());
        }
        if(places.getPlace2() != null && places.getPlace2() != "") {
            dropOffPlaces.add(places.getPlace2());
        }
        if(places.getPlace3() != null && places.getPlace3() != "") {
            dropOffPlaces.add(places.getPlace3());
        }
        if(places.getPlace4() != null && places.getPlace4() != "") {
            dropOffPlaces.add(places.getPlace4());
        }
        if(places.getPlace5() != null && places.getPlace5() != "") {
            dropOffPlaces.add(places.getPlace5());
        }
        if(places.getPlace6() != null && places.getPlace6() != "") {
            dropOffPlaces.add(places.getPlace6());
        }
        if(places.getPlace7() != null && places.getPlace7() != "") {
            dropOffPlaces.add(places.getPlace7());
        }
        if(places.getPlace8() != null && places.getPlace8() != "") {
            dropOffPlaces.add(places.getPlace8());
        }
        if(places.getPlace9() != null && places.getPlace9() != "") {
            dropOffPlaces.add(places.getPlace9());
        }
        if(places.getPlace10() != null && places.getPlace10() != "") {
            dropOffPlaces.add(places.getPlace10());
        }
        if(places.getPlace11() != null && places.getPlace11() != "") {
            dropOffPlaces.add(places.getPlace11());
        }
        if(places.getPlace12() != null && places.getPlace12() != "") {
            dropOffPlaces.add(places.getPlace12());
        }
        if(places.getPlace13() != null && places.getPlace13() != "") {
            dropOffPlaces.add(places.getPlace13());
        }
        if(places.getFinalPlace() != null && places.getFinalPlace() != "") {
            dropOffPlaces.add(places.getFinalPlace());
        }
        return dropOffPlaces;
    }


    //userDO和userModel转换
    private  BusNoRouteDO converFromModel(RouteBusModel routeBusModel){
        if(routeBusModel == null){
            return null;
        }
        BusNoRouteDO busNoRouteDO = new BusNoRouteDO();
        BeanUtils.copyProperties(routeBusModel,busNoRouteDO);
        System.out.println("do->model转换成功");
        return busNoRouteDO;
    }
    private RouteBusModel convertFromDataObject(BusNoRouteDO busNoRouteDO){
        if(busNoRouteDO==null){
            return null;
        }
        RouteBusModel routeBusModel=new RouteBusModel();
        BeanUtils.copyProperties(busNoRouteDO,routeBusModel);
        System.out.println("model->do转换成功");
        return routeBusModel;
    }

    public static class DriverServiceImp {
    }
}
