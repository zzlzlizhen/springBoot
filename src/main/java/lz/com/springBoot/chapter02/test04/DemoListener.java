/**
 * 
 */
package lz.com.springBoot.chapter02.test04;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * @author lizhen_pc
 *123
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent arg0) {
		String msg = arg0.getMsg();
		System.out.println("我(demoListener)接受到(demoPublisher)发布的消息："+msg);
	}

}
