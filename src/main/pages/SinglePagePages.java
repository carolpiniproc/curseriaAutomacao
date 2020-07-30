package pages;
public class SinglePagePages {
    mappers.SinglePageMaps singlePageMap = new mappers.SinglePageMaps();

    public String getTitulo() {
        return singlePageMap.titulo.getText();
    }

    public String getPreco(){
        return singlePageMap.preco.getText();
    }

}
