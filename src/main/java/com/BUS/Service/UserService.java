package com.BUS.Service;

import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.Service.model.UserModifiModel;
import com.BUS.error.BusinessException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserLoginModel login(UserLoginModel userLoginModel) throws BusinessException;
    int modifiPSW(UserModifiModel userModifiModel) throws BusinessException;
    int pushResponse(String content) throws BusinessException;
    int updateDriverLocation(float latitude,float longitude,String date,String busNo,String driverId,String routeId) throws BusinessException;
}
