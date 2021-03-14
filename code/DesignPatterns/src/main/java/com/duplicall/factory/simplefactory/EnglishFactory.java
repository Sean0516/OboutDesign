package com.duplicall.factory.simplefactory;

import com.duplicall.factory.model.English;
import com.duplicall.factory.model.ISpeak;

/**
 * @Description EnglishFactory
 * @Author Sean
 * @Date 2021/3/10 14:36
 * @Version 1.0
 */
public class EnglishFactory implements SpeakFactory {
    @Override
    public ISpeak createHuman() {
        return new English();
    }
}
