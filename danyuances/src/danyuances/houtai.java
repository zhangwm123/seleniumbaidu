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
	 * ��½--��ӿ�������--�������-������Ⲣ��ӡ-���ѧ��-���ȫ��ѧ������ӡ
	 * */
	public <WebDriver> void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
	}
	/*@AfterClass
	public void b() {
		
	}*/
}
