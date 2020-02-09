package com.BUS.Service;

import com.BUS.Service.model.DropOffModel;
import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.error.BusinessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BusService {
    ArrayList<InquireBusResponse> inquireBus(UserInquireBusModel userInquireBusModel) throws BusinessException;
    ArrayList<InquireBusResponse> inquireAllBus() throws BusinessException;
    ArrayList<String> inquireAllPlaceByRouteId(String routeNo) throws BusinessException;
}