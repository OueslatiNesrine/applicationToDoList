package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.AjouteTachePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjouteTacheStepDefinitions {
	public AjouteTachePage ajouteTachePage;

	public AjouteTacheStepDefinitions() {
		ajouteTachePage = new AjouteTachePage();
	}

	@When("Je saisis nom de tache {string}")
	public void jeSaisisNomDeTache(String string) {
		ajouteTachePage.fillNameTask(string);

	}

	@And("Je saisis le description {string}")
	public void jeSaisisLeDescription(String string) {
		ajouteTachePage.fillDescriptTask(string);

	}

	@And("Je click sur le bouton ajouter tache")
	public void jeClickSurLeBoutonAjouterTache() {
		ajouteTachePage.clickAddTask();
	}

}
