@test
Feature: Je souhaite verifier l acces en cas passant

  Background: 
    Given Je me connecte sur l application ToDo list "http://localhost:3000"
    When Je saisis un email "test@test.com"
    And Je saisis un mot de passe "test"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page task

  @userAcces
  Scenario: Je souhaite verifier l acces en cas passant
    When Je clique sur le lien tache
    Then Je me redirige vers la page task
    And Je clique sur le lien deconnexion
    And Je me redirige vers la page deconnexion
    Then Je clique sur le lien tache 
    And Je me redirige vers la page deconnexion
