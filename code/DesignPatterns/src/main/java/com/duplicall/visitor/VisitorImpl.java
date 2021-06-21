package com.duplicall.visitor;

import com.duplicall.visitor.element.AbstractElement;

/**
 * @Description VisitorImpl
 * @Author Sean
 * @Date 2021/6/21 11:10
 * @Version 1.0
 */
public class VisitorImpl implements IVisitor{
    @Override
    public void visit(AbstractElement abstractElement) {
        abstractElement.methodOne();
    }
}
