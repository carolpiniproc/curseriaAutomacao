#language:en
@tag
  Feature: Loja Virtual
    eu quero buscar o livro e abrir a single page

  @validaLivro
  Scenario: Validar livro
    Given que estou na tela inicial
    When eu procuro pelo livro "Fortaleza Digital"
    Then valido o título "[PRODUTO DE EXEMPLO] - Fortaleza Digital"
    And o preco "R$519,90"
    When clico no livro pesquisado
    Then valido que estou na single page do livro "[PRODUTO DE EXEMPLO] - Fortaleza Digital" com o preco "R$519,90"

  @tag2
  Scenario Outline:
    Given
    When
    Then

    Examples:
      |  |
