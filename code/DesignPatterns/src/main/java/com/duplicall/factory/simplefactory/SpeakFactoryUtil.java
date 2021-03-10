package com.duplicall.factory.simplefactory;

import com.duplicall.factory.model.ISpeak;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description HumanFacttoryUtil
 * @Author Sean
 * @Date 2021/3/10 14:38
 * @Version 1.0
 */
public class SpeakFactoryUtil {
    private static final Logger logger = LoggerFactory.getLogger(SpeakFactoryUtil.class);

    public static <T extends ISpeak> T createSpek(Class c) {
        ISpeak human = null;
        try {
            human = (ISpeak) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            logger.error("create human error as [{}]", e.getMessage(), e);
        }
        return (T) human;
    }
}
