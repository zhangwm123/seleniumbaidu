package canshuhua;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class yunsuan {
	@DataProvider(name="add")
	public Object[][] date(){
		return new Object[][] {{"1","2"},{"10","1"},{"25","5"}};
	}
	@Test(dataProvider="add")
	public void size(String a,String b) {
		int n = Integer.parseInt(a);
		int m = Integer.parseInt(b);
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(n*m);
		System.out.println(n/m);
	}
	
}
