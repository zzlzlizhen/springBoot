/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lizhen_pc
 *123
 */
@Controller
@RequestMapping("myConverter")
public class MyConverterController {

	@RequestMapping("/converter")
	public String converter(){
		return "/converter";
	}
	
	@RequestMapping(value="/myConverter",produces={"application/x-wisely"})
	@ResponseBody
	public DemoObj myConverter(@RequestBody DemoObj demoObj){
		return demoObj;
	}
}
