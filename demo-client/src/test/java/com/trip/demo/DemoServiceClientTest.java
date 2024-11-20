package com.trip.demo;

import com.obelisk.soa.api.core.types.AckCodeType;
import com.trip.demo.contract.HelloServiceRequest;
import com.trip.demo.contract.HelloServiceResponse;
import org.junit.Assert;
import org.junit.Test;

public class DemoServiceClientTest {

    @org.junit.Test
    public void healthCheck() {
    }

    @Test
    public void hello() throws Exception {

        DemoRibbonClient demoServiceClient = DemoServiceClient.getInstance();
        HelloServiceRequest request = new HelloServiceRequest();
        request.setSay("11111");
        HelloServiceResponse response = demoServiceClient.hello(request);

        System.out.println(response.getDemoResult());
        Assert.assertSame(AckCodeType.Success,response.getResponseStatusType().getAck());

    }
}