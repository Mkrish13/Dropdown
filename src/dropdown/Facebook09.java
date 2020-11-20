package dropdown;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook09 {

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
		Set<WebElement> set = new HashSet<WebElement>(options);
		set.addAll(options);
		
		
		if (options.size()==set.size()) {
			System.out.println("No duplicates are Found");
		} else {
			System.out.println("Duplicates are Found");
		}
		
	
	}
}
