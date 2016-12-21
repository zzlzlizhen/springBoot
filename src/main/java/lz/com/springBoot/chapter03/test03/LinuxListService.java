/**
 * 
 */
package lz.com.springBoot.chapter03.test03;

/**
 * @author lizhen_pc
 *123
 */
public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
