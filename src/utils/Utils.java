package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static WebDriver driver;
    public void driverSetup()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        //set chrome driver path here
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        driver=new ChromeDriver(options);

    }

    public void getBaseURl(String baseurl)
    {
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void Screenshot(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus()){

            try{

                // To create reference of TakesScreenshot
                TakesScreenshot screenshot=(TakesScreenshot)driver;
                // Call method to capture screenshot
                File src=screenshot.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location
                // result.getName() will return name of test case so that screenshot name will be same as test case name
                FileUtils.copyFile(src, new File("screenshots\\"+result.getName()+".png"));
                System.out.println("Successfully captured a screenshot");

            }catch (Exception e){

                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        driver.quit();
    }
}
