package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook08 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Capture Ur Memoriez\\eclipse\\org.mk\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				WebElement element = driver.findElement(By.id("u_0_2"));
		element.click();
		Thread.sleep(1000);
		WebElement dDnDay = driver.findElement(By.id("day"));
		String name = dDnDay.getText();
		System.out.println(name);
		WebElement dDnMonth = driver.findElement(By.id("month"));
		String name1 = dDnMonth.getText();
		System.out.println(name1);
			WebElement dDnYear = driver.findElement(By.id("year"));
		String name2 = dDnYear.getText();
		System.out.println(name2);
		
	}

}
