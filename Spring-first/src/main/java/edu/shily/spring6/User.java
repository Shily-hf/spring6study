package edu.shily.spring6;

/**
 * @author Shily-zhang
 * @Description
 */
public class User {

    public User() {
        System.out.println("0:使用了无参构造器......");
    }

    public void add(){
        System.out.println("1:调用了add方法......");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
