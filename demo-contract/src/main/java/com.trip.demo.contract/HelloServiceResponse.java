package com.trip.demo.contract;


import com.obelisk.soa.api.core.BaseResponse;

public class HelloServiceResponse  extends BaseResponse {
    private  String demoResult;

    public String getDemoResult() {
        return demoResult;
    }

    public void setDemoResult(String demoResult) {
        this.demoResult = demoResult;
    }
}
