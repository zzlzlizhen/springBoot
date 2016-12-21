/**
 * 
 */
package lz.com.springBoot.chapter03.test02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author lizhen_pc
 *123
 * @EnableScheduling，开启对计划任务的支持
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter03.test02")
@EnableScheduling
public class TaskSchedulerConfig {

}
