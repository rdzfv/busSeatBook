package com.BUS.Service;

import com.BUS.Service.model.DropOffModel;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.error.BusinessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface DriverService {
    ArrayList<DropOffModel> getDropOffDeteil(String busNo,String date,String routeId,String driverId) throws BusinessException;
    int end(String busNo,String date,String routeId,String driverId) throws BusinessException;
}
