package com.duplicall.observer.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;

/**
 * @Description ObservableSubject
 * @Author Sean
 * @Date 2021/6/23 15:55
 * @Version 1.0
 */
public class Producer extends Observable {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void methodOne() {
        logger.info("create producer one and notify customer observer");
        super.setChanged();
        super.notifyObservers("producer create produce one ");
        logger.info("method one notify observer end ");
    }

    public void methodTwo() {
        logger.info("create producer two and notify customer observer");
        super.setChanged();
        super.notifyObservers("producer create produce two ");
        logger.info("method two notify observer end ");
    }

}
