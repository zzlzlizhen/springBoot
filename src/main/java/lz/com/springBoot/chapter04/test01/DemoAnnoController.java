/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lizhen_pc
 *123
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

	/**
	 * http://localhost:8080/springBoot/anno
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:41:07
	 * @param request
	 * @return
	 */
	@RequestMapping(produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String index(HttpServletRequest request){
		return "url:"+request.getRequestURI()+" can access";
	}
	/**
	 * http://localhost:8080/springBoot/anno/pathvar/test
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:41:07
	 * @param request
	 * @return
	 * /pathvar/{str:.+}
	 */
	@RequestMapping(value="/pathvar/{str}",produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String demoPathVar(@PathVariable String str,HttpServletRequest request){
		return "url:"+request.getRequestURI()+" can access,str:"+str;
	}
	/**
	 * http://localhost:8080/springBoot/anno/requestParam?id=1
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:41:07
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/requestParam",produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String passRequestParam(Long id,HttpServletRequest request){
		return "url:"+request.getRequestURI()+" can access,id:"+id;
	}
	/**
	 * http://localhost:8080/springBoot/anno/obj?id=1&name=test
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:41:07
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/obj",produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String passObj(DemoObj obj,HttpServletRequest request){
		return "url:"+request.getRequestURI()+" can access,obj id:"+obj.getId()+" obj name:"+obj.getName();
	}
	/**
	 * http://localhost:8080/springBoot/anno/obj?id=1&name=test
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:41:07
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getJson",produces="application/json;charset=UTF-8")
	@ResponseBody
	public DemoObj getJson(DemoObj obj,HttpServletRequest request){
		return new DemoObj(obj.getId()+1,obj.getName()+"yy");	}
	/**
	 * 不同的路径映射到同一个方法上
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月21日 下午5:47:35
	 * @param request
	 * @return
	 */
	@RequestMapping(value={"/name1","/name2"},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String remove(HttpServletRequest request){
		return "url:"+request.getRequestURI()+" can access";
	}
	
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg,DemoObj obj){
		throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute："+msg);
	}
}
