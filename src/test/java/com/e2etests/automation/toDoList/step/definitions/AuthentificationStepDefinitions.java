package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.AuthentificationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinitions {
	public AuthentificationPage authentificationPage;

	public AuthentificationStepDefinitions() {
		authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte sur l application ToDo list {string}")
	public void jeMeConnecteSurLApplicationToDoList(String string) {
		authentificationPage.goToUrl(string);
	}

	@When("Je saisis un email {string}")
	public void jeSaisisUnEmail(String string) {
		authentificationPage.fillAdressEmail(string);

	}

	@And("Je saisis un mot de passe {string}")
	public void jeSaisisUnMotDePasse(String string) {
		authentificationPage.fillPassword(string);

	}

	@And("Je tape sur le bouton Login")
	public void jeTapeSurLeBoutonLogin() {
		authentificationPage.clickSoumettre();

	}

	@Then("Je me redirige vers la page task")
	public void jeMeRedirigeVersLaPageTask() {
		authentificationPage.checkOnPageTask();

	}
}
