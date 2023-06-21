package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePageSubscription extends PageBase{

	public HomePageSubscription(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}

	public boolean doesPlansExist(){
		return lite_header.isDisplayed()&& classic_header.isDisplayed()&& premium_header.isDisplayed();
	}
	public List<String>  getPricesDetails(){
		ArrayList<String> priceOptions=new ArrayList<String>();
		priceOptions.add(lite_Monthly_price.getText());
		priceOptions.add(classic_Monthly_price.getText());
		priceOptions.add(premium_Monthly_price.getText());
		return priceOptions;
	}
	public List<String> getDiscoveryOptions(){

		ArrayList<String> discoveryOptions=new ArrayList<String>();
		discoveryOptions.add(lite_discovery.getText());
		discoveryOptions.add(classic_discovery.getText());
		discoveryOptions.add(premium_discovery.getText());
		return discoveryOptions;

	}
	public List<String> getFreeTrial(){
		//This method for Free Trial that has a period of time
		ArrayList<String> freeTrialOptions=new ArrayList<String>();
		freeTrialOptions.add(lite_free_trial.getText());
		freeTrialOptions.add(classic_free_trial.getText());
		freeTrialOptions.add(premium_free_trial.getText());
		return freeTrialOptions;
	}

	public List<Boolean> isFreeTrialIncluded(){
		//This method is for Free Trial with check sign only
		ArrayList<String> includeFreeTrialOptions=new ArrayList<String>();
		includeFreeTrialOptions.add(lite_free_trial.findElements(By.xpath("./child::*")).get(0).getAttribute("src"));
		includeFreeTrialOptions.add(classic_free_trial.findElements(By.xpath("./child::*")).get(0).getAttribute("src"));
		includeFreeTrialOptions.add(premium_free_trial.findElements(By.xpath("./child::*")).get(0).getAttribute("src"));

		List<Boolean> FilteredIncludeFreeTrialOptions= includeFreeTrialOptions.stream().map(imgURL ->imgURL.contains("jawwy_check")). collect(Collectors.toList());
		return FilteredIncludeFreeTrialOptions;
	}
	public List<String> getVideoQuality(){
		ArrayList<String> videoQualityOptions=new ArrayList<String>();
		videoQualityOptions.add(lite_video_quality.getText());
		videoQualityOptions.add(classic_video_quality.getText());
		videoQualityOptions.add(premium_video_quality.getText());
		return videoQualityOptions;
	}

	public List<String> getDeviceAccess(){
		ArrayList<String> DeviceOptions=new ArrayList<String>();
		DeviceOptions.add(lite_device_access.getText());
		DeviceOptions.add(classic_device_access.getText());
		DeviceOptions.add(premium_device_access.getText());
		return DeviceOptions;
	}
	public List<String> GetRewindOptions(){
		ArrayList<String> rewindOptions=new ArrayList<String>();
		rewindOptions.add(lite_Rewind.getText());
		rewindOptions.add(classic_Rewind.getText());
		rewindOptions.add(premium_Rewind.getText());
		return rewindOptions;
	}
	public List<Boolean> GetCastingOptions(){
		ArrayList<String> castingOptions=new ArrayList<String>();
		castingOptions.add(lite_cast_to_tv.getAttribute("src"));
		castingOptions.add(classic_cast_to_tv.getAttribute("src"));
		castingOptions.add(premium_cast_to_tv.getAttribute("src"));
		List<Boolean> FilteredCastingOptions= castingOptions.stream().map(imgURL ->imgURL.contains("jawwy_check")). collect(Collectors.toList());;
		return FilteredCastingOptions;
	}//if image is "check"=> true, else "false"

	public List<Boolean> GetOfflineOptions(){

		ArrayList<String> offlineOptions=new ArrayList<String>();
		offlineOptions.add(lite_watch_offline.getAttribute("src"));
		offlineOptions.add(classic_watch_offline.getAttribute("src"));
		offlineOptions.add(premium_watch_offline.getAttribute("src"));
		List<Boolean> FilteredOfflineOptions= offlineOptions.stream().map(imgURL ->imgURL.contains("jawwy_check")). collect(Collectors.toList());;
		return FilteredOfflineOptions;
	}//if image is "check"=> true, else "false"

	public ArrayList<Integer> getSimiWatchingOptions(){

		ArrayList<WebElement> RAWOptions=new ArrayList<>();
		RAWOptions.add(lite_watch_simultaneously);
		RAWOptions.add(classic_watch_simultaneously);
		RAWOptions.add(premium_watch_simultaneously);

		ArrayList<Integer> NumberOptions=new ArrayList<>();
		//array element contains image set to 0, else substring[0] to get number of devices
		for (int i=0; i<3;i++){
			if(RAWOptions.get(i).getTagName().equals("img")){
				NumberOptions.add(i,0);
			}else{
				NumberOptions.add(i,Character.getNumericValue(RAWOptions.get(i).getText().charAt(0)));
			}
		}
		return NumberOptions;
	}

	@FindBy(xpath="//*[@id=\"name-lite\"]")
	public 
    WebElement lite_header ;

	@FindBy(xpath="//*[@id=\"name-classic\"]")
	public
	WebElement classic_header ;

	@FindBy(xpath="//*[@id=\"name-premium\"]")
	public
	WebElement premium_header ;

	@FindBy(xpath="//*[@id=\"currency-lite\"]")
	public
	WebElement lite_Monthly_price ;

	@FindBy(xpath="//*[@id=\"currency-classic\"]")
	public
	WebElement classic_Monthly_price ;

	@FindBy(xpath="//*[@id=\"currency-premium\"]")
	public
	WebElement premium_Monthly_price ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[1]")
	public
	WebElement lite_discovery ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[2]")
	public
	WebElement classic_discovery ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[3]")
	public
	WebElement premium_discovery ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[5]/div[2]/div[1]")
	public
	WebElement lite_free_trial ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[5]/div[2]/div[2]")
	public
	WebElement classic_free_trial ;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[5]/div[2]/div[3]")
	public
	WebElement premium_free_trial ;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[6]/div[2]/div[1]")
	public
	WebElement lite_video_quality;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[6]/div[2]/div[2]")
	public
	WebElement classic_video_quality;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[6]/div[2]/div[3]")
	public
	WebElement premium_video_quality;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[7]/div[2]/div[1]")
	public
	WebElement lite_device_access;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[7]/div[2]/div[2]")
	public
	WebElement classic_device_access;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[7]/div[2]/div[3]")
	public
	WebElement premium_device_access;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[8]/div[2]/div[1]")
	public
	WebElement lite_Rewind;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[8]/div[2]/div[2]")
	public
	WebElement classic_Rewind;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[8]/div[2]/div[3]")
	public
	WebElement premium_Rewind;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[9]/div[2]/div[1]/img")
	public
	WebElement lite_watch_offline;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[9]/div[2]/div[2]/img")
	public
	WebElement classic_watch_offline;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[9]/div[2]/div[3]/img")
	public
	WebElement premium_watch_offline;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[10]/div[2]/div[1]/img")
	public
	WebElement lite_watch_simultaneously;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[10]/div[2]/div[2]")
	public
	WebElement classic_watch_simultaneously;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[10]/div[2]/div[3]")
	public
	WebElement premium_watch_simultaneously;

	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[11]/div[2]/div[1]/img")
	public
	WebElement lite_cast_to_tv;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/div[11]/div[2]/div[2]/img")
	public
	WebElement classic_cast_to_tv;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[11]/div[2]/div[3]/img")
	public
	WebElement premium_cast_to_tv;
}