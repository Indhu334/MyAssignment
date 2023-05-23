package week3.day1;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  //ChromeDriver driver= new ChromeDriver();
   EdgeDriver driver = new EdgeDriver();
   driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java ");
   driver.manage().window().maximize();
   Thread.sleep(2000);
  driver.close();
  
  
	}

}
