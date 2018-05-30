package framework;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reports {
	
	 static ExtentReports extent;
	 static ExtentTest logger;
	    
	    public static  void main(String [] args) {
	    	extent =new ExtentReports("C:\\Users\\naman\\Downloads\\name.html",true);
	 
	    
	    }
	       
}
