import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bowsers {
	
	public static WebDriver driver;
	public static String url = "https://www.axisbank.com/";
	public static  WebDriver uday() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UDAY\\Documents\\JAVA\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions jk = new ChromeOptions();
		//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
		jk.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(jk);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;
		
	}

}
