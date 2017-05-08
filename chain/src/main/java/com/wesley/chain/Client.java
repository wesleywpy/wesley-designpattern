package com.wesley.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Created by Wesley on 2017/5/8.
 */
public class Client {

    CacheHandler cacheHandler;

    public Client(){
        buildChain();
    }

    private void buildChain() {
        cacheHandler = new MemcacheHandler(new RedisCacheHandler(null));
    }

    public void cache(Cache cache) {
        cacheHandler.handleCache(cache);
    }

    public static void main(String[] args){
        Client client = new Client();
        client.cache(new StringCache());
        client.cache(new HtmlCache());

    }

    @Slf4j
    private static class StringCache implements Cache{

        @Override
        public String getType() {
            return "String";
        }

        @Override
        public void markHandled() {
            log.info("String Cache Success");
        }
    }

    @Slf4j
    private static class HtmlCache implements Cache{

        @Override
        public String getType() {
            return "Html";
        }

        @Override
        public void markHandled() {
            log.info("Html Cache Success");
        }
    }
}
