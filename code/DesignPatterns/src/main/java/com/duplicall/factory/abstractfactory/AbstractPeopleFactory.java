package com.duplicall.factory.abstractfactory;

import com.duplicall.factory.model.IFood;
import com.duplicall.factory.model.ISpeak;

/**
 * @Description AbstracFactory
 * @Author Sean
 * @Date 2021/3/10 14:52
 * @Version 1.0
 */
public abstract class AbstractPeopleFactory {
    public abstract ISpeak createSpeak();
    public abstract IFood createFood();
}
