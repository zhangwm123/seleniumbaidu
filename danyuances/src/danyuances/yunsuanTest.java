package danyuances;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class yunsuanTest {

	yunsuan y=new yunsuan();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/*@Test
	public void testAdd() {
		int result=y.add(1, 4);
		//����,�ж�Ԥ�ڽ����ʵ�ʽ���Ƿ����
		assertEquals(5,result);
	}

	@Test
	public void testSub() {
		int result=y.sub(10, 3);
		//����,�ж�Ԥ�ڽ����ʵ�ʽ���Ƿ����
		assertEquals(7,result);
	}

	@Test
	public void testRide() {
		int result=y.ride(5, 5);
		//����,�ж�Ԥ�ڽ����ʵ�ʽ���Ƿ����
		assertEquals(25,result);
	}*/

	@Test
	public void testDiv() {
		y.chu(50);
	}

}
