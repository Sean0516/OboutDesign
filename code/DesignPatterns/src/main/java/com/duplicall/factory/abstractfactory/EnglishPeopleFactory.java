package com.duplicall.factory.abstractfactory;

import com.duplicall.factory.model.Bread;
import com.duplicall.factory.model.English;
import com.duplicall.factory.model.IFood;
import com.duplicall.factory.model.ISpeak;

/**
 * @Description EnglisePeopleFactory
 * @Author Sean
 * @Date 2021/3/10 14:54
 * @Version 1.0
 */
public class EnglishPeopleFactory extends AbstractPeopleFactory {
    @Override
    public ISpeak createSpeak() {
        return new English();
    }

    @Override
    public IFood createFood() {
        return new Bread();
    }
}
