package day4.classroom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class erail {
	
		public static void main(String[] args) throws InterruptedException {

	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJI\\eclipse\\LearnSelenium\\src\\driver\\chromedriver.exe");	

	ChromeDriver driver = new ChromeDriver(); 
	driver.get("https://erail.in/");

	driver.manage().window().maximize();
	driver.findElementById("chkSelectDateOnly").click();
	WebElement source= driver.findElementById("txtStationFrom");
	source.clear();
	source.sendKeys("MAS",Keys.TAB);

	WebElement dest= driver.findElementById("txtStationTo");
	dest.clear();
	dest.sendKeys("SBC",Keys.TAB);

Thread.sleep(3000);


WebElement tab1 = driver.findElementByXPath("//div[@id='divMainWrapper']");

//WebElement  row1 = tab1.findElement(By.tagName("tr"));
List<WebElement> row1 = tab1.findElements(By.tagName("tr"));
int size = row1.size();
List<WebElement> col= row1.get(1).findElements(By.tagName("td"));


for (int i = 0; i <col.size(); i++) {
	
System.out.println(col.get(i).getText());
}




		}

	
		

	}


