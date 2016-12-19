/**
 * 
 */
package lz.com.springBoot.chapter01.test02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lizhen_pc
 * 123
 * 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter01.test02")
@EnableAspectJAutoProxy
public class AopConfig {

}
