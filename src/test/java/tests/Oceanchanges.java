package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oceanchanges {
	  public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Title: " + driver.getTitle());
	        System.out.println("URL:" + driver.getCurrentUrl());
	        System.out.println("moved code to Ocean team");
	        driver.quit();
	    }

}
