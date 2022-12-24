package com.e2etests.automation.toDoList.pages;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class UpDateDeletePage {
	/* @FindBy */
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/span[1]/a[1]")
	public static WebElement btnDelete;
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/span[1]/b")
	public static WebElement list;

	public UpDateDeletePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	
	public void clickDelete() {
		btnDelete.click();
	}
	public void UpDateAdd() {
		String text = list.getText();
		System.out.println(text);
		if (Assert.isNonEmpty(text)) {
			System.out.println("Verification successfully - The list is not empty ");
		} else {
			System.out.println("Verification failed - an incorrect list is emty ");
		}
	}

}
