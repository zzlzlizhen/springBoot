/**
 * 
 */
package lz.com.springBoot.chapter02.test04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author lizhen_pc
 *123
 */
@Component
public class DemoPublisher {

	@Autowired
	public ApplicationContext applicationContext;
	
	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(applicationContext,msg));
	}
}
