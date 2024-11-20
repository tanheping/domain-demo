package com.trip.demo.contract.basecontract;


import com.trip.demo.contract.basecontract.types.ResponseStatusType;

public class ExceptionResponse extends BaseResponse {
    public ExceptionResponse(){}
    public ExceptionResponse(Exception e)
    {
        responseStatusType=new ResponseStatusType(e);
    }
}
