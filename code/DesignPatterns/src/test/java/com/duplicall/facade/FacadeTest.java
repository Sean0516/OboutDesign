package com.duplicall.facade;

import org.junit.Test;

/**
 * @Description FacadeTest
 * @Author Sean
 * @Date 2021/3/14 21:08
 * @Version 1.0
 */
public class FacadeTest {
    @Test
    public void facadeTest(){
        Facade facade = new Facade();
        facade.sleep();
        facade.work();
    }

}
