/**
 * 
 */
package lz.com.springBoot.chapter01.test01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizhen_pc
 *123
 * @Configuration声明当前是一个配置类，
 * @ComponentScan，主动扫描包名下所以的@Service，@Component，@Repository，@Controller的类，并注册为bean
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter01.test01")
public class MyConfig {

	
}
