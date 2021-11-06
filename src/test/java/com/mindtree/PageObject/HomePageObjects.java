package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;

import com.mindtree.UIStore.HomePageElements;

public class HomePageObjects {
	
	WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchbar() {
		driver.findElement(HomePageElements.searchbar).sendKeys("Messi");
	}
	
	public void searchbtn() {
		driver.findElement(HomePageElements.searchbtn).click();
	}

}
