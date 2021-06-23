package com.duplicall.observer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ConcreteSubject
 * @Author Sean
 * @Date 2021/6/23 15:36
 * @Version 1.0
 */
public class ConcreteSubject extends Subject{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    public void methodOne(){
        logger.info("do some thing start notify observer ");
        super.notifyAllObserver("hello observer ");
        logger.info("notify observer end ");
    }
}
