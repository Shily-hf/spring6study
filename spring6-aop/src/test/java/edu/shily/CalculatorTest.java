package edu.shily;

import edu.shily.example.Calculator;
import edu.shily.example.CalculatorImpl;
import edu.shily.example.ProxyFactory;

class CalculatorTest {

    public static void main(String[] args) {
        // 创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        // proxy.add(1,2);
        proxy.mul(2,5);
    }


}