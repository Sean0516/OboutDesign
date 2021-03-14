package com.duplicall.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description StudentService
 * @Author Sean
 * @Date 2021/3/14 21:01
 * @Version 1.0
 */
public class StudentService {
     private final Logger logger = LoggerFactory.getLogger(this.getClass());

     public void work(){
         logger.info("study ");
     }
     public void sleep(){
         logger.info(" student sleep 10 PM ");
     }
}
