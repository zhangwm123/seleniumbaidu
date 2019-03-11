package danyuances;

public class yunsuan {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int ride(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public void chu(int a) {
		if(a%10==0) {
			System.out.println(a);
		}else {
			System.out.println("这个数不能被十整除");
			}
	}
}
