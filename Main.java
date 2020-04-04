import java.awt.print.Printable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.xmlbeans.impl.tool.PrettyPrinter;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Main extends xpath {
	@BeforeMethod
	public void nm(){
		driver = Bowsers.uday();
//		WebDriver driver;
	}
	@Test
	public void fs() throws IOException {
		Actions actions = new Actions(driver);
		WebElement st = driver.findElement(grabdeals);
		actions.moveToElement(st).build().perform();
		
		driver.findElement(emi). click();
		WebElement ot = driver.findElement(others);
		JavascriptExecutor jS =(JavascriptExecutor)driver;
		jS.executeScript("arguments[0].click();",ot);
		String exc =driver.findElement(cab).getText();
		Excel.write(exc,4, 5);
		driver.findElement(free).click();
		String sm=driver.getWindowHandle();
		//System.out.println(sm);
		//driver.switchTo().window(sm);
		java.util.Set<String> win=driver.getWindowHandles();
		for(String handle:win) {
			if(!handle.equals(sm)) {
				driver.switchTo().window(handle);
	
			}
		}
		
		String d = driver.findElement(pr).getText();
		System.out.println(d);
		driver.switchTo().window(sm);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
		File srr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srr, new File("C:\\Users\\UDAY\\eclipse-workspace\\Test\\src\\screenshot.png"));
		
		
	}
	
		
	
	
	
}
