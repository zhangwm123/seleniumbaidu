package danyuances;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class zhengchuTest {
	zhengchu b=new zhengchu();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void chu() {
    int result=b.chu(10);
  }
}
