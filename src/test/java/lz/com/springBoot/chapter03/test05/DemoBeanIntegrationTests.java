/**
 * 
 */
package lz.com.springBoot.chapter03.test05;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lizhen_pc
 * @RunWith注解，在SpringJUnit4ClassRunner在JUnit环境下提供SpringTestContextFramework功能
 * @ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
 * @ActiveProfiles用来声明活动的profile
 * 
 *123
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

	@Autowired
	private TestBean testBean;
	
	@SuppressWarnings("deprecation")
	@Test
	public void prodBeanShouldInject(){
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
	
	
}
