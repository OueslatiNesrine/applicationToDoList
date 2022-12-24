package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.UpDateDeletePage;

import io.cucumber.java.en.When;

public class UpDateDeleteStepDefinition {
	public UpDateDeletePage upDateDeletePage;

	public UpDateDeleteStepDefinition() {
		upDateDeletePage = new UpDateDeletePage();
	}

	@When("Je click sur le bouton supprimer tache")
	public void jeClickSurLeBoutonSupprimerTache() {
		upDateDeletePage.clickDelete();

	}

}
