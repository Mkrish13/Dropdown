package dropdown;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook10 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Capture Ur Memoriez\\eclipse\\org.mk\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("u_0_2"));
		element.click();
		
		Thread.sleep(1000);
		
		WebElement dDnYear = driver.findElement(By.id("year"));
		Select select =new Select(dDnYear);
		
		
		List<WebElement> options = select.getOptions();
		Set<WebElement> set = new HashSet<WebElement>(options);
		set.addAll(options);
		
		
		if (options.size()==set.size()) {
			System.out.println("No duplicates are Found");
		} else {
			System.out.println("Duplicates are Found");
		}
		
	}
}
