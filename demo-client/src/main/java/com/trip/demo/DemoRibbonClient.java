package com.trip.demo;

import com.obelisk.client.core.RibbonClientBase;
import com.trip.demo.contract.HelloServiceRequest;
import com.trip.demo.contract.HelloServiceResponse;
import feign.Headers;
import feign.RequestLine;

public interface DemoRibbonClient extends RibbonClientBase {

    @RequestLine("GET /api/healthCheck")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    String healthCheck();


    @RequestLine("POST /api/hello")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    HelloServiceResponse hello(HelloServiceRequest request) throws Exception;;
}
