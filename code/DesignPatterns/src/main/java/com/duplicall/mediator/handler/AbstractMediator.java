package com.duplicall.mediator.handler;

import com.duplicall.mediator.service.AbstractColleague;
import com.duplicall.mediator.service.ColleagueOne;
import com.duplicall.mediator.service.ColleagueTwo;

/**
 * @Description Mediator
 * @Author Sean
 * @Date 2021/3/14 22:16
 * @Version 1.0
 */
public abstract class AbstractMediator {
    protected AbstractColleague colleagueOne;
    protected AbstractColleague colleagueTow;

    public AbstractMediator() {
        colleagueOne=new ColleagueOne(this);
        colleagueTow=new ColleagueTwo(this);
    }
    public abstract void doColleagueOneMethod();
    public abstract void doColleagueTwoMethod();
}
