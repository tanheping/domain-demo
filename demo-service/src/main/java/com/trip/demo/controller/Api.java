package com.trip.demo.controller;

import com.alibaba.fastjson.JSON;
import com.obelisk.soa.api.core.annonations.ApiVersion;
import com.trip.demo.contract.HelloServiceRequest;
import com.trip.demo.contract.HelloServiceResponse;
import io.swagger.annotations.ApiOperation;
import net.ychealth.demo.dao.dao.ShortOriginalUrlGenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class Api {

    @Resource
    ShortOriginalUrlGenDao originalUrlGenDao;

    @ApiOperation(value = "hello", notes = "hello")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public HelloServiceResponse hello(@Validated @RequestBody HelloServiceRequest request) {
        HelloServiceResponse response = new HelloServiceResponse();
        response.setSuccess();
        response.setDemoResult("service say:+" + request.getSay());
        System.out.println("request say:" + request.getSay());
        System.out.println(JSON.toJSON(originalUrlGenDao.findAll()));;
        return response;
    }
}
