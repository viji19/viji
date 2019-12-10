package week2.assignment;



	
	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class drag {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJI\\eclipse\\LearnSelenium\\src\\driver\\chromedriver.exe");	// Initiate the ChromeBroswer

			//To open a Chrome Browser
			ChromeDriver driver = new ChromeDriver();
			//Loading a url
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			
			WebElement dropDown = driver.findElementById("dropdown1");
//			To interact with DropDowns
			Select dd = new Select(driver.findElementByXPath("//select[@multiple]"));
			
			
//			dd.selectByVisibleText("Appium");
//			dd.selectByValue("3");
			
			
			
			List<WebElement> options = dd.getOptions();
			int size = options.size();


			for(int i=0;i<size;i++) {
				System.out.println(options.get(i).getText());
			}
			
			
			
			
			/*dd.selectByIndex(1);
			
			dd.selectByIndex(2);
			
			dd.deselectByIndex(2);*/ 
			
			
			
			
			
			


		}

	}


