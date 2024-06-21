package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class QaLegend_TestCases extends BaseClass  {
	
	public WebDriver driver;
	Properties props;
	FileReader reader;
	@BeforeMethod
	public void initialization()throws Exception {
		driver=browserinitialization("chrome");
		driver.manage().window().maximize();
    props = new Properties();
    reader=new FileReader("C:\\Users\\Basil\\eclipse-workspace\\MainProject\\src\\main\\resources\\TestData\\TestData.properties");
    props.load(reader);
    driver.get(props.getProperty("url"));
     
}
	@Test
	public void addEditNotes () {
		System.out.println("Test Case 01");
	}
}
