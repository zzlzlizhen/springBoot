/**
 * 
 */
package lz.com.springBoot.chapter02.test01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author lizhen_pc
 * 声明Scope为Prototype类型，即多例
 *123
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
