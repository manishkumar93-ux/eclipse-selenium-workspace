package bbpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestivedropdon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\acer\\eclipse-workspace\\bb\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAiA98TxBRBtEiwAVRLqu5yuL58YadLsqXn6A0MSofej_lOOFn6qePr_2h_G1vr15Oa09759NBoCotQQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=CjwKCAiA98TxBRBtEiwAVRLqu5yuL58YadLsqXn6A0MSofej_lOOFn6qePr_2h_G1vr15Oa09759NBoCotQQAvD_BwE:G:s");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("ban");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.DOWN);	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.DOWN);
	}

}
