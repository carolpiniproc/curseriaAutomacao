#language:en
@LojaVirtual
  Feature: Loja Virtual
    eu quero buscar o livro e abrir a single page

  @validaLivroFortaleza
  Scenario: Validar livro fortaleza
    Given que estou na tela inicial
    When eu procuro pelo livro "Fortaleza Digital"
    Then valido o título "[PRODUTO DE EXEMPLO] - Fortaleza Digital"
    And o preco "R$519,90"
    When clico no livro pesquisado
    Then valido que estou na single page do livro "[PRODUTO DE EXEMPLO] - Fortaleza Digital" com o preco "R$519,90"

 @validaLivroMenina1
    Scenario: Validar livro da menina
      Given que estou na tela inicial
      When eu procuro pelo livro "Menina"
      Then valido o título "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros"
      And o preco "R$821,30"
      When clico no livro pesquisado
      Then valido que estou na single page do livro "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros" com o preco "R$821,30"

    @validaLivros
    Scenario Outline: Validar livros <titulo>
      Given que estou na tela inicial
      When eu procuro pelo livro <titulo>
      Then valido o título <tituloLivro>
      And o preco <preco>
      When clico no livro pesquisado
      Then valido que estou na single page do livro <tituloLivro> com o preco <preco>
      Examples:
        | titulo        | tituloLivro                                               | preco      |
        | "menina"      | "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros"      | "R$821,30" |
        | "fortaleza"   | "[PRODUTO DE EXEMPLO] - Fortaleza Digital"                | "R$519,90" |

