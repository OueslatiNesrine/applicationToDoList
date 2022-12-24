package com.e2etests.automation.toDoList.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class UserAccesPage {
	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Tâches')]")
	public static WebElement lienTask;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Déconnexion')]")
	public static WebElement lienDeconnexion;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Adresse e-mail')]")
	public static WebElement labelEmail;

	public UserAccesPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void clickOnTask() {
		lienTask.click();
	}

	public void clickOnDeconnexion() {
		lienDeconnexion.click();
	}

	public void checkOnPageDeconnexion() {
		String msg = labelEmail.getText();
		System.out.println("********************" + msg + "****************");
		Assert.assertEquals(msg, "Adresse e-mail");
	}

}
