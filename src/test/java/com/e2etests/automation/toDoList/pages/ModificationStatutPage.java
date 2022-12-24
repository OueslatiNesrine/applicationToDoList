package com.e2etests.automation.toDoList.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ModificationStatutPage {
	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/span[2]/div[1]")
	public static WebElement modifyStatut;

	public ModificationStatutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void clickModifyStatus() {
		modifyStatut.click();
	}
	public void verifyStatus() {
		String text = modifyStatut.getText();
		System.out.println(text);
	}
	
	

}
