package com.duplicall.singleton.hungry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description InnerClassSingletonPattern
 * @Author Sean
 * @Date 2021/3/7 12:41
 * @Version 1.0
 */
public class InnerClassSingletonPattern {
    private final Logger logger = LoggerFactory.getLogger(InnerClassSingletonPattern.class);

    private InnerClassSingletonPattern() {
        logger.info("静态内部类实现单例模式");
    }

    private static class SingletonHolder {
        private static InnerClassSingletonPattern innerClassSingletonPattern = new InnerClassSingletonPattern();
    }

    public static InnerClassSingletonPattern getInstance() {
        return SingletonHolder.innerClassSingletonPattern;
    }
}
