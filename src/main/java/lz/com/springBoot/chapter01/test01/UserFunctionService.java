/**
 * 
 */
package lz.com.springBoot.chapter01.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 *123
 */
@Service
public class UserFunctionService {

	/**
	 * 
	 * 使用@Autowired注解，将FunctionService的实体Bean注入到UserFunctionService中
	 * @Autowired是spring体重的注解
	 * 此处使用JSR-330的@Inject或者JSR-250的@Resource注解是等效的
	 */
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String world){
		
		return functionService.sayHello(world);
	}
}
