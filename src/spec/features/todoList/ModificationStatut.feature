@test
Feature: Je souhaite de verifier le modification de statut

  Background: 
    Given Je me connecte sur l application ToDo list "http://localhost:3000"
    When Je saisis un email "test@test.com"
    And Je saisis un mot de passe "test"
    And Je tape sur le bouton Login

  @modificationStatus
  Scenario Outline: Je souhaite de verifier le modification de statut
    When Je saisis nom de tache "<name>"
    And Je saisis le description "<description>"
    And Je click sur le bouton ajouter tache
    And Je verifie mise a jour d ajout
    And Je modifie le status non completee a complete
    Then Je verifie la modification
    And Je modifie le status complete a non completee
    And Je verifie la modification

    Examples: 
      | name    | description        |
      | sprint1 | verifier page home |
