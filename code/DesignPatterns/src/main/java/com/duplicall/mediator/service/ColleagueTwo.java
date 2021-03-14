package com.duplicall.mediator.service;

import com.duplicall.mediator.handler.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ColleagueTwo
 * @Author Sean
 * @Date 2021/3/14 22:21
 * @Version 1.0
 */
public class ColleagueTwo extends AbstractColleague {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public ColleagueTwo(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void selfMethod() {
        logger.info("ColleagueTwo do self method ");
    }

    @Override
    public void otherMethod() {
        logger.info("ColleagueTwo do other method ");
        abstractMediator.doColleagueOneMethod();
    }
}
