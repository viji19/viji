package day6.classroom;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Day6Erail {
	
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


List<WebElement> tab1 = driver.findElementsByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td[2]");
Set<String> tab11=new HashSet<String>();
for(WebElement eachTrain:tab1) {
	String eachTrains = eachTrain.getText();
	System.out.println(tab11.add(eachTrains));

}

}

	}




	
		

	



