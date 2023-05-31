package edu.shily.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Shily-zhang
 * @Description 切面类
 */
@Component//交给ioc容器管理
@Aspect//切面类声明
public class LogAspect {
    //设置切入点和通知类型
    //切入点表达式：execution(访问修饰符 增强方法返回类型 增强方法所在全路径.方法名称（方法参数）)
    //通知（增强）类型五种
    //1.前置通知
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger->前置置通知，方法名称："+methodName+",参数："+ Arrays.toString(args));
    }
    //2.返回通知
    public void afterReturningMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger->返回通知,方法名称："+methodName+",返回结果："+result);
    }
    //3.异常通知
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger->后置通知，方法名称："+methodName+",异常信息："+ ex);
    }
    //4.后置通知
    // @After(value = "edu.shily.annotationaop.LogAspect.pointcut()") 不同包使用重用表达式的方法
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger->后置通知，方法名称："+methodName);
    }
    //5.环绕通知
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;

        try{
            System.out.println("环绕通知--目标方法之前执行");

            //调用目标方法
            result = joinPoint.proceed();

            System.out.println("环绕通知--目标方法之后执行");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            System.out.println("环绕通知--目标方法出现异常执行");
        }finally {
            System.out.println("环绕通知--目标方法执行完毕执行");
        }
        return result;
    }

    /**
     * @Description 重用切入点表达式
     * @Param
     */
    @Pointcut(value = "execution(public int edu.shily.xmlaop.CalculatorImpl.*(..))")
    public void pointcut(){}


}
