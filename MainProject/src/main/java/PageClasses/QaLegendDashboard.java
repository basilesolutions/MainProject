package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import net.bytebuddy.asm.Advice.This;

public class QaLegendDashboard {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Events']")
	WebElement eventsTab;
	@FindBy(xpath="//span[text()='Notes']")
	WebElement NotesTab;
	@FindBy(xpath="//span[text()='Messages']")
	WebElement messageTab;
	@FindBy(xpath="//span[text()='Clients']")
	WebElement ClientsTab;




public QaLegendDashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}




public void clicksonnotesoption()
{
	PageUtilities.clickOnElement(NotesTab);
	
}
}