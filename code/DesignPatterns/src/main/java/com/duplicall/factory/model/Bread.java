package com.duplicall.factory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description Bread
 * @Author Sean
 * @Date 2021/3/10 14:48
 * @Version 1.0
 */
public class Bread  implements IFood{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public void eat() {
        logger.info("eat bread");
    }
}
