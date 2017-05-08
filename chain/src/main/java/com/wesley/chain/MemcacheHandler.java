package com.wesley.chain;

/**
 * @author Created by Wesley on 2017/5/8.
 */
public class MemcacheHandler extends CacheHandler {
    public MemcacheHandler(CacheHandler next) {
        super(next);
    }

    @Override
    public void handleCache(Cache cache) {
        if("Html".equals(cache.getType())){
            printHandling(cache);
            cache.markHandled();
        }else {
            super.handleCache(cache);
        }
    }

    @Override
    public String toString() {
        return "MemcacheHandler";
    }
}
