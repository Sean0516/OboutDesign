package com.duplicall.strategy.template;

/**
 * @Description Context
 * @Author Sean
 * @Date 2021/3/9 19:14
 * @Version 1.0
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void say(){
        strategy.method();
    }
}
