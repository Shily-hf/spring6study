package edu.shily.spring6.iocxml.ditest;

import lombok.Data;

import java.util.Arrays;

/**
 * @author Shily-zhang
 * @Description
 */

@Data
public class Emp {

    private Dept dept;
    private String ename;
    private Integer age;
    private String[] hobby;

    public void work(){
        System.out.println(ename+"working......and age:"+age);
        dept.info();
        System.out.println(Arrays.toString(hobby));
    }
}
