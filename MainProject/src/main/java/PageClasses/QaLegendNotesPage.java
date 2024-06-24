package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendNotesPage {
	
	WebDriver driver;
	
	@FindBy(xpath ="//div[@class='title-button-group']/a")
	WebElement AddNotesButton;
	@FindBy(xpath ="//input[@id='title']")
	WebElement Titlefield;
	@FindBy(xpath="//textarea[@id='description']")
	WebElement Descriptionfield;
	@FindBy(xpath ="//button[@class='btn btn-primary']" )
	WebElement savebutton;
	
	public QaLegendNotesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void addNotes(String title,String description) {
		
		PageUtilities.clickOnElement(AddNotesButton);
		PageUtilities.enterText(Titlefield, title);
		PageUtilities.enterText(AddNotesButton, description);
		PageUtilities.clickOnElement(savebutton);
	}
}
