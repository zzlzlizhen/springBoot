/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author lizhen_pc
 * 继承HandlerInterceptorAdapter类来实现自定义拦截器
 *123
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{

	/**
	 * 请求前拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime",startTime);
		return true;
	}

	/**
	 * 请求后拦截
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		long startTime = (Long)request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		System.out.println("本次请求处理时间为："+new Long(endTime-startTime)+"ms");
		request.setAttribute("handingTime",endTime-startTime);
	}

	
}
