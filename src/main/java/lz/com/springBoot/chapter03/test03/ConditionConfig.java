/**
 * 
 */
package lz.com.springBoot.chapter03.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizhen_pc
 * @Conditional注解，符合Windows条件则实例化windowsListService
 * 符合Linux条件则实例化linuxListService
 *123
 */
@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService(){
		return new LinuxListService();
	}
}
