package com.duplicall.strategy.factory;

import com.duplicall.strategy.template.IStrategy;

/**
 * @Description AbstratctStrategyFactory
 * @Author Sean
 * @Date 2021/3/9 19:16
 * @Version 1.0
 */
public abstract class AbstractStrategyFactory {
    /**
     * 创建策略工厂
     * @param c
     * @param <T>
     * @return
     */
   public abstract <T extends IStrategy > T createStrategy(Class c);
}
