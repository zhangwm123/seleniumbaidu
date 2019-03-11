package canshuhua;

import org.testng.annotations.Test;

public class time {
@Test(timeOut=3250)
public void dd() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("hellow world");
}
}
