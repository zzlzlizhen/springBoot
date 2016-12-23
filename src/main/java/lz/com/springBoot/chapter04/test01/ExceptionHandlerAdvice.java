/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lizhen_pc
 * @ControllerAdvice声明一个控制器建言，组合了@Component注解
 *123
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

	/**
	 * @ExceptionHandler再这里定义为全局处理，通过value属性可以过滤条件，在此处我们拦截所有的Exception
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月22日 下午3:19:48
	 * @param exception
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value=Exception.class)
	public ModelAndView exception(Exception exception,WebRequest request){
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage",exception.getMessage());
		return modelAndView;
	}
	/**
	 * @ModelAttribute注解将键值对添加到全局，所有的注解@RequestMapping的方法可以获得此键值对
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月22日 下午3:20:44
	 * @param model
	 */
	@ModelAttribute
	public void addAttributes(Model model){
		model.addAttribute("msg","额外信息");
	}
	/**
	 * @InitBinder注解定制WebDataBinder
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月22日 下午3:22:27
	 * @param webDataBinder
	 */
	/*@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.setDisallowedFields("id");
	}*/
}
