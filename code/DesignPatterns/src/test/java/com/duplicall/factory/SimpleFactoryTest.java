package com.duplicall.factory;

import com.duplicall.factory.abstractfactory.AbstractPeopleFactory;
import com.duplicall.factory.abstractfactory.ChinesePeopleFactory;
import com.duplicall.factory.model.English;
import com.duplicall.factory.simplefactory.ChineseFactory;
import com.duplicall.factory.simplefactory.SpeakFactory;
import com.duplicall.factory.simplefactory.SpeakFactoryUtil;
import org.junit.Test;

/**
 * @Description SimpleFactoryTest
 * @Author Sean
 * @Date 2021/3/10 14:37
 * @Version 1.0
 */
public class SimpleFactoryTest {
    @Test
    public void testFactory(){
        SpeakFactory speakFactory =new ChineseFactory();
        speakFactory.createHuman().say();
        SpeakFactoryUtil.createSpek(English.class).say();
    }
    @Test
    public void testAbstractFactory(){
        AbstractPeopleFactory abstractPeopleFactory=new ChinesePeopleFactory();
        abstractPeopleFactory.createFood().eat();
        abstractPeopleFactory.createSpeak().say();
    }
}
