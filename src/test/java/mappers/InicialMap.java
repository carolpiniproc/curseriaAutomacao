package mappers;
import Settings.ByValue;
import Settings.Element;

public class InicialMap {

  public Element pesquisa = new Element(ByValue.ID,"search");
  public Element tituloLivro = new Element(ByValue.XPATH,"//h2/a");
  public Element preco = new Element(ByValue.CSS,"span > span.price");
  public Element livros = new Element(ByValue.CSS,"ul.products-grid > li");
  public Element precoLista = new Element(ByValue.CSS,"span.price");
  public Element tituloLivroLista = new Element(ByValue.CSS,"h2 > a");
}
