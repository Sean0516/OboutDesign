package com.duplicall.visitor.element;

import com.duplicall.visitor.IVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description ElementOne
 * @Author Sean
 * @Date 2021/6/21 11:08
 * @Version 1.0
 */
public class ElementOne extends AbstractElement{
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void methodOne() {
        logger.info("element one method one ");
    }
}
