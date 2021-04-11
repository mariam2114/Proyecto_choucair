package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucair_test_direccionamiento {
	private WebDriver driver;
	By EmpleosLinkLocator = By.linkText("Empleos");
	By ChocairPageLocator = By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/serchazuleMesa-de-trabajo-1-nzblz88m4p4bxdbhw303dezvce7f6561j2nbdlusiw.png\" ]");

	
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
		
		driver.findElement(EmpleosLinkLocator).click();
		Thread.sleep(1000);
		driver.findElement(ChocairPageLocator).click();
		
		
	}

}
