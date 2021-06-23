package com.duplicall.observer;

import com.duplicall.observer.demo.ConcreteSubject;
import com.duplicall.observer.demo.observer.ObserverOne;
import com.duplicall.observer.demo.observer.ObserverTwo;
import com.duplicall.observer.java.CustomerOne;
import com.duplicall.observer.java.CustomerTwo;
import com.duplicall.observer.java.Producer;
import org.junit.Test;

/**
 * @Description ObserverTest
 * @Author Sean
 * @Date 2021/6/23 15:41
 * @Version 1.0
 */
public class ObserverTest {
    @Test
    public void testObserver() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.add(new ObserverOne());
        concreteSubject.add(new ObserverTwo());
        concreteSubject.methodOne();
    }
    @Test
    public void testJavaObserver(){
        Producer producer=new Producer();
        producer.addObserver(new CustomerOne());
        producer.addObserver(new CustomerTwo());
        producer.methodOne();
        producer.methodTwo();
    }
}

