package danyuances;

import org.testng.annotations.Test;
import danyuances.yunsuan;


import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class yunsuanTesng {
	yunsuan y=new yunsuan();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }


  @Test
  public void add() {
    int result=y.add(2, 3);
    Assert.assertEquals(result, 5);
  }

  @Test
  public void div() {
    int result=y.div(6, 1);
    Assert.assertEquals(result, 6);
  }

  @Test
  public void ride() {
    int result=y.ride(9, 3);
    Assert.assertEquals(result, 27);
  }

  @Test
  public void sub() {
	  int result=y.sub(5, 3);
	    Assert.assertEquals(result, 2);
  }
}
