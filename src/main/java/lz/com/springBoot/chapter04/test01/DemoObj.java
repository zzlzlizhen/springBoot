/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

/**
 * @author lizhen_pc
 *123
 */
public class DemoObj {

	private Long id;
	private String name;
	
	public DemoObj() {
		super();
	}
	public DemoObj(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
