package com.duplicall.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description Originator
 * @Author Sean
 * @Date 2021/6/23 14:59
 * @Version 1.0
 */
public class Originator implements Cloneable {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name;
    private Integer age;

    public IMemento createMemento() {
        return new MementoImpl<>((Originator) this.clone());
    }

    public void restoreMemento(IMemento memento) {
        Originator state = ((MementoImpl<Originator>) memento).getState();
        this.setAge(state.getAge());
        this.setName(state.getName());
    }

    protected static class MementoImpl<T> implements IMemento {
        private T state;

        public MementoImpl(T state) {
            this.state = state;
        }

        private T getState() {
            return state;
        }

        public void setState(T state) {
            this.state = state;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Originator() {
    }

    public Originator(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() {
        Originator originator = null;
        try {
            originator = (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            logger.error("clone obj error as [{}]", e.getMessage(), e);
        }
        return originator;
    }
}
