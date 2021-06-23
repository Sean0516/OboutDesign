package com.duplicall.memento;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description MementoTest
 * @Author Sean
 * @Date 2021/6/23 15:07
 * @Version 1.0
 */
public class MementoTest {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Test
    public void testMemento(){
        Originator originator = new Originator("Sean",22);
        Caretaker caretaker = new Caretaker();
        logger.info("修前的对象属性 [{}]",originator.toString());
        caretaker.setMemento(originator.createMemento());
        originator.setName("Master");
        logger.info("修改后的对象属性 [{}]",originator.toString());
        originator.restoreMemento(caretaker.getMemento());
        logger.info("备份后的对象属性 [{}]",originator.toString());
    }
}
