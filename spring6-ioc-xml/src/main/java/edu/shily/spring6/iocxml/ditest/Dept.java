package edu.shily.spring6.iocxml.ditest;

import lombok.Data;

import java.util.List;

/**
 * @author Shily-zhang
 * @Description
 */
@Data
public class Dept {

    private List<Emp> empList;

    private String dname;

    public void info(){
        System.out.println("部门名称："+dname);
        for (Emp emp : empList) {
            System.out.println(emp.getEname());
        }
    }
}
