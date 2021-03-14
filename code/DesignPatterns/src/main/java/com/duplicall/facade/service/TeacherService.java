package com.duplicall.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description UserService
 * @Author Sean
 * @Date 2021/3/14 21:01
 * @Version 1.0
 */
public class TeacherService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void work(){
        logger.info("teach student  ");
    }
    public void sleep(){
        logger.info("teacher sleep  12 PM ");
    }
}
