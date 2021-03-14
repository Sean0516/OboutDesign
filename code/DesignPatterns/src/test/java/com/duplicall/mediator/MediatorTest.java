package com.duplicall.mediator;

import com.duplicall.mediator.handler.AbstractMediator;
import com.duplicall.mediator.handler.ConcreteMediator;
import com.duplicall.mediator.service.ColleagueOne;
import org.junit.Test;

/**
 * @Description MediatorTest
 * @Author Sean
 * @Date 2021/3/14 22:27
 * @Version 1.0
 */
public class MediatorTest {
    @Test
    public void mediatorTest(){
        AbstractMediator abstractMediator=new ConcreteMediator();
        ColleagueOne colleagueOne=new ColleagueOne(abstractMediator);
        colleagueOne.selfMethod();
        colleagueOne.otherMethod();
    }

}
