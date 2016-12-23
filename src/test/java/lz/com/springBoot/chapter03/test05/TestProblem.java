/**
 * 
 */
package lz.com.springBoot.chapter03.test05;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author lizhen_pc
 *123
 */
public class TestProblem {

	@Test
	public void testLinkHashMap(){
		Map map = new LinkedHashMap();
		map.put("/anno/pathvar/abc.123","lizhen");
		System.out.println(map.get("/anno/pathvar/abc.123"));
	}

}
