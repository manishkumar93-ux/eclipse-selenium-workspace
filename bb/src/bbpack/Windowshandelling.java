package bbpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\acer\\eclipse-workspace\\bb\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());
driver.switchTo().window();





	}

}
