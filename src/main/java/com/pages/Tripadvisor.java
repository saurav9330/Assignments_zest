package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QA.base.Testbase;

public class Tripadvisor extends Testbase {

	

	@FindBy(xpath="//div[contains(@class,'brand-global-nav-action-search-Search__searchButton')]")
	WebElement Searchbutton;
	@FindBy(id="mainSearch")
	WebElement Searchbox;
	@FindBy(id="SEARCH_BUTTON")
	WebElement Gobutton;
	@FindBy(xpath="(//div[@class='result-title'])[1]")
	WebElement Search_result;
	@FindBy(linkText="Write a review")
	WebElement Review_button;
	@FindBy(id="ReviewTitle")
	WebElement Review_title;
	@FindBy(id="ReviewText")
	WebElement Review_text;
	@FindBy(id="qid12_bubbles")
	WebElement Hotel_rating;
	@FindBy(xpath="//div[@data-category='Business']")
	WebElement Trip_type;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement Agreement;
	@FindBy(id="SUBMIT")
	WebElement Review_submit;
	
	public Tripadvisor() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public void search() {
		Searchbutton.click();
	}
	public void search_box(String hotel) {
		Searchbox.sendKeys(hotel);
	}
	public void search_button() {
		Gobutton.click();
	}
	public void first_hotel() {
		Search_result.click();
	}
	public void review_bttn() {
		Review_button.click();
	}
	public void review_title(String title) {
		Review_title.sendKeys(title);
	}
	public void review_text(String text) {
		Review_text.sendKeys(text);
	}
	public void hotel_rating() {
		Hotel_rating.click();
	}
	public void trip_type() {
		Trip_type.click();
	}
	public void iagree() {
		Agreement.click();
	}
	public void submit() {
		Review_submit.click();
	}
	
	public void scrollpage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void iterator() {
		Set<String> win=driver.getWindowHandles();
		Iterator<String> win1=win.iterator();
		win1.next();
		String child3=win1.next();
		driver.switchTo().window(child3);
	}
	public void iterator(String obj) {
		Set<String> win2=driver.getWindowHandles();
		Iterator<String> win3=win2.iterator();
		win3.next();
		win3.next();
		String child4=win3.next();
		driver.switchTo().window(child4);
	}
	public void rating() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='bubble_rating']/img"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//span[@id='bubble_rating']"))).click().build().perform();
	}
	
	public void dropvalue() {
		Select s=new Select(driver.findElement(By.id("trip_date_month_year")));
		s.selectByIndex(2);
	}
}
