package com.duplicall.observer.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description CustomerTwo
 * @Author Sean
 * @Date 2021/6/23 16:00
 * @Version 1.0
 */
public class CustomerTwo implements Observer {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void update(Observable o, Object arg) {
        logger.info("observer customer two deal msg [{}]",arg.toString());
    }
}
