package com.duplicall.bridge;

/**
 * @Description AbstractFactory
 * @Author Sean
 * @Date 2021/6/17 21:59
 * @Version 1.0
 */
public abstract class AbstractFactory {
    private IHuman human;

    public AbstractFactory(IHuman human) {
        this.human = human;
    }

    public void skin() {
        this.human.skin();
    }

    public IHuman getHuman() {
        return human;
    }
}
