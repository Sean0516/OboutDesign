package com.duplicall.state;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StateTest
 * @Author Sean
 * @Date 2021/6/21 10:14
 * @Version 1.0
 */
public class StateTest {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Test
    public void testStudentState(){
        UserState userState = new UserState();
        Context context = new Context();
        context.setCurrentState(userState);
        context.methodOne();
        context.methodTwo();
        logger.info("change state to student state ");
        userState.setState();
        context.methodOne();
        context.methodTwo();
    }
}
