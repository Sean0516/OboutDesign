package com.duplicall.factory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description English
 * @Author Sean
 * @Date 2021/3/10 14:34
 * @Version 1.0
 */
public class English implements ISpeak {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void say() {
        logger.info("say english");
    }
}
