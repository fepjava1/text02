package com.timetask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller

class  Task {
    @RequestMapping("/timeTo.jsp")
    @Scheduled(cron = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29 0/1 * * * ? ")
    public void task1(){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(df.format(new Date()));

    }


}