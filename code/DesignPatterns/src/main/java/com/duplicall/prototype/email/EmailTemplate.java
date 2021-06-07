package com.duplicall.prototype.email;

/**
 * @Description EmailTemplate
 * @Author Sean
 * @Date 2021/6/7 20:39
 * @Version 1.0
 */
public class EmailTemplate {
    private String title;
    private String context;

    public EmailTemplate(String title, String context) {
        this.title = title;
        this.context = context;
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
}
