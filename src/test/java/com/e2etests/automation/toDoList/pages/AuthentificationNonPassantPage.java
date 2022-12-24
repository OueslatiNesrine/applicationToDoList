package com.e2etests.automation.toDoList.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationNonPassantPage {
	/* @FindBy */
	@FindBy(how = How.CSS, using = ".alert.alert-danger")
	public static WebElement msgError;

	

	public AuthentificationNonPassantPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void checkErrorMsg() {
		String msg = msgError.getText();
		System.out.println("********************"+msg+"****************");
		Assert.assertEquals(msg, "Désolé, les identifiants sont incorrects.");
	}
	
	public void getColor () {
		String color = msgError.getCssValue("color");
		System.out.println("The color is:" + color);

		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
		System.out.println("The hexValue is:" + hexValue);

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		System.out.println("The hexValue1 is:" + hexValue1);

		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		System.out.println("The hexValue2 is:" + hexValue2);

		int hexValue3 = Integer.parseInt(hexValue[2]);
		System.out.println("The hexValue3 is:" + hexValue3);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("The actualColor is:" + actualColor);

		Assert.assertEquals("#721c24", actualColor);
		System.out.println("The color is:" + actualColor);
	}

}
