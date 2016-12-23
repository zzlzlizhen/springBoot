/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author lizhen_pc
 * WebApplicationInitializer是spring提供用来配置Servlet3.0+配置的接口，从而实现了替换web.xml的位置。
 * 实现此接口将会自动被SpringServletContainerInitializer（用来启动Servlet3.0容器）获取到。
 * 
 * 新建WebApplicationContext，注册配置类，并将其和当前的servletContext关联
 * 
 * 注册SpringMVC的DispatcherServlet
 *123
 */
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(MyMvcConfig.class);
		webContext.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(webContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
	