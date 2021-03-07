package com.duplicall.singleton.sluggard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description TowLockSingletonPattern
 * @Author Sean
 * @Date 2021/3/7 21:54
 * @Version 1.0
 */
public class TwoLockSingletonPattern {
    private final Logger logger = LoggerFactory.getLogger(TwoLockSingletonPattern.class);
    private static volatile TwoLockSingletonPattern twoLockSingletonPattern;

    private TwoLockSingletonPattern() {
        logger.info("tow lock singleton pattern");
    }

    public static TwoLockSingletonPattern getInstance() {
        if (twoLockSingletonPattern == null) {
            synchronized (TwoLockSingletonPattern.class) {
                if (twoLockSingletonPattern == null) {
                    twoLockSingletonPattern = new TwoLockSingletonPattern();
                }
            }
        }
        return twoLockSingletonPattern;
    }
}
