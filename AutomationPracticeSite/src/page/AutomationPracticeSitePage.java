package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestAutomatePracticeSite;

public class AutomationPracticeSitePage extends TestAutomatePracticeSite {
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement slider1;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement slider2;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement slider3;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival2;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival3;
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	WebElement descriptionTab;
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	WebElement reviewTab;

	public AutomationPracticeSitePage() {
		init();
		PageFactory.initElements(driver, this);
	}

//FirstTest
	public void clickShop() {
		shop.click();
	}

	public void clickHome() {
		home.click();
	}

	public void clickarrow1() {
		slider1.click();
		System.out.println("Slider1..!");
	}

	public void clickarrow2() {
		slider2.click();
		System.out.println("Slider2..!");
	}

	public void clickarrow3() {
		slider3.click();
		System.out.println("Slider3..!");
	}

	// Second Test
	public void clickArrival() {
		if (arrival1.isDisplayed() && arrival2.isDisplayed() && arrival3.isDisplayed()) {
			System.out.println("YES,***Arrivals***---- there are three arrivals...!");
		}
	}

	// Third Test
	public void clickImage() {
		arrival1.click();
		driver.navigate().back();
		arrival2.click();
		driver.navigate().back();
		arrival3.click();
	}

//Fourth Test
	public void DescriptionClick() {
		arrival1.click();
		descriptionTab.click();
		driver.navigate().back();
		arrival2.click();
		descriptionTab.click();
		driver.navigate().back();
		arrival3.click();
		descriptionTab.click();
	}

	// FifthTest
	public void ReviewClick() {
		arrival1.click();
		reviewTab.click();
		driver.navigate().back();
		arrival2.click();
		reviewTab.click();
		driver.navigate().back();
		arrival3.click();
		reviewTab.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
