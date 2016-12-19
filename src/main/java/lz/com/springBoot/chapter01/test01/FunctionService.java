/**
 * 
 */
package lz.com.springBoot.chapter01.test01;

import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 *123
 * 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean
 */
@Service
public class FunctionService {

	public String sayHello(String world){
		return "Hello "+ world +"!";
	}
}
