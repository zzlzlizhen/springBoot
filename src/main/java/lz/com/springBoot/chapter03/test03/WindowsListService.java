/**
 * 
 */
package lz.com.springBoot.chapter03.test03;

/**
 * @author lizhen_pc
 *123
 */
public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}
