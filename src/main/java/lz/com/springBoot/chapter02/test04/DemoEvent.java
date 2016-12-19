/**
 * 
 */
package lz.com.springBoot.chapter02.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @author lizhen_pc
 *123
 * spring的事件需要遵循如下流程
 * 1，自定义事件，继承ApplicationEvent
 * 2，定义事件监听器，实现ApplicationListener
 * 3，使用容器发布事件
 */
public class DemoEvent extends ApplicationContextEvent{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;
	
	/**
	 * @param source
	 */
	public DemoEvent(ApplicationContext source,String msg) {
		super(source);
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
}
