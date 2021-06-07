package com.duplicall.prototype.copy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description DeepCopy
 * @Author Sean
 * @Date 2021/6/7 20:49
 * @Version 1.0
 */
public class DeepCopy implements Cloneable {
    private String name;
    private ArrayList<String> list = new ArrayList<>();

    public DeepCopy(String name, ArrayList<String> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        deepCopy = (DeepCopy) super.clone();
        this.list = (ArrayList<String>) this.list.clone();
        return deepCopy;
    }
}
