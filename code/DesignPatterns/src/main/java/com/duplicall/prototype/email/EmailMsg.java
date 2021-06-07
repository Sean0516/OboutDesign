package com.duplicall.prototype.email;

/**
 * @Description EmailMsg
 * @Author Sean
 * @Date 2021/6/7 20:40
 * @Version 1.0
 */
public class EmailMsg implements Cloneable {
    private String receiver;
    private String title;
    private String context;
    private String name;

    public EmailMsg(EmailTemplate emailTemplate) {
        this.title = emailTemplate.getTitle();
        this.context = emailTemplate.getContext();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        EmailMsg mail = null;
        mail = (EmailMsg) super.clone();
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmailMsg{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
