package com.example.demo.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.query.Param;

@CacheConfig(cacheNames = "users")
public interface  UserMapper {
    int addUser(@Param("name")String name, @Param("age")String age);

    @Cacheable(key ="#p0")
    SecurityProperties.User findById(@Param("id") String id);

    @CachePut(key = "#p0")
    void updataById(@Param("id")String id,@Param("name")String name);

    //如果指定为 true，则方法调用后将立即清空所有缓存
    void deleteById(@Param("id")String id);
}
