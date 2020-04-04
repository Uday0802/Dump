import org.openqa.selenium.By;

public class xpath extends Bowsers {
	
	static By grabdeals = By.xpath("//a[text()='Grab Deals']");
	static By emi = By.xpath("(//a[text()='EMI'])[2]");
	static By others=By.xpath("//*[@id=\"dvGrabdealsCategory\"]/div[2]/label");
	static By cab= By.xpath("//*[text()='Cub McPaws']");
	static By free=By.xpath("(//ul[@id='ulGrabDeals']//child::a[@class='travelTnc'])[6]");
	static By logo=By.xpath("//img[@alt='Axis Bank logo to homepage']");
	static By pr=By.xpath("//h6[@class='detail']");
			

}
