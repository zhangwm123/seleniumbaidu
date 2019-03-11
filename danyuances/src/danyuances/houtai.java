package danyuances;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class houtai{
	/*@BeforeClass
	public void a() {
		
	}*/
	@Test
	/*
	 * 登陆--添加考试类型--添加试题-浏览试题并打印-添加学生-浏览全部学生并打印
	 * */
	public <WebDriver> void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
	}
	/*@AfterClass
	public void b() {
		
	}*/
}
