package com.duplicall.visitor;

import com.duplicall.visitor.element.AbstractElement;

/**
 * @Description IVisitor
 * @Author Sean
 * @Date 2021/6/21 11:07
 * @Version 1.0
 */
public interface IVisitor {
    void visit(AbstractElement abstractElement);
}
