package com.atguigu.gmall1128.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoggerController {

    @RequestMapping(value="/log",method=RequestMethod.POST)
    @ResponseBody
    public String doLog(@RequestParam("log") String log) {

        //补时间戳

        //落盘log  用log4j

        //启动日志和事件日志分流，分到不同的kafka主题中
        System.out.println(log);
        return null;
    }
}
