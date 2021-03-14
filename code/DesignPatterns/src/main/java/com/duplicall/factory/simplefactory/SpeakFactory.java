package com.duplicall.factory.simplefactory;

import com.duplicall.factory.model.ISpeak;

/**
 * @Description HumanFactory
 * @Author Sean
 * @Date 2021/3/10 14:35
 * @Version 1.0
 */
public interface SpeakFactory {
    ISpeak createHuman();
}
