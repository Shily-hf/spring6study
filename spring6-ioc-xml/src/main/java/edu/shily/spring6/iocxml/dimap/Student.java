package edu.shily.spring6.iocxml.dimap;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Shily-zhang
 * @Description
 */
@Data
public class Student {
    private List<Lesson> lessonList;
    private Map<String,Teacher> teacherMap;
    private String sid;
    private String sname;

    public void run(){
        System.out.println("学生编号："+sid+"学生姓名："+sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }
}
