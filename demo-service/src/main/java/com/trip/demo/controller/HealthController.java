package com.trip.demo.controller;

import com.obelisk.soa.api.core.annonations.ApiVersion;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {
    @ApiOperation(value = "health check", notes = "health check")
    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public String healthCheck() {
        return "healthCheck";
    }
}
