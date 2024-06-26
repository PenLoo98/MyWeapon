package com.myweapon.rtc_chatting.Service;

import com.myweapon.rtc_chatting.DTO.CacheTestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CacheTestService {
    public CacheTestDTO getResult(String id) {
        log.info("Cache miss, fetching result for id: {}", id);
        return new CacheTestDTO(id, id + " content");
    }
}