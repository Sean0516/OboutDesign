package com.duplicall.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StudentState
 * @Author Sean
 * @Date 2021/6/21 9:59
 * @Version 1.0
 */
public class StudentState extends AbstractState{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public void setState() {
        super.context.setCurrentState(Context.USER_STATE);
    }

    @Override
    public void methodOne() {
        logger.info("student method one ");
    }

    @Override
    public void methodTwo() {
        logger.info("student method two  ");
    }
}
