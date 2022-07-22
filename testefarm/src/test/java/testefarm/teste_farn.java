package testefarm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste_farn {
	
private WebDriver driver;
	

	
	@Before
	 public void abrirNavegador() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void testeNavegador() {
		 driver.get("https://www.farmrio.com.br/");
		 driver.findElement(By.id("search__input")).sendKeys("vestido");
		 driver.findElement(By.className("search__handle icon__button")).click();
		 		 
		 
	 }

}