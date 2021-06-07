package com.duplicall.prototype;

import com.duplicall.prototype.copy.DeepCopy;
import com.duplicall.prototype.copy.SimpleCopy;
import com.duplicall.prototype.email.EmailMsg;
import com.duplicall.prototype.email.EmailTemplate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description ProtoTypeTest
 * @Author Sean
 * @Date 2021/6/7 20:43
 * @Version 1.0
 */
public class ProtoTypeTest {
    @Test
    public void emailProtoTypeTest() throws CloneNotSupportedException {
        EmailTemplate emailTemplate = new EmailTemplate("测试邮件标题","测试邮件内容");
        EmailMsg emailMsg = new EmailMsg(emailTemplate);
        for (int i = 0; i < 20; i++) {
            EmailMsg clone = (EmailMsg) emailMsg.clone();
            clone.setName("demo"+i);
            clone.setReceiver("sean"+i);
            System.out.println(clone.toString() + clone.hashCode());
        }
    }
    @Test
    public void simpleCopy() throws CloneNotSupportedException {
        SimpleCopy simpleCopy = new SimpleCopy("Sean", 22);
        SimpleCopy clone = (SimpleCopy) simpleCopy.clone();
        System.out.println("simpleCopy.hashCode() = " + simpleCopy.hashCode());
        System.out.println("clone.hashCode() = " + clone.hashCode());
    }
    @Test
    public void deepCopy() throws CloneNotSupportedException {
        ArrayList<String> userList=new ArrayList<>(2);
        userList.add("Demo");
        userList.add("Hello");
        DeepCopy deepCopy = new DeepCopy("Sean",userList);
        DeepCopy clone = (DeepCopy) deepCopy.clone();
        System.out.println("deepCopy.getList() = " + deepCopy.getList().toString());
        System.out.println("clone.getList().toString() = " + clone.getList().toString());

    }


}
