package week4.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement myself=driver.findElement(By.id("REGISTERED_BY"));
		
	  Select profile1= new Select(myself);
	  profile1.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("indhu");
		driver.findElement(By.id("genderfemale")).click();
		WebElement religion=driver.findElement(By.id("RELIGION"));
		Select profile2=new Select(religion);
		profile2.selectByVisibleText("Hindu");
		 driver.findElement(By.id("DOBDAY")).sendKeys("3");
		 driver.findElement(By.id("DOBMONTH")).sendKeys("jul");
		 driver.findElement(By.id("DOBYEAR")).sendKeys("2001");
		 driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Tamil");
		 
		 WebElement con = driver.findElement(By.id("COUNTRY"));
		 
		 Select sc = new Select(con);
		 sc.selectByVisibleText("India");
		 
		 
		// driver.findElement(By.id("COUNTRY")).sendKeys("India");
		// Thread.sleep(2000);
		 driver.findElement(By.id("MOBILENO")).sendKeys("9193469021");
		 driver.findElement(By.id("EMAIL")).sendKeys("indhu0@gmail.com");
		 
	}

}
