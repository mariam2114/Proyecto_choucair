package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucair_Test {
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Empleos");
	By registerPageLocator = By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/empleosazuleMesa-de-trabajo-1-nzblz96gbj5m8za4qlepxwrbxs2sdu9rv7asuvteco.png\" ]");
	By buscarkeyword= By.id("search_keywords");
	By buscarlocation = By.id("search_location");
	By botonbuscar= By.cssSelector("input[value=\"Search Jobs\"]");
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.drive", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}

	@Test
	public void RegsterUser()throws InterruptedException  {
		String Empleo  = "Analista";
		String ciudad  = "Lima";
		
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(1000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(buscarkeyword).sendKeys(Empleo);
			driver.findElement(buscarlocation).sendKeys(ciudad);
			driver.findElement(buscarlocation).click();
			System.out.print(Empleo +" - " + ciudad);
			
		}
		else {
			System.out.print("no se encontro lo que busco");
		}
	}

}
