package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class BookTest {

    // 使用原生方式进行对象的创建，set方法和构造器创建对象并赋值
    @Test
    public void testBook1() {
        Book book = new Book();
        book.setBookName("java");
        book.setAuthor("jack");
        System.out.println("book = " + book);

        Book book1 = new Book("hello","world");
        System.out.println("book1 = " + book1);
    }


    //使用配置文件进行对象的创建，也是使用set和构造器进行创建对象并赋值
    @Test
    public void testBook2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        // 使用构造器进行注入
        Book book = context.getBean("bookCon", Book.class);
        // 使用set方法进行注入
        // Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }


}
