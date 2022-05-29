package com.archeyTypeMaven.practice.MavenArcheyType;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test
	public void getMethodName()
	{
		String name="kalyani";
		System.out.println(name); 
	}
	@Test
	public void hello()
	{
		System.out.println("hai");
	}
	@Test
	public void openBowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Temp\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.gmail.com");
		
	}

}
