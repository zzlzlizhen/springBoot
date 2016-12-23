/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

/**
 * @author lizhen_pc
 * 继承AbstractHttpMessageConverter接口来实现自定义的MyHttpMessageConverter
 *123
 */
public class MyHttpMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

	/**
	 * 新建一个自定义的媒体类型application/x-wisely
	 */
	public MyHttpMessageConverter() {
		super(new MediaType("application","x-wisely",Charset.forName("UTF-8")));
	}
	
	/**
	 * 只处理DemoObj这个类
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		return DemoObj.class.isAssignableFrom(clazz);
	}

	/**
	 * 处理请求的数据，代码表明我们处理由-隔开的数据，并转成DemoObj对象
	 */
	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		String temp = StreamUtils.copyToString(inputMessage.getBody(),Charset.forName("UTF-8"));
		String[] tempArr = temp.split("-");
		return new DemoObj(new Long(tempArr[0]),tempArr[1]);
	}

	/**
	 * 处理如何输出数据到response，次例子，我们在原样输出前面加上“hello:”
	 */
	@Override
	protected void writeInternal(DemoObj t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out = "hello:"+t.getId()+"-"+t.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
