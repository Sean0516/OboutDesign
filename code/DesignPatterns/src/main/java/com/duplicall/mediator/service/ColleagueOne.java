package com.duplicall.mediator.service;

import com.duplicall.mediator.handler.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ColleagueOne
 * @Author Sean
 * @Date 2021/3/14 22:18
 * @Version 1.0
 */
public class ColleagueOne extends AbstractColleague{
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public ColleagueOne(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void selfMethod() {
        logger.info("ColleagueOne do self method ");
    }

    @Override
    public void otherMethod() {
        logger.info("ColleagueOne do other method ");
        abstractMediator.doColleagueTwoMethod();
    }
}
