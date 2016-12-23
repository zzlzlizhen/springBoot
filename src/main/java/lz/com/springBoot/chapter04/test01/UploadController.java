/**
 * 
 */
package lz.com.springBoot.chapter04.test01;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lizhen_pc
 *123
 */
@Controller
public class UploadController {
	@RequestMapping(value="/toUpload")
	public String toUpload(){
		return "upload";
	}
	
	@RequestMapping(value="/uploadFile",method=RequestMethod.POST)
	
	public  String upload(MultipartFile file,HttpServletRequest request) throws IOException{
        
		FileUtils.writeByteArrayToFile(new File("F:/javaStart/springBoot/upload/" + file.getOriginalFilename()), file.getBytes());
			
		return "upload";
	}
}
