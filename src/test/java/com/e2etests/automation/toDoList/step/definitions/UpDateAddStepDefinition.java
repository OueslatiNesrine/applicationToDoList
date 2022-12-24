package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.UpDateAddPage;

import io.cucumber.java.en.Then;

public class UpDateAddStepDefinition {
	public UpDateAddPage upDateAddPage;

	public UpDateAddStepDefinition() {
		upDateAddPage = new UpDateAddPage();

	}

	@Then("Je verifie mise a jour d ajout")
	public void jeVerifieMiseAJourDAjout() {
		upDateAddPage.UpDateAdd();
	}

}
