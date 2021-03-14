package com.duplicall.factory.abstractfactory;

import com.duplicall.factory.model.Chinese;
import com.duplicall.factory.model.IFood;
import com.duplicall.factory.model.ISpeak;
import com.duplicall.factory.model.Rice;

/**
 * @Description ChinesePeopleFactory
 * @Author Sean
 * @Date 2021/3/10 14:54
 * @Version 1.0
 */
public class ChinesePeopleFactory extends AbstractPeopleFactory{
    @Override
    public ISpeak createSpeak() {
        return new Chinese();
    }

    @Override
    public IFood createFood() {
        return new Rice();
    }
}
