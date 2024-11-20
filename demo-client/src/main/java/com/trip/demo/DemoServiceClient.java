package com.trip.demo;

import com.obelisk.client.core.ServiceClientBase;
import com.trip.demo.contract.HelloServiceRequest;
import com.trip.demo.contract.HelloServiceResponse;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import feign.ribbon.RibbonClient;

public class DemoServiceClient{
    public static DemoRibbonClient getInstance(){
        return ServiceClientBase.getInstance(DemoRibbonClient.class,
                new RibbonClientFallBack(), "demoservice");
    }
}
