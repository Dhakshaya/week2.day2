package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment2 {	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		//Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//Login
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();	
		//Text Link
		WebElement linktext = driver.findElement(By.linkText("CRM/SFA"));
		linktext.click();
		//Lead tab
		WebElement linkLeads = driver.findElement(By.linkText("Leads"));
		linkLeads.click();
		//Create Lead button
		WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
		createLeads.click();
		//Company Name
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		//FirstName
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Dhakshayani");
		//LastName
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Ramamoorthy");
		//FirstNameLocal
		WebElement firstNamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNamelocal.sendKeys("TestLeaflocal");
		//DepartmentName
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("IT");
		//Description
		WebElement descriptionLeadform = driver.findElement(By.id("createLeadForm_description"));
		descriptionLeadform.sendKeys("Testleafdescription");
		//createLeadForm_primaryEmail
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("dhakshuparthiba@gmail.com");		
		//VisibleText - State
		WebElement stateVisibleText = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateObj = new Select(stateVisibleText);
		stateObj.selectByVisibleText("New York");
		//CreateButton
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
	    createLeadButton.click();	    
	    //Edit 
	    WebElement editButton = driver.findElement(By.linkText("Edit"));
	    editButton.click();
	    //cleardescription
	    WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
	    clearDescription.clear();
	    //updateLeadForm_importantNote
	    WebElement importantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
	    importantNote.sendKeys("Testleaf Important Note");
	    //updateButton
	    WebElement updateButton = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	    updateButton.click();
	    String updateTextPage = driver.getTitle();
	    System.out.println(updateTextPage);
	    
		
		
		
		/*WebElement elementdropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		elementdropdown.sendKeys("Employee");*/
		
		/*Select class - methods - 1st - Index		
		WebElement elementMarketingdropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));	
		Select marketingddObj = new Select(elementMarketingdropdown);
		marketingddObj.selectByIndex(3); // Automobile		
		//Select class - methods - 2nd - text		
		WebElement elementIndustrydropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryddObj = new Select(elementIndustrydropdown);
		industryddObj.selectByVisibleText("Computer Software"); // Computer Software				
		//Select class - methods - 3rd  - Value
		WebElement elementOwnershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipddObj = new Select(elementOwnershipdropdown);
	    ownershipddObj.selectByValue("OWN_PARTNERSHIP"); //OWN_PARTNERSHIP */
		
		
	
		
	
	}

}
