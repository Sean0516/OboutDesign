package com.duplicall.observer.demo;

import com.duplicall.observer.demo.observer.Observer;

import java.util.Vector;

/**
 * @Description Subject
 * @Author Sean
 * @Date 2021/6/23 15:29
 * @Version 1.0
 */
public abstract class Subject {
    private Vector<Observer> observerVector = new Vector<>();

    public void add(Observer observer) {
        this.observerVector.add(observer);
    }

    public void delete(Observer observer) {
        this.observerVector.remove(observer);
    }

    public void notifyAllObserver(String msg) {
        if (observerVector.size() > 0) {
            for (Observer observer : observerVector) {
                new Thread(()->{
                    observer.update(msg);
                }).start();
            }
        }
    }

}
