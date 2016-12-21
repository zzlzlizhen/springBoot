/**
 * 
 */
package lz.com.springBoot.chapter03.test05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author lizhen_pc
 *123
 */
@Configuration
public class TestConfig {

	@Bean
	@Profile("dev")
	public TestBean devTestBean(){
		return new TestBean("from development profile");
	}
	
	@Bean
	@Profile("prod")
	public TestBean prodTestBean(){
		return new TestBean("from production profile");
	}
}
