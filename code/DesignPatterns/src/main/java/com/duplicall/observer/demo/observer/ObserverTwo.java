package com.duplicall.observer.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ObserverTwo
 * @Author Sean
 * @Date 2021/6/23 15:38
 * @Version 1.0
 */
public class ObserverTwo implements Observer{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void update(String msg) {
        logger.info("observer two deal msg [{}]",msg);
    }
}
