package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class AppsPage extends PageBase{

	public AppsPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	
	}

	@FindBy(xpath="//*[@id=\"action-dropdown-parent-Categories\"]/span[1]")
	public
	WebElement categories ;

	@FindBy(linkText="Education")
	public
	WebElement education ;




}