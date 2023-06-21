package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageSubscription;
import java.util.ArrayList;
import java.util.Arrays;

public class AppsPageTest extends TestBase {
	HomePageSubscription homeObject;
	@Test(priority = 1)
	void Validate_SA_Plan(){
		//Go to SA Page
		String URL="https://subscribe.stctv.com/sa-en";
		driver.navigate().to(URL);
		homeObject = new HomePageSubscription(driver);
		//assert 3 plans exists
		Assert.assertTrue(homeObject.doesPlansExist());
		//assert prices & currency for 3 plans
		ArrayList<String> ExpectedPrices=new ArrayList<String>(Arrays.asList("15 SAR/month","25 SAR/month","60 SAR/month"));
		Assert.assertEquals(homeObject.getPricesDetails(),ExpectedPrices);
		//assert discovery for all 3 plans
		ArrayList<String> ExpectedDiscovery=new ArrayList<String>(Arrays.asList("Included","Included","Included"));
		Assert.assertEquals(homeObject.getDiscoveryOptions(),ExpectedDiscovery);
		//asser free trial for all 3 plans
		ArrayList<String> ExpectedFreeTrial=new ArrayList<String>(Arrays.asList("For 90 days","For 7 days","For 7 days"));
		Assert.assertEquals(homeObject.getFreeTrial(),ExpectedFreeTrial);
		//assert video Quality for all 3 plans
		ArrayList<String> ExpectedvideoQuality=new ArrayList<String>(Arrays.asList("HD","Full HD","4K UHD"));
		Assert.assertEquals(homeObject.getVideoQuality(),ExpectedvideoQuality);
		//Device access
		ArrayList<String> ExpectedDeviceOptions=new ArrayList<String>(Arrays.asList("4","4","8"));
		Assert.assertEquals(homeObject.getDeviceAccess(),ExpectedDeviceOptions);
		//Rewind
		ArrayList<String> ExpectedRewindOptions=new ArrayList<String>(Arrays.asList("For 14 days", "For 14 days","For 14 days"));
		Assert.assertEquals(homeObject.GetRewindOptions(),ExpectedRewindOptions);
		//Watch offline
		ArrayList<Boolean> ExpectedOfflineOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
		Assert.assertEquals(homeObject.GetOfflineOptions(),ExpectedOfflineOptions);
		//Watch simultaneously
		ArrayList<Integer> ExpectedSimiWatchingOptions=new ArrayList<Integer>(Arrays.asList(0,2,4));
		Assert.assertEquals(homeObject.getSimiWatchingOptions(),ExpectedSimiWatchingOptions);
		//Cast to tv
		ArrayList<Boolean> ExpectedCastingOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
		Assert.assertEquals(homeObject.GetCastingOptions(),ExpectedCastingOptions);
	}
	@Test(priority = 2)
	void Validate_KW_Plan(){
	//Go to KW Page
	String URL="https://subscribe.stctv.com/kw-en";
	driver.navigate().to(URL);
	homeObject = new HomePageSubscription(driver);
	//assert 3 plans exists
	Assert.assertTrue(homeObject.doesPlansExist());
	//assert prices & currency for 3 plans
	ArrayList<String> ExpectedPrices=new ArrayList<String>(Arrays.asList("1.2 KWD/month","2.5 KWD/month","4.8 KWD/month"));
	Assert.assertEquals(homeObject.getPricesDetails(),ExpectedPrices);
	//assert discovery for all 3 plans
	ArrayList<String> ExpectedDiscovery=new ArrayList<String>(Arrays.asList("Included","Included","Included"));
	Assert.assertEquals(homeObject.getDiscoveryOptions(),ExpectedDiscovery);
	//asser free trial for all 3 plans
	ArrayList<Boolean> ExpectedFreeTrial=new ArrayList<Boolean>(Arrays.asList(true,true,true));
	Assert.assertEquals(homeObject.isFreeTrialIncluded(),ExpectedFreeTrial);
	//assert video Quality for all 3 plans
	ArrayList<String> ExpectedvideoQuality=new ArrayList<String>(Arrays.asList("HD","Full HD","4K UHD"));
	Assert.assertEquals(homeObject.getVideoQuality(),ExpectedvideoQuality);
	//Device access
	ArrayList<String> ExpectedDeviceOptions=new ArrayList<String>(Arrays.asList("4","4","8"));
	Assert.assertEquals(homeObject.getDeviceAccess(),ExpectedDeviceOptions);
	//Rewind
	ArrayList<String> ExpectedRewindOptions=new ArrayList<String>(Arrays.asList("for 14 Day", "For 14 days","For 14 days"));
	Assert.assertEquals(homeObject.GetRewindOptions(),ExpectedRewindOptions);
	//Watch offline
	ArrayList<Boolean> ExpectedOfflineOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
	Assert.assertEquals(homeObject.GetOfflineOptions(),ExpectedOfflineOptions);
	//Watch simultaneously
	ArrayList<Integer> ExpectedSimiWatchingOptions=new ArrayList<Integer>(Arrays.asList(0,2,4));
	Assert.assertEquals(homeObject.getSimiWatchingOptions(),ExpectedSimiWatchingOptions);
	//Cast to tv
	ArrayList<Boolean> ExpectedCastingOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
	Assert.assertEquals(homeObject.GetCastingOptions(),ExpectedCastingOptions);
}
	@Test(priority = 3)
	void Validate_BH_Plan(){
		//Go to BH Page
		String URL="https://subscribe.stctv.com/bh-en";
		driver.navigate().to(URL);
		homeObject = new HomePageSubscription(driver);
		//assert 3 plans exists
		Assert.assertTrue(homeObject.doesPlansExist());
		//assert prices & currency for 3 plans
		ArrayList<String> ExpectedPrices=new ArrayList<String>(Arrays.asList("2 BHD/month","3 BHD/month","6 BHD/month"));
		Assert.assertEquals(homeObject.getPricesDetails(),ExpectedPrices);
		//assert discovery for all 3 plans
		ArrayList<String> ExpectedDiscovery=new ArrayList<String>(Arrays.asList("Included","Included","Included"));
		Assert.assertEquals(homeObject.getDiscoveryOptions(),ExpectedDiscovery);
		//asser free trial for all 3 plans
		ArrayList<Boolean> ExpectedFreeTrial=new ArrayList<Boolean>(Arrays.asList(true,true,true));
		Assert.assertEquals(homeObject.isFreeTrialIncluded(),ExpectedFreeTrial);
		//assert video Quality for all 3 plans
		ArrayList<String> ExpectedvideoQuality=new ArrayList<String>(Arrays.asList("HD","Full HD","4K UHD"));
		Assert.assertEquals(homeObject.getVideoQuality(),ExpectedvideoQuality);
		//Device access
		ArrayList<String> ExpectedDeviceOptions=new ArrayList<String>(Arrays.asList("4","4","8"));
		Assert.assertEquals(homeObject.getDeviceAccess(),ExpectedDeviceOptions);
		//Rewind
		ArrayList<String> ExpectedRewindOptions=new ArrayList<String>(Arrays.asList("for 14 Day", "For 14 days","For 14 days"));
		Assert.assertEquals(homeObject.GetRewindOptions(),ExpectedRewindOptions);
		//Watch offline
		ArrayList<Boolean> ExpectedOfflineOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
		Assert.assertEquals(homeObject.GetOfflineOptions(),ExpectedOfflineOptions);
		//Watch simultaneously
		ArrayList<Integer> ExpectedSimiWatchingOptions=new ArrayList<Integer>(Arrays.asList(0,2,4));
		Assert.assertEquals(homeObject.getSimiWatchingOptions(),ExpectedSimiWatchingOptions);
		//Cast to tv
		ArrayList<Boolean> ExpectedCastingOptions=new ArrayList<Boolean>(Arrays.asList(false,true,true));
		Assert.assertEquals(homeObject.GetCastingOptions(),ExpectedCastingOptions);
	}
}

//Todo BH-KW fix typo first option should be "days" not "day"
//Todo BH-KW fix typo first option should be "For" not "for"