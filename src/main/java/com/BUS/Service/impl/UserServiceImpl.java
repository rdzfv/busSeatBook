package com.BUS.Service.impl;

import com.BUS.Service.model.InquireBusResponse;
import com.BUS.Service.model.UserInquireBusModel;
import com.BUS.Service.model.UserLoginModel;
import com.BUS.Service.model.UserModifiModel;
import com.alibaba.druid.util.StringUtils;
import com.BUS.Service.UserService;
import com.BUS.Dao.*;
import com.BUS.dataObject.*;
import com.BUS.error.BusinessException;
import com.BUS.error.EnumBusinessError;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserLoginDOMapper userLoginDOMapper;
    @Autowired(required = false)
    private responseDOMapper responseDOMapper;
    @Autowired(required = false)
    private SeatsbookdetailDOMapper seatsbookdetailDOMapper;

    @Override
    public UserLoginModel login(UserLoginModel userLoginModel) throws BusinessException {
        if(userLoginModel == null){
            System.out.println("userLoginModel为null");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        if(StringUtils.isEmpty(userLoginModel.getUsername())
         ||StringUtils.isEmpty(userLoginModel.getPassword())
        ){
            System.out.println("参数不全");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        System.out.println("参数通过验证");

        String username = userLoginModel.getUsername();
        String password = userLoginModel.getPassword();


//        UserLoginDO userLoginDO1 = new UserLoginDO();
        UserLoginDO userLoginDO1 = userLoginDOMapper.selectByUserNameAndPassword(username,password);
        System.out.println(userLoginDO1);
        System.out.println(userLoginDO1.getUsername());
        System.out.println("数据库操作成功");
        return convertFromDataObject(userLoginDO1);
    }

    @Override
    public int modifiPSW(UserModifiModel userModifiModel) throws BusinessException {
        int status = 0;
        if(userModifiModel == null){
            System.out.println("userLoginModel为null");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        if(StringUtils.isEmpty(userModifiModel.getUsername())
                ||StringUtils.isEmpty(userModifiModel.getPrePassword())
                ||StringUtils.isEmpty(userModifiModel.getNewPassword())
                ||StringUtils.isEmpty(userModifiModel.getRePassword())
        ){
            System.out.println("参数不全");
            throw new BusinessException(EnumBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        System.out.println("参数通过验证");
        // 取出参数
        String username = userModifiModel.getUsername();
        String prePassword = userModifiModel.getPrePassword();
        String newPassword = userModifiModel.getNewPassword();
        String rePassword = userModifiModel.getRePassword();
        // 判断新密码和确认密码是否相同
        if(!newPassword.equals(rePassword)){
            System.out.println("两次密码不同");
            throw new BusinessException(EnumBusinessError.PASSWORD_NOT_CONSISTENT);
        }
        // 确认用户名原始密码是否匹配
        UserLoginDO userLoginDO1 = userLoginDOMapper.selectByUserNameAndPassword(username,prePassword);
        if(userLoginDO1 == null){
            System.out.println("用户不存在或原始密码错误");
            throw new BusinessException(EnumBusinessError.USER_PASSWORD_NOT_FIT);
        }
        UserLoginDO userLoginDO2 = new UserLoginDO();
        userLoginDO2.setUsername(username);
        userLoginDO2.setPassword(newPassword);
        // 修改密码操作
        status = userLoginDOMapper.modifiPSW(userLoginDO2);
        return status;
    }

    @Override
    public int pushResponse(String content) throws BusinessException {
        int status = 0;
        status = responseDOMapper.pushResponse(content);
        return status;
    }

    @Override
    public int updateDriverLocation(float latitude, float longitude, String date,String busNo,String driverId,String routeId) throws BusinessException {
        int status = 0;
        status = seatsbookdetailDOMapper.updateByDriverLoc(latitude,longitude,date,busNo,driverId,routeId);
        return status;
    }

    //userLoginDO和userLoginModel转换
    //userDO和userModel转换
    private  UserLoginDO converFromModel(UserLoginModel userLoginModel){
        if(userLoginModel == null){
            return null;
        }
        UserLoginDO userLoginDO = new UserLoginDO();
        BeanUtils.copyProperties(userLoginModel,userLoginDO);
        System.out.println("do->model转换成功");
        return userLoginDO;
    }
    private UserLoginModel convertFromDataObject(UserLoginDO userLoginDO){
        if(userLoginDO==null){
            return null;
        }
        UserLoginModel userLoginModel=new UserLoginModel();
        BeanUtils.copyProperties(userLoginDO,userLoginModel);
        System.out.println("model->do转换成功");
        return userLoginModel;
    }
}
