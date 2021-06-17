package com.duplicall.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ChinaImpl
 * @Author Sean
 * @Date 2021/6/17 21:56
 * @Version 1.0
 */
public class ChinaImpl implements IHuman{
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void say() {
        logger.info("说中文");
    }

    @Override
    public void skin() {
        logger.info("黄皮肤");
    }
}
