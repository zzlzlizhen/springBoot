/**
 * 
 */
package lz.com.springBoot.chapter02.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizhen_pc
 *123
 */
public class Main {

	/**
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午5:54:30
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerPostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}

}
