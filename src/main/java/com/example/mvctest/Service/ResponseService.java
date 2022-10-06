package com.example.mvctest.Service;

import com.example.mvctest.Controller.ListResponse;
import com.example.mvctest.Controller.SingleResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    public<T>SingleResponse<T> getSingleResponse(T data){
        SingleResponse singleResponse = new SingleResponse();
        singleResponse.result = data;

        return singleResponse;
    }

    public<T>ListResponse<T> getListResponse(List<T> dataList){
        ListResponse listResponse = new ListResponse();
        listResponse.result = dataList;

        return listResponse;
    }

//    void setSuccessResponse(CommonResponse response){
//        response.code=0;
//        response.success=true;
//        response.message="SUCCESS";
//    }

}
