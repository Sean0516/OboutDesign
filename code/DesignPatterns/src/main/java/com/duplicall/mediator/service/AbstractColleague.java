package com.duplicall.mediator.service;

import com.duplicall.mediator.handler.AbstractMediator;

/**
 * @Description Colleague
 * @Author Sean
 * @Date 2021/3/14 22:17
 * @Version 1.0
 */
public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
    public abstract void selfMethod();
    public abstract void otherMethod();
}
