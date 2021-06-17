package com.duplicall.bridge;

import org.junit.Test;

/**
 * @Description BridgeTest
 * @Author Sean
 * @Date 2021/6/17 22:02
 * @Version 1.0
 */
public class BridgeTest {
    @Test
    public void test(){
        ChinaImpl china = new ChinaImpl();
        HumanOne humanOne = new HumanOne(china);
        humanOne.skin();
    }

}
