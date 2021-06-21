package com.duplicall.state;

/**
 * @Description Context
 * @Author Sean
 * @Date 2021/6/21 9:49
 * @Version 1.0
 */
public class Context {
    public static final AbstractState USER_STATE = new UserState();
    public static final AbstractState STUDENT_STATE = new StudentState();
    private AbstractState currentState;

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void methodOne() {
        this.currentState.methodOne();
    }

    public void methodTwo() {
        this.currentState.methodTwo();
    }
}
