import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRcog {
	public static void main(String[] args) throws InterruptedException {
		String url="https://onecognizant.cognizant.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("770556");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='Log_On1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("html body div#DesktopPlatformBar header div.innerhead.gradient div.userpref div.searchpanel.cfx input#txtPlatformBarSearch.showTip.ui-autocomplete-input")).sendKeys("ti");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'ui-id-2\']/a")).click();
		Thread.sleep(2000);
		 Set <String> st=driver.getWindowHandles();
 		while(st.size()!=2) {
 			Thread.sleep(2000);
 			 st=driver.getWindowHandles();
 		}
 		driver.switchTo().window(st.toArray()[1].toString());
 		Thread.sleep(2000);
 			driver.findElement(By.xpath("//*[@id=\'CTS_TS_LAND_PER_DESCR30$0\']")).click();
 			Thread.sleep(9000);		
	    driver.findElement(By.xpath("//*[@id='CTS_EX_ACT_VW_DESCR$prompt$img$0']")).click();
	    }
	}