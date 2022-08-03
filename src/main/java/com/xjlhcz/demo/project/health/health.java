package com.xjlhcz.demo.project.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class health {

    @ResponseBody  // 把返回的结果给浏览器
    @RequestMapping("/health")
    public String hello(){
        return "Demo Test";
    }
}
