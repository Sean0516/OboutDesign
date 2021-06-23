package com.duplicall.observer.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ObserverOne
 * @Author Sean
 * @Date 2021/6/23 15:38
 * @Version 1.0
 */
public class ObserverOne implements Observer{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void update(String msg) {
        logger.info("observer one deal msg [{}]",msg);
    }
}
