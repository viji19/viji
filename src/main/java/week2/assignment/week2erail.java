package week2.assignment;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class week2erail {

	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJI\\eclipse\\LearnSelenium\\src\\driver\\chromedriver.exe");	// Initiate the ChromeBroswer

		// Maximize the browser
//ChromeDriver driver = new ChromeDriver();

ChromeDriver driver = new ChromeDriver(); 
driver.get("http://leaftaps.com/opentaps/control/main");

// Maximize the browser

// Enter the UserName
WebElement username = driver.findElementById("username");
username.sendKeys("DemoSalesManager");
// Enter the Password
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElementByLinkText("CRM/SFA").click();

driver.findElementByLinkText("Leads").click();
//driver.findElementByLinkText("Create Lead").click();
driver.findElementByLinkText("Find Leads").click();
driver.findElementByLinkText("Phone").click();

driver.findElementByName("phoneCountryCode").clear();
driver.findElementByName("phoneCountryCode").sendKeys("12");
driver.findElementByName("phoneAreaCode").sendKeys("601");	
driver.findElementByName("phoneNumber").sendKeys("1234567890");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[text()='Find Leads']")).click();



//Actions actions = new Actions(driver);
//WebElement find =driver.findElement(By.xpath("//button[text()='Find Leads']")).click();;
//actions.moveToElement(find).click().perform();




//Actions actions = new Actions(driver);
//WebElement find=driver.findElementByXPath("(//td[@class='x-btn-center']//button)[1]");
//actions.moveToElement(find).click().perform();



//driver.findElementByClassName("x-tool x-tool-close").click();
//driver.findElementByXPath("(//td[@class='x-btn-center']//button)[1]").click();
List<WebElement> tab1=driver.findElements(By.xpath("//div[@class='x-panel-body xedit-grid']"));
driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();





String leadIDContactNameFirst = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")).getText();



//WebElement tab1 = driver.findElementByXPath("//div[@class='x-panel-body xedit-grid']");
//List<WebElement> row1 = tab1.findElements(By.tagName("td"));
//driver.findElementByLinkText("11270").click();
//driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/following::a").click();


System.out.println(By.xpath("leadIDContactNameFirst"));

//12 601-1234567890


} 
}
