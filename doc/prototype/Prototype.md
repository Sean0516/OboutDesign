### 定义

使用原型实例指定创建对的种类，并且通过拷贝这些原型创建新的对象

![img](D:\study\OboutDesign\doc\prototype\clipboard.png)

原型模式的核心在于clone 方法，通过该方法进行对象的拷贝

#### 优点

1. 原型模式是在内存二进制流的拷贝，比直接new 一个对象性能要好很多，特别是要在一个循环体中产生大量对象时，原型模式可以更好的体现其优点
2. 避免构造函数的约束  ---这一点既是优点也是缺点，直接从内存中拷贝，构造函数不会执行，优点是减少了约束，缺点也是减少了约束

### 注意事项

1. 构造函数不会被执行 ----对象拷贝时，构造函数不会被执行，object 类的clone 方法的原理是从内存中（具体来说，是在堆内存中） 以二进制流的方式进行拷贝，重新分配一个内存块
2. 浅拷贝和深拷贝
   1. object 提供的clone 方法只拷贝本对象，其对象内部的数组，引用对象都不拷贝，还是指向原生对象的内部元素地址，这种拷贝叫做浅拷贝。 （内部数组和引用对象不拷贝，其他原始类型会被拷贝，String 类型也会被拷贝） 
   2. 使用原型模式时，引用的成员变量必须满足两个添加才会被拷贝 
      1. 类的成员变量而不是方法内的变量
      2. 必须是一个可变的引用对象，而不是一个原始类型或不可变对象。
   3. 在使用clone 方法时，类的成员变量上不要增加final 关键字
   4. clone 方法，如果字段是值类型，则对该字段进行复制，如果对象是引用类型，则复制引用但是不复制引用的对象，因此，原址对象和其复制的对象是同一个对象

#### 浅拷贝

```java
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

```



#### 深拷贝

```java
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
```

