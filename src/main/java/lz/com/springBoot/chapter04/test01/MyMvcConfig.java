/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author lizhen_pc
 *123
 */
@Configuration
@EnableWebMvc
@ComponentScan("lz.com.springBoot.chapter04.test01")
public class MyMvcConfig extends WebMvcConfigurerAdapter{

	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	//配置MultipartResolver,用MultipartFile 接受文件上传
	@Bean
	public MultipartResolver multipartResolver(){
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(1000000);
	    return multipartResolver;
	}
	
	/**
	 * 定义拦截器
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月22日 下午5:49:31
	 * @return
	 */
	@Bean
	public DemoInterceptor demoInterceptor(){
		return new DemoInterceptor();
	}
	/**
	 * 定义拦截器
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月22日 下午5:49:31
	 * @return
	 */
	@Bean
	public MyHttpMessageConverter myConverter(){
		return new MyHttpMessageConverter();
	}
	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(demoInterceptor());
	}
	/**
	 * 静态资源映射
	 * 指定addResourceLocations是文件放置的目录，addResourceHandler是对外暴露的访问路径
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}
	/**
	 * 添加简单的请求页面跳转
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("/index");
	}

	/**
	 * 如果请求的参数中含有. 等字符时，重写configurePathMatch方法，并把useSuffixPatternMatch设置为false
	 */
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		configurer.setUseSuffixPatternMatch(false);
	}

	/**
	 * 添加一个自定义的HttpMessageConverter
	 */
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(myConverter());
	}
	
	
}
