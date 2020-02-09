package com.BUS.Service.impl;

import com.BUS.Dao.RouteDOMapper;
import com.BUS.Dao.SeatsbookdetailDOMapper;
import com.BUS.Dao.UserOrderDOMapper;
import com.BUS.Service.DriverService;
import com.BUS.Service.model.DropOffModel;
import com.BUS.error.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired(required = false)
    private UserOrderDOMapper userOrderDOMapper;
    @Autowired(required = false)
    private SeatsbookdetailDOMapper seatsbookdetailDOMapper;

    @Override
    public ArrayList<DropOffModel> getDropOffDeteil(String busNo, String date, String routeId, String driverId) throws BusinessException {
        ArrayList<DropOffModel> dropOffModels = new ArrayList<>();
        ArrayList<String> finalPlaces = new ArrayList<>();
        // 取出对应行程的所有终点站
        System.out.println(busNo);
        System.out.println(date);
        System.out.println(routeId);
        busNo = busNo.substring(1);
        finalPlaces = userOrderDOMapper.selectFinalPlace(busNo, date, routeId);
        System.out.println(finalPlaces);
        for (int i = 0; i < finalPlaces.size(); i++) {
            System.out.println(finalPlaces.get(i));
        }
        // 遍历取出的终点站数组，构造DropOffModel
        ArrayList<String> afterOpFinalPlaces = new ArrayList<>();
        for (int i = 0; i < finalPlaces.size(); i++) {
            String finalPlace = finalPlaces.get(i);
            int j = 0;
            for (j = 0; j < afterOpFinalPlaces.size(); j++) {
                if (afterOpFinalPlaces.get(i).equals(finalPlace)) {
                    int num = dropOffModels.get(i).getNum();
                    dropOffModels.get(i).setNum(++num);
                    break;
                }
            }
            if(j < afterOpFinalPlaces.size()+1){
                afterOpFinalPlaces.add(finalPlace);
                DropOffModel dropOffModel = new DropOffModel();
                dropOffModel.setPlace(finalPlace);
                dropOffModel.setNum(1);
                dropOffModels.add(dropOffModel);
            }
        }
        return dropOffModels;
    }

    @Override
    public int end(String busNo, String date, String routeId, String driverId) throws BusinessException {
        int status = 0;
        status = seatsbookdetailDOMapper.updateByDriverLoc(0,0,date,busNo,driverId,routeId);
        return status;
    }
}
