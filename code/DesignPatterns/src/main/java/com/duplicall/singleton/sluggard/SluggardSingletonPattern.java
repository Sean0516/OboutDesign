package com.duplicall.singleton.sluggard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description SluggardSingletonPattern
 * @Author Sean
 * @Date 2021/3/7 16:36
 * @Version 1.0
 */
public class SluggardSingletonPattern {
    private final Logger logger = LoggerFactory.getLogger(SluggardSingletonPattern.class);
    private static SluggardSingletonPattern sluggardSingletonPattern=null;
    private SluggardSingletonPattern(){
        logger.info("线程不安全的单例模式");
    }
    public static SluggardSingletonPattern getInstance(){
        if (sluggardSingletonPattern == null) {
            sluggardSingletonPattern=new SluggardSingletonPattern();
        }
        return sluggardSingletonPattern;
    }

}
