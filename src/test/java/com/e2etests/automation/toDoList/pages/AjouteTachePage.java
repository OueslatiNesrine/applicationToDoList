package com.e2etests.automation.toDoList.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AjouteTachePage {

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	public static WebElement nameTask;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]")
	public static WebElement descriptionTask;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ajouter la tâche')]")
	public static WebElement addTask;

	public AjouteTachePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void fillNameTask(String name) {
		nameTask.sendKeys(name);
	}

	public void fillDescriptTask(String string) {
		descriptionTask.sendKeys(string);
	}

	public void clickAddTask() {
		addTask.click();
	}

}
