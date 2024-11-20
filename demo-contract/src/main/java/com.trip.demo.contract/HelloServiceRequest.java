package com.trip.demo.contract;


import com.obelisk.soa.api.core.BaseRequest;

public class HelloServiceRequest extends BaseRequest {

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    private  String  say;

}
