package com.BUS.Service;

import com.BUS.Dao.LAFDOMapper;
import com.BUS.Service.model.InquireLAFResponse;
import com.BUS.error.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public interface UploadService {


    String upload(String localPath) throws BusinessException;
    int uploadForm(InquireLAFResponse inquireLAFResponse) throws BusinessException;
}
