package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

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
driver.findElementByLinkText("CRM/SFA").click();

driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
driver.findElementById("createLeadForm_firstName").sendKeys("viji");
driver.findElementById("createLeadForm_lastName").sendKeys("Umapathy");

		
driver.manage().window().maximize();
driver.findElementById("createLeadForm_dataSourceId");

Select dd = new Select(driver.findElementById("createLeadForm_dataSourceId"));
dd.selectByIndex(4);

Select cur = new Select(driver.findElementById("createLeadForm_currencyUomId"));
cur.selectByValue("INR");
//driver.findElementByValue("INR").sendKeys("viji");

//dd.getOptions();

//List<WebElement> options = dd.getOptions();;
//dd.selectByIndex(options-1);

//driver.findElementByName("submitButton").click();




		// Verify the Lead is created by checking the Company or First Name

	}

	//private static void size() {
		// TODO Auto-generated method stub
		
	

}
