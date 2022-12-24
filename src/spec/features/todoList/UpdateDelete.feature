@test
Feature: Je souhaite verifier le mise jour de supprimer tache

  Background: 
    Given Je me connecte sur l application ToDo list "http://localhost:3000"
    When Je saisis un email "test@test.com"
    And Je saisis un mot de passe "test"
    And Je tape sur le bouton Login

  @upDateDelete
  Scenario Outline: Je souhaite verifier le mise jour de supprimer tache
    When Je saisis nom de tache "<name>"
    And Je saisis le description "<description>"
    And Je click sur le bouton ajouter tache
    And Je verifie mise a jour d ajout
    And Je click sur le bouton supprimer tache
    Then Je me redirige vers la page task

    Examples: 
      | name    | description        |
      | sprint1 | verifier page home |
