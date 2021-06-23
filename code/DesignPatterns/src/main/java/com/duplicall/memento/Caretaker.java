package com.duplicall.memento;

/**
 * @Description Caretaker
 * @Author Sean
 * @Date 2021/6/23 15:06
 * @Version 1.0
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
