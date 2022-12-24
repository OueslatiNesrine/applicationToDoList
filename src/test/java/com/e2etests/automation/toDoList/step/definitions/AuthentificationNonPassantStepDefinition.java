package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.AuthentificationNonPassantPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AuthentificationNonPassantStepDefinition {

	public AuthentificationNonPassantPage authentificationNonPassantPage;

	public AuthentificationNonPassantStepDefinition() {
		authentificationNonPassantPage = new AuthentificationNonPassantPage();
	}

	@Then("Je verifie le message d erreur")
	public void jeVerifieLeMessageDErreur() {
		authentificationNonPassantPage.checkErrorMsg();

	}

	@And("le message est de couleur rouge")
	public void leMessageEstDeCouleurRouge() {
		authentificationNonPassantPage.getColor();
	}

}
