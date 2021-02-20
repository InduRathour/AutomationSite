package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AutomationPracticeSitePage;

public class StepDefAutomationPracticeSite {
	AutomationPracticeSitePage aps;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		aps = new AutomationPracticeSitePage();
	}

	@When("user clicks on shop")
	public void user_clicks_on_shop() {
		aps.clickShop();
	}

	@When("user clicks on home")
	public void user_clicks_on_home() {
		aps.clickHome();
	}

	@Then("user is on slider page")
	public void user_is_on_slider_page() {
		aps.clickarrow1();
		aps.clickarrow2();
		aps.clickarrow3();
	}

	@Then("user is on arrival page")
	public void user_is_on_arrival_page() {
		aps.clickArrival();
	}

	@Then("each image should be clickable and navigable")
	public void each_image_should_be_clickable_and_navigable() {
		aps.clickImage();
	}

	@Then("user is on description page")
	public void user_is_on_description_page() {
		aps.DescriptionClick();
	}

	@Then("user clicks on review button")
	public void user_clicks_on_review_button() {
		aps.ReviewClick();
	}

}
