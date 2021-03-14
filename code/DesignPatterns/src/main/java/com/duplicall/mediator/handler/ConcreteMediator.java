package com.duplicall.mediator.handler;

/**
 * @Description ConcreateMediator
 * @Author Sean
 * @Date 2021/3/14 22:24
 * @Version 1.0
 */
public class ConcreteMediator extends AbstractMediator {

    @Override
    public void doColleagueOneMethod() {
        super.colleagueOne.selfMethod();
    }

    @Override
    public void doColleagueTwoMethod() {
        super.colleagueTow.selfMethod();
    }
}
