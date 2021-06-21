package com.duplicall.visitor.element;

import com.duplicall.visitor.IVisitor;

/**
 * @Description AbstratElement
 * @Author Sean
 * @Date 2021/6/21 11:06
 * @Version 1.0
 */
public abstract class AbstractElement {
    public abstract void methodOne();
    public abstract void accept(IVisitor visitor);
}
