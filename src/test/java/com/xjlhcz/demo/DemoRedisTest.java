package com.xjlhcz.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class DemoRedisTest {

    // @Autowired
    // private RedisTemplate redisTemplate;

    // @Test
    // public void redisTest() {
    //     // redis存储数据
    //     String key = "demo";
    //     String value = (String) redisTemplate.opsForValue().get(key);
    //     if (value == null){
    //         System.out.println("demo is null,set demo");
    //         redisTemplate.opsForValue().set(key, "test");
    //     }else{
    //         // 获取数据
    //         System.out.println("获取key为" + key + "-值为：" + value);
    //     }
    // }

}
