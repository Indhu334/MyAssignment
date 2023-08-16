package week4.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
       WebElement nam = driver.findElement(By.name("firstname"));
       nam.sendKeys("pop");
       WebElement emailid=driver.findElement(By.name("reg_email__"));
       emailid.sendKeys("indhu02@gmail.com");
      
       WebElement pass=driver.findElement(By.name("reg_passwd__"));
       pass.sendKeys("1234");
     
       WebElement day = driver.findElement(By.name("birthday_day"));
       Select clicday = new Select(day);
       clicday.selectByVisibleText("3");
       
       WebElement month = driver.findElement(By.id("month"));
       Select clicmonth =new Select(month);
       clicmonth.selectByVisibleText("Jul");
       
       WebElement year = driver.findElement(By.name("birthday_year"));
       Select clicyear=new Select(year);
       clicyear.selectByValue("2001");
       WebElement fem = driver.findElement(By.xpath("//label[text()='Female']"));
       fem.click();
       driver.close();
       
       
       
       
       
       
       
       
       
       
	}

}
