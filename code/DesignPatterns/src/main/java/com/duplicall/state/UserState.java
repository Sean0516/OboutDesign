package com.duplicall.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description UserState
 * @Author Sean
 * @Date 2021/6/21 9:58
 * @Version 1.0
 */
public class UserState extends AbstractState {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void setState() {
        super.context.setCurrentState(Context.STUDENT_STATE);
    }

    @Override
    public void methodOne() {
        logger.info("user method one ");
    }

    @Override
    public void methodTwo() {
        logger.info("user method two  ");
    }
}
