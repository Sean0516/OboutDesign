package com.duplicall.strategy;

import com.duplicall.strategy.factory.StrategyFactory;
import com.duplicall.strategy.template.Context;
import com.duplicall.strategy.template.IStrategy;
import com.duplicall.strategy.template.StrategyOne;
import com.duplicall.strategy.template.StrategyTwo;
import org.junit.Test;

import java.util.Collections;

/**
 * @Description StrategyPatternTest
 * @Author Sean
 * @Date 2021/3/9 19:13
 * @Version 1.0
 */
public class StrategyPatternTest {

    @Test
    public void testStrategyTemplate(){
        Context context = new Context(new StrategyOne());
        context.say();
    }
    @Test
    public void testStrategyFactory(){
        StrategyFactory strategyFactory=new StrategyFactory() ;
        IStrategy strategy = strategyFactory.createStrategy(StrategyTwo.class);
        strategy.method();
    }
}
