/**
 * 
 */
package lz.com.springBoot.chapter01.test01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizhen_pc
 *123
 */
public class Main {

	/**
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午2:57:40
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 使用AnnotationConfigApplicationContext作为Spring的容器，接收输入一个配置类作为参数
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
		System.out.println(userFunctionService.sayHello("world"));
		context.close();
	}

}
