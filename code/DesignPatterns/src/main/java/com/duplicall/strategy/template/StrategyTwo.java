package com.duplicall.strategy.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StrategyTwo
 * @Author Sean
 * @Date 2021/3/9 19:12
 * @Version 1.0
 */
public class StrategyTwo implements IStrategy{
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void method() {
        logger.info("strategy two method");
    }
}
