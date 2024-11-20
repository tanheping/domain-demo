package com.trip.demo.contract.basecontract;

import com.trip.demo.contract.basecontract.types.AckCodeType;
import com.trip.demo.contract.basecontract.types.ResponseStatusType;

import java.io.Serializable;


public class BaseResponse implements Serializable {
    public ResponseStatusType responseStatusType;

    public ResponseStatusType getResponseStatusType() {
        return responseStatusType;
    }

    public void setResponseStatusType(ResponseStatusType responseStatusType) {
        this.responseStatusType = responseStatusType;
    }

    public void setSuccess()
    {
        responseStatusType=new ResponseStatusType();
        responseStatusType.ack= AckCodeType.Success;
    }

    public void setFailure(){
        responseStatusType=new ResponseStatusType();
        responseStatusType.ack= AckCodeType.Failure;
    }
}
