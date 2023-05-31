package edu.shily.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Shily-zhang
 * @Description
 */
public class CarTest {

        // 1 获取Class对象的多种方法
        @Test
        public void test01() throws Exception {
            // 类名.class
            Class clazz1 = Car.class;

            // 对象.getClass()
            Class clazz2 = new Car().getClass();

            // Class.forName("全类名")
            Class clazz3 = Class.forName("edu.shily.reflect.Car");

            //实例化
            Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
            System.out.println(car);
        }
        // 2 获取构造方法
        @Test
        public void test02() throws Exception {
            Class<Car> clazz = Car.class;
            // clazz.getConstructors()获取所有public的构造方法，无法获取私有
            // getDeclaredConstructors获取所有构造方法包括公共和私有
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("方法名称："+constructor.getName()+"参数个数："+constructor.getParameterCount());
            }

            //构造器私有
            Constructor<Car> constructor = clazz.getDeclaredConstructor(String.class, Integer.class, String.class);
            constructor.setAccessible(true);
            Car car = constructor.newInstance("你好", 10, "红色");
            System.out.println(car);
        }

        @Test
        // 3 获取属性
        public void test03(){
            Class<Car> clazz = Car.class;
            //获取所有public方法
            Field[] field = clazz.getFields();
            //获取所有属性包括私有方法
            Field[] fields = clazz.getDeclaredFields();
            for (Field field1 : fields) {
                System.out.println(field1.getName());
            }
        }

        // 4 获取方法
        @Test
        public void test04() throws Exception {
            Car car = new Car("奔驰", 10, "黑色");
            Class<? extends Car> clazz = car.getClass();
            //public方法
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                // System.out.println(method.getName());
                if (method.getName().equals("toString")){
                    String invoke = (String) method.invoke(car);
                    System.out.println("toString执行了"+invoke);
                }
            }
            //private方法
            Method[] methods1 = clazz.getDeclaredMethods();
            for (Method method : methods1) {
                if (method.getName().equals("run")){
                    method.setAccessible(true);
                    method.invoke(car);
                }
            }


        }


}
