@test
  Feature: Je souhaite verifier la page de connexion de l application ToDoList - cas de test non passant
  
  En tant que utilisateure je souhaite me connecter sur l application ToDoList
  Background:
  Given Je me connecte sur l application ToDo list "http://localhost:3000"
  When Je saisis un email "tt@test.com"
    And Je saisis un mot de passe "test123"
    And Je tape sur le bouton Login

  @cnx_nonPassant
  Scenario: Je verifie la page de connexion - cas de test non passant
    Then Je verifie le message d erreur
    And le message est de couleur rouge

