package com.BUS.Service;

import com.BUS.Service.model.DriverBoundRes;
import com.BUS.Service.model.InquireMyOrder;
import com.BUS.Service.model.MySeatBookModel;
import com.BUS.Service.model.SeatBookModel;
import com.BUS.error.BusinessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface SeatService {
    SeatBookModel inquireBookSeat(SeatBookModel seatBookModel) throws BusinessException;
    int pullBookSeat(SeatBookModel seatBookModel) throws BusinessException;
    int pullMyBookSeat(MySeatBookModel myseatBookModel) throws BusinessException;
    MySeatBookModel getMyBookSeat(MySeatBookModel myseatBookModel) throws BusinessException;
    int cancelMyBookSeat(MySeatBookModel mySeatBookModel) throws BusinessException;
    ArrayList<InquireMyOrder> getMyOrders(String username) throws BusinessException;
    ArrayList<DriverBoundRes> checkBusBybusNoAnddriverIdAnddateAndrouteId(DriverBoundRes driverBoundRes) throws BusinessException;
}
