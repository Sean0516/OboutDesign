package com.duplicall.bridge;

/**
 * @Description HumanOne
 * @Author Sean
 * @Date 2021/6/17 22:01
 * @Version 1.0
 */
public class HumanOne extends AbstractFactory{

    public HumanOne(IHuman human) {
        super(human);
    }

    @Override
    public void skin() {
        super.skin();
        super.getHuman().say();
    }
}
