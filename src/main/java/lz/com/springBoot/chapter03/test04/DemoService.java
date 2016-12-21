/**
 * 
 */
package lz.com.springBoot.chapter03.test04;

import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 *123
 */
@Service
public class DemoService {

	public void outputResult(){
		System.out.println("从组合注解配置照样获得bean的实例");
	}
}
