package com.e2etests.automation.toDoList.step.definitions;

import com.e2etests.automation.toDoList.pages.ModificationStatutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModificationStatutStepDefinition {
public ModificationStatutPage modificationStatutPage;
public ModificationStatutStepDefinition () {
	modificationStatutPage = new ModificationStatutPage();
}
	@When("Je modifie le status non completee a complete")
	public void jeModifieLeStatusNonCompleteeAComplete() {
		modificationStatutPage.clickModifyStatus();
		
	    
	}
	@Then("Je verifie la modification")
	public void jeVerifieLaModification() {
		modificationStatutPage.verifyStatus();
	    
	}
	@And("Je modifie le status complete a non completee")
	public void jeModifieLeStatusCompleteANonCompletee() {
		modificationStatutPage.clickModifyStatus();
	  
	}




}
