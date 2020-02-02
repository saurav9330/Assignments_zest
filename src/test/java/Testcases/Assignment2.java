package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.base.Testbase;
import com.pages.Tripadvisor;

public class Assignment2 extends Testbase {

	public Assignment2() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
			}
	
	@Test()
	public void Tripadv() throws InterruptedException, IOException {
		driver.get("https://www.tripadvisor.in/");
		Tripadvisor tr=new Tripadvisor();
		tr.scrollpage();
		Thread.sleep(1000);
		tr.search();
		Thread.sleep(1000);
		tr.search_box("club mahindra");
		tr.search_button();
		Thread.sleep(2000);
		tr.first_hotel();
		Thread.sleep(1000);
		tr.iterator();
		tr.review_bttn();
		tr.iterator("tripadvisor");
		Thread.sleep(2000);
		tr.rating();
		tr.review_title("qwgfkwfh");
		tr.review_text("qohqiohfrihorehvofhvefohvlfhvlfvhflvhjflvhfvhlvhfjhvhfrhkrvhflvhfhvlfvhfrvhfrvhkvhfkvhfkhvkvhrhrhrfivhfihvirhvirhirhvirfhvihfifrhvihrfvihfvirfhvirfhvirhvirhvirhvifhvirhvirhvirhvirhvihrvihrhvihirhvirhvihr\"");
		//In above step it was compulsory to write 200 words in text box.
		tr.hotel_rating();
		tr.trip_type();
		tr.dropvalue();
		tr.iagree();
		tr.submit();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
