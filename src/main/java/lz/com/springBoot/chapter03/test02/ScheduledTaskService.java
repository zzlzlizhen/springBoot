/**
 * 
 */
package lz.com.springBoot.chapter03.test02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 *123
 */
@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	/**
	 * 使用fixedRate属性，指定每隔固定时间执行
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月20日 下午3:36:58
	 */
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		System.out.println("每隔五秒执行一次"+sdf.format(new Date()));
	}
	
	/**
	 * 使用cron，指定具体时间执行。cron是UNIX系统下的定义任务
	 * 每天的15点43分执行
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月20日 下午3:37:31
	 */
	@Scheduled(cron = "0 43 15 ? * *")
	public void fixTimeExecution(){
		System.out.println("指定时间："+sdf.format(new Date())+"执行");
	}
}
