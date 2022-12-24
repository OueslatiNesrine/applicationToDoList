package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.UserAccesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class UserAccesStepDefinition {
	public UserAccesPage userAccesPage;
	public UserAccesStepDefinition () {
		userAccesPage = new UserAccesPage();
	}
	

	@When("Je clique sur le lien tache")
	public void jeCliqueSurLeLienTache() {
		userAccesPage.clickOnTask();
	    
	}

	@And("Je clique sur le lien deconnexion")
	public void jeCliqueSurLeLienDeconnexion() {
		userAccesPage.clickOnDeconnexion();
	}
	@And("Je me redirige vers la page deconnexion")
	public void jeMeRedirigeVersLaPageDeconnexion() {
		userAccesPage.checkOnPageDeconnexion();
	}




}
