/**
 * 
 */
package lz.com.springBoot.chapter03.test01;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author lizhen_pc
 *123
 *	利用@EnableAsync注解开启异步任务支持
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter03.test01")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

	/**
	 * 配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，
	 * 并返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor
	 */
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
