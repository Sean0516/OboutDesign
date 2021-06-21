package com.duplicall.visitor;

import com.duplicall.visitor.element.ElementOne;
import com.duplicall.visitor.element.ElementTwo;
import org.junit.Test;

/**
 * @Description VisitorTest
 * @Author Sean
 * @Date 2021/6/21 11:12
 * @Version 1.0
 */
public class VisitorTest {
    @Test
    public void testVisitor(){
        new ElementOne().accept(new VisitorImpl());
        new ElementTwo().accept(new VisitorImpl());
    }
}
