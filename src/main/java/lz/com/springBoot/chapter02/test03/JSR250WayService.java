/**
 * 
 */
package lz.com.springBoot.chapter02.test03;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author lizhen_pc
 *123
 */
public class JSR250WayService {

	/**
	 * 在构造函数执行完之后执行
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午5:48:35
	 */
	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService(){
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	/**
	 * 在Bean销毁之前执行
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月19日 下午5:48:54
	 */
	@PreDestroy
	public void destroy(){
		System.out.println("jsr250-destroy-method");
	}
}
