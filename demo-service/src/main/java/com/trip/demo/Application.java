package com.trip.demo;

import com.obelisk.soa.api.core.annonations.ApiApplication;
import com.obelisk.soa.api.core.annonations.EnableAutoDocument;
import com.obelisk.soa.api.core.annonations.EnableAutoExceptionHandler;
import com.obelisk.soa.dao.core.annotation.EnableObeliskDao;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableObeliskDao(beanPackages = {"net.ychealth.demo.dao"})
@ApiApplication
@EnableAutoDocument//Swagger
@EnableAutoExceptionHandler//exception handler
//@EnableObeliskDao(beanPackages="com.ctrip.basebiz.obelisk.sms.dao")
@ComponentScan(basePackages = {"com.trip"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}