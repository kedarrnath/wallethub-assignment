# WalletHub-Assignment


<b>Manual part: Check Documents Folder</b> 

<b>Automation part:</b>

Automation Part achevied with Selenium Test Framework
Not Completed Multi Browser Support
Tests will run on Chrome Browser 

How to run it (<b>Tested on Windows only</b>)

<ul><li>Install: java jdk 1.8, chrome latest version</li> 
	<li>git clone</li> 
	<li>Build module WalletHub-app with Maven</li> 
	<li>Resolve TODO (insert credentials for login/pass in tests class)</li></ul> 

public class Facebooklogin {
 
	public static WebDriver driver;
	static String baseurl="http://www.facebook.com";
	//change username and password here for login
	String username="";
	String password="";
  
  public class WalletHubReview {
	
	public static WebDriver driver;
	static String baseurl="https://wallethub.com/join/light";
	static String review_sub_url="http://wallethub.com/profile/test_insurance_company/";
	//change username in below URL
	static String review_verification_url="https://wallethub.com/profile/username/reviews/";
	
	//change username and password here for login
	String username="";
	String password="";
  
<ul><li>Run Facebook/Wallethub tests with TestNG OR use testng.xml</li></ul>
