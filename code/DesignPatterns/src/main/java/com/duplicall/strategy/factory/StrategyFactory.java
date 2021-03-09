package com.duplicall.strategy.factory;

import com.duplicall.strategy.template.IStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StrategyFactory
 * @Author Sean
 * @Date 2021/3/9 19:17
 * @Version 1.0
 */
public class StrategyFactory extends   AbstractStrategyFactory{
     private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public <T extends IStrategy> T createStrategy(Class c) {
        IStrategy strategy = null;
        try {
            strategy  = (IStrategy) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            logger.error("create strategy error as [{}]",e.getMessage(),e);
        }
        return (T) strategy;
    }
}
