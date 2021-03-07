package com.duplicall.singleton.sluggard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description OneLockSingletonPattern
 * @Author Sean
 * @Date 2021/3/7 16:40
 * @Version 1.0
 */
public class OneLockSingletonPattern {
    private final Logger logger = LoggerFactory.getLogger(OneLockSingletonPattern.class);
    private static OneLockSingletonPattern oneLockSingletonPattern=null;
    private OneLockSingletonPattern(){
        logger.info("one lock singleton pattern");
    }
    public synchronized  static OneLockSingletonPattern getInstance(){
        if (oneLockSingletonPattern == null) {
            oneLockSingletonPattern=new OneLockSingletonPattern();
        }
        return oneLockSingletonPattern;
    }

}
