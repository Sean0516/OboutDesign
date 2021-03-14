package com.duplicall.facade;

import com.duplicall.facade.service.StudentService;
import com.duplicall.facade.service.TeacherService;

/**
 * @Description Facade
 * @Author Sean
 * @Date 2021/3/14 21:05
 * @Version 1.0
 */
public class Facade {
    private final StudentService studentService=new StudentService();
    private final TeacherService teacherService=new TeacherService();

    public void work(){
        teacherService.work();
        studentService.work();
    }
    public void sleep(){
        studentService.sleep();
        teacherService.sleep();
    }

}
