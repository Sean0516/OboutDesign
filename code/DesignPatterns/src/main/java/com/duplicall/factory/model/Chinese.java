package com.duplicall.factory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description Chinese
 * @Author Sean
 * @Date 2021/3/10 14:33
 * @Version 1.0
 */
public class Chinese implements ISpeak {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void say() {
        logger.info("say chinese");
    }
}
