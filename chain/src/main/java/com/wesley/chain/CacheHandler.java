package com.wesley.chain;

import lombok.extern.slf4j.Slf4j;
import java.util.Objects;

/**
 * @author Created by Wesley on 2017/5/8.
 */
@Slf4j
public abstract class CacheHandler {
    private CacheHandler next;

    public CacheHandler(CacheHandler next){
        this.next = next;
    }

    public void handleCache(Cache cache){
        if(Objects.nonNull(next)){
            next.handleCache(cache);
        }
        log.info("Chain已经执行完了");
    }

    protected void printHandling(Cache cache){
        log.info("{} handling cache \"{}\"", this, cache);
    }
}
