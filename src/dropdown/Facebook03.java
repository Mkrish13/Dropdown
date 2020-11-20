package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook03 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Capture Ur Memoriez\\eclipse\\org.mk\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("u_0_2"));
		element.click();
		
		Thread.sleep(1000);
		
		WebElement dDnMonth = driver.findElement(By.id("month"));
		Select select =new Select(dDnMonth);
		List<WebElement> options = select.getOptions();
		
		for (WebElement webElement : options) {
			String textmonth = webElement.getText();
			System.out.println(textmonth);
		}
		
		
	}

}


