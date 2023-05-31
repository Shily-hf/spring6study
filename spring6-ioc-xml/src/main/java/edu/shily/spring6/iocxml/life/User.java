package edu.shily.spring6.iocxml.life;

/**
 * @author Shily-zhang
 * @Description
 */
public class User {

    private String name;
    private Integer age;

    public User() {
        System.out.println("1 调用了无参构造器创建对象");
    }

    public String getName() {
        return name;
    }

    public void initMethod(){
        System.out.println("4 bean对象初始化，调用指定的方法初始化");
    }

    public void destoryMethod(){
        System.out.println("7 bean对象销毁，调用指定的方法销毁");
    }

    public void setName(String name) {
        System.out.println("2 给bean对象设置属性值");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void run(){
        System.out.println("run..........");
    }
}
