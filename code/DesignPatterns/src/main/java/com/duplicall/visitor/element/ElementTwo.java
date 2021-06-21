package com.duplicall.visitor.element;

import com.duplicall.visitor.IVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ElementTwo
 * @Author Sean
 * @Date 2021/6/21 11:09
 * @Version 1.0
 */
public class ElementTwo extends AbstractElement{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void methodOne() {
        logger.info("element two method one ");
    }
}
