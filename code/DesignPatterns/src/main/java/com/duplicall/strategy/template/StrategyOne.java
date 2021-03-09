package com.duplicall.strategy.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StrategyOne
 * @Author Sean
 * @Date 2021/3/9 19:11
 * @Version 1.0
 */
public class StrategyOne implements IStrategy{
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void method() {
        logger.info("strategy one method");
    }
}
