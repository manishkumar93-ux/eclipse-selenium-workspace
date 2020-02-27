package bbpack;

import org.testng.annotations.Test;

public class Newpack {
	@Test(groups= {"sanity-group","regression-group","esehi-group"})
	public void testone(){
		System.out.println("sanity");
		
		
	}
	@Test(groups= {"sanity-group"})
	public void testtwo() {
		System.out.println("sanity");
	}
@Test(groups= {"regression-group"})
public void testthree() {
	
	System.out.println("regression");
}
}
