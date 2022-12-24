@test
Feature: Je souhaite verifier le mise jour d ajouter tache

  Background: 
    Given Je me connecte sur l application ToDo list "http://localhost:3000"
    When Je saisis un email "test@test.com"
    And Je saisis un mot de passe "test"
    And Je tape sur le bouton Login

  @upDateAdd
  Scenario Outline: Je souhaite verifier le mise jour d ajouter tache
    When Je saisis nom de tache "<name>"
    And Je saisis le description "<description>"
    And Je click sur le bouton ajouter tache
    And Je saisis nom de tache "<name>"
    And Je saisis le description "<description>"
    And Je click sur le bouton ajouter tache
    Then Je me redirige vers la page task

    Examples: 
      | name    | description        |
      | sprint1 | verifier page home |
