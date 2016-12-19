/**
 * 
 */
package lz.com.springBoot.chapter02.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizhen_pc
 *123
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter02.test03")
public class PerPostConfig {

	/**
	 * initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造函数之后，Bean销毁之前执行
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午5:52:42
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destroy")
	public BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	public JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
