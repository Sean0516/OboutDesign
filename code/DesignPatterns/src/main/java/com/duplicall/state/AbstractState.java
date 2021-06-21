package com.duplicall.state;

/**
 * @Description AbstractState
 * @Author Sean
 * @Date 2021/6/21 9:49
 * @Version 1.0
 */
public abstract class AbstractState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void setState();
    public abstract void methodOne();
    public abstract void methodTwo();
}
