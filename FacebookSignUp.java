//Below is the Code for Automated Web Registraion Using Selenium

//Enter your package name or keep the package as default

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Prathamesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Sawant");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("pratham.sawant@anything.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pratham.sawant@anything.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("prath@123");
		Thread.sleep(2000);
    
		//To Select Date of Birth
    
		Select obj = new Select(driver.findElement(By.id("day")));
		obj.selectByIndex(8);
		
		Select obj2 = new Select(driver.findElement(By.id("month")));
		obj2.selectByValue("7");
		
		Select obj3 = new Select(driver.findElement(By.id("year")));
		obj3.selectByVisibleText("2000");
		Thread.sleep(2000);
    
		driver.findElement(By.xpath("//*[ text() = 'Male']")).click();         //To choose Gender
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[name = 'websubmit']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
