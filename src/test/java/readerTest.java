import java.io.BufferedInputStream;

import javax.xml.transform.Templates;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.wangshuo.common.utils.StreamUtil;
import com.wangshuo.common.utils.StringUtil;

@SuppressWarnings("deprecation")
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations="spring-beans.xml")
public class readerTest {

	
	
	
	@Test
	public void ArticleTest(String src) {

		String file = StreamUtil.readTextFile("src/test/resources/text.txt");
		boolean contains = file.contains(file);

		String[] split = src.split("==");
		for (String string : split) {
			System.out.println(string);
		}

	}
	
	@Test
	public void hasText() {
		
		boolean text = StringUtil.hasText("src/test/java/readerTest");
	     
		
	}
	
		

	@Test
	public void redislist() {
		
		
		
	}
	
	
	
	

}
