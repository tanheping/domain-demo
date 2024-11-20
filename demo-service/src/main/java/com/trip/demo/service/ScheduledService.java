package com.trip.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@EnableAsync
public class ScheduledService {


    @Async
    @Scheduled(cron = "0/5 * * * * ?")// 定时表达式
    public void first() throws InterruptedException {




    }

}
