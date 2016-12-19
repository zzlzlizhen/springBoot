/**
 * 
 */
package lz.com.springBoot.chapter02.test02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 *123
 */
@Service
public class DemoService {

	/**
	 * 为属性注入普通的字符串
	 */
	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
	
}
