package test;

import org.testng.annotations.Test;

public class bikeTest {
	 @Test(groups= {"loan"},priority=2)
	  public void bikeLoan() {
		 System.out.println("Bike Loan testing");
	  }
	  @Test
	  public void bikeColor() {
		 System.out.println("Bike color testing");
	  }
	  @Test
	  public void bikePrice() {
		 System.out.println("Bike price testing");
	  }
}
