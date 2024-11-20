package com.trip.demo;

import feign.hystrix.FallbackFactory;

public class RibbonClientFallBack implements FallbackFactory<DemoRibbonClient> {
    @Override
    public DemoRibbonClient create(Throwable throwable) {
        return null;
    }
}
