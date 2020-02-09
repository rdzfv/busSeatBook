package com.BUS.Service;

import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.error.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface LAFService {
    ArrayList<InquireLAFResponse> inquireLAFs() throws BusinessException;
    ArrayList<InquireLAFResponse> inquireMyLAFs(String username) throws BusinessException;
    int TagLAFAlready(int id) throws BusinessException;
}