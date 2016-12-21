/**
 * 
 */
package lz.com.springBoot.chapter03.test01;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 * @Async注解，表明该方法是个异步方法，如果注解在类级别上，则表明该类里所有的方法都是异步的。
 * 这里的方法会被自动注入使用ThreadPoolTaskExecutor作为TaskExecutor
 *123
 */
@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("执行异步任务："+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步任务+1："+(i+1));
	}
}
