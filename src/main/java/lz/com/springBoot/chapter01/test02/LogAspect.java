/**
 * 
 */
package lz.com.springBoot.chapter01.test02;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author lizhen_pc
 *123
 * 通过@Aspect注解声明一个切面
 * 通过@Component让次切面成为Spring容器管理的bean
 */
@Aspect
@Component
public class LogAspect {

	/**
	 * 通过Pointcut注解声明切点
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午3:25:43
	 */
	@Pointcut("@annotation(lz.com.springBoot.chapter01.test02.Action)")
	public void annotationPointCut(){
		
	}
	/**
	 * 通过After注解声明一个建言，并使用@Pointcut定义的切点，
	 * 通过反射可获得注解上的属性，然后做日志记录相关的操作
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午3:26:10
	 * @param joinPoint
	 */
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截 "+action.name());
	}
	
	/**
	 * 通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午3:27:18
	 * @param joinPoint
	 */
	@Before("execution(* lz.com.springBoot.chapter01.test02.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法式拦截 "+method.getName());
	}
}
