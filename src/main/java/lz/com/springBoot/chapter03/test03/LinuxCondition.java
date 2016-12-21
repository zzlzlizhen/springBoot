/**
 * 
 */
package lz.com.springBoot.chapter03.test03;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author lizhen_pc
 *123
 */
public class LinuxCondition implements Condition {

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		return arg0.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
