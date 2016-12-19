/**
 * 
 */
package lz.com.springBoot.chapter02.test02;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author lizhen_pc
 *123
 */
@Configuration
@ComponentScan("lz.com.springBoot.chapter02.test02")
@PropertySource("classpath:lz/com/springBoot/chapter02/test02/test.properties")
public class ElConfig {
	
	@Autowired
	private Environment environment;
	
	@Value("I Love You!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("classpath:lz/com/springBoot/chapter02/test02/test.json")
	private Resource testFile;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${person.name}")
	private String personName;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(personName);
			System.out.println(environment.getProperty("person.age"));
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
