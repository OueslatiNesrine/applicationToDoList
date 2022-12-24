@test
Feature: Je souhaite verifier la page de connexion de l application ToDo list
  
  En tant que utilisateure je souhaite me connecter sur l application ToDo list

  @cnx
  Scenario: Je verifie la page de connexion
    Given Je me connecte sur l application ToDo list "http://localhost:3000"
    When Je saisis un email "test@test.com"
    And Je saisis un mot de passe "test"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page task
