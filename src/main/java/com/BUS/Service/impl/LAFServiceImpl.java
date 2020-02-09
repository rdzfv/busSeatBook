package com.BUS.Service.impl;

import com.BUS.Dao.BusNoRouteDOMapper;
import com.BUS.Dao.LAFDOMapper;
import com.BUS.Dao.RouteDOMapper;
import com.BUS.Service.BusService;
import com.BUS.Service.LAFService;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.dataObject.LAFDO;
import com.BUS.error.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class LAFServiceImpl implements LAFService {
    @Autowired(required = false)
    private LAFDOMapper lafdoMapper;

    // 查询全部失物招领信息
    @Override
    public ArrayList<InquireLAFResponse> inquireLAFs() throws BusinessException {
        ArrayList<InquireLAFResponse> inquireLAFResponses = lafdoMapper.selectAll();
        return inquireLAFResponses;
    }

    // 查询用户个人失物招领信息
    @Override
    public ArrayList<InquireLAFResponse> inquireMyLAFs(String username) throws BusinessException {
        ArrayList<InquireLAFResponse> inquireMyLAFResponses = lafdoMapper.selectMyAll(username);
        return inquireMyLAFResponses;
    }

    // 修改个人失物招领记录的状态
    @Override
    public int TagLAFAlready(int id) throws BusinessException {
        int status = 0;
        LAFDO lafdo = new LAFDO();
        lafdo.setId(id);
        lafdo.setStatus(1);
        status = lafdoMapper.updateLAFById(lafdo);
        return status;
    }
}
