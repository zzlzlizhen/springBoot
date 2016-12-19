/**
 * 
 */
package lz.com.springBoot.chapter02.test02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizhen_pc
 *123
 */
public class Main {

	/**
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午5:29:55
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig resourceService = context.getBean(ElConfig.class);
		resourceService.outputResource();
		context.close();
	}

}
