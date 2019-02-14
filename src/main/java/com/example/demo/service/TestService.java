package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class TestService {

    @Autowired
    private RedisTemplate redisTemplate;


    public void getValue(){
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        operations.set("sss","孙凯");

    }
}
