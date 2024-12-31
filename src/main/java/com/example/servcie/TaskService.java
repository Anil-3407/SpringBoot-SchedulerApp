package com.example.servcie;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    int count=1;


 /*   //run every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void cleanTemp(){
        System.out.println(count);
        count++;
    }
    //run every 5 seconds delay after previous task completion
    @Scheduled(fixedDelay = 5000)
    public void delayTask(){
        System.out.println(System.currentTimeMillis());
    }*/
/*    run every second
    @Scheduled(cron = "0 * * * * ?")
    public void cronTask(){
        System.out.println("Every second: "+count);
        count++;
    }*/
    //run every minute
    @Scheduled(cron = "0 * * * * ?")
    public void cronTask(){
        System.out.println("Every second: "+count);
        count++;
    }

}
