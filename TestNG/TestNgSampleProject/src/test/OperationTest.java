package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.service.Operation;

public class OperationTest {
  @Test
  public void testAdd() {
	  Operation op=new Operation();
	  int result=op.add(10,20);
	  assertEquals(result, 30);
  }
  @Test
  public void testSub() {
	 Operation op=new Operation();
	 int result=op.sub(10,5);
	 // try {
	 assertEquals(result, 5);
	 //}catch(AssertionError e){
	 // System.out.println(e);
  //}
  }
  @Test
  public void testMult() {
	  Operation op=new Operation();
	  int result=op.mul(3, 4);
	  assertEquals(result, 12);
	  
  }
  @Test
  public void testDiv() {
	  Operation op=new Operation();
	  int result=op.div(12,3);
	  assertEquals(result, 4);
	   
	  
  }
}
