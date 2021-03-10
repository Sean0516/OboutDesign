package com.duplicall.factory.simplefactory;

import com.duplicall.factory.model.Chinese;
import com.duplicall.factory.model.ISpeak;

/**
 * @Description ChineseFactory
 * @Author Sean
 * @Date 2021/3/10 14:35
 * @Version 1.0
 */
public class ChineseFactory implements SpeakFactory {
    @Override
    public ISpeak createHuman() {
        return new Chinese();
    }
}
