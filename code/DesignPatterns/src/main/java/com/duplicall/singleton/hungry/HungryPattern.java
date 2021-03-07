package com.duplicall.singleton.hungry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description HungryPattern
 * @Author Sean
 * @Date 2021/3/7 12:33
 * @Version 1.0
 */
public class HungryPattern {
    private final Logger logger = LoggerFactory.getLogger(HungryPattern.class);
    private static final HungryPattern hungryPattern =new HungryPattern();
    private HungryPattern(){
        logger.info("饿汉式单例模式");
    }
    public static HungryPattern getInstance(){
        return hungryPattern;
    }
}
