/**
 * 
 */
package lz.com.springBoot.chapter02.test04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizhen_pc
 *123
 */
public class Main {

	/**
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午6:13:39
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		demoPublisher.publish("hello application event");
		context.close();
	}

}
