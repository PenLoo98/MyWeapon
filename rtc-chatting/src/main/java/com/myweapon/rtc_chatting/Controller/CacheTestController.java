package com.myweapon.rtc_chatting.Controller;

import com.myweapon.rtc_chatting.DTO.CacheTestDTO;
import com.myweapon.rtc_chatting.Service.CacheTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CacheTestController {
    private final CacheTestService cacheTestService;

    @Cacheable(value = "CacheTestDTO", key = "#id", cacheManager = "customCacheManager", unless = "#id==''", condition = "#id.length > 2")
    @GetMapping("/result")
    public CacheTestDTO result(@RequestParam String id){
        return cacheTestService.getResult(id);
    }
}
