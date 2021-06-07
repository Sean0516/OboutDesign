package com.duplicall.prototype.copy;

/**
 * @Description SimpleCopy
 * @Author Sean
 * @Date 2021/6/7 20:47
 * @Version 1.0
 */
public class SimpleCopy implements Cloneable {
    private String name;
    private int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        SimpleCopy simpleCopy = null;
        simpleCopy = (SimpleCopy) super.clone();
        return simpleCopy;
    }

    public SimpleCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
