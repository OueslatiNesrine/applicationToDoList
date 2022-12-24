package com.e2etests.automation.toDoList.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {
	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement adressEmail;
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/input[1]")
	public static WebElement password;
	@FindBy(how = How.CSS, using = ".btn.btn-primary")
	public static WebElement btnSoumettre;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),\"Aucune tâche n'a encore été créée.\")]")
	public static WebElement message;


	public AuthentificationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void goToUrl(String url) {
		Setup.getDriver().get(url);
	}

	public void fillAdressEmail(String name) {
		adressEmail.sendKeys(name);
	}

	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickSoumettre() {
		btnSoumettre.click();
	}
	public void checkOnPageTask() {
		String msg = message.getText();
		System.out.println("********************"+msg+"****************");
		Assert.assertEquals(msg, "Aucune tâche n'a encore été créée.");
		
		
	}

}
