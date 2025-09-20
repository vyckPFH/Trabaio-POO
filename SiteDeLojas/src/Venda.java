import java.util.LinkedList;

public class Venda {
    private Loja loja;
    private int qtdProdutos;
    private LinkedList<Instrumento> produtosEscolhidos;
    private float valorAPagar;
    private int desconto;

    public Venda() {
        this.produtosEscolhidos = new LinkedList<>();
    }

    public Venda(Loja loja, int qtdProdutos, LinkedList<Instrumento> produtosEscolhidos, float valorAPagar, int desconto) {
        this.loja = loja;
        this.qtdProdutos = qtdProdutos;
        this.produtosEscolhidos = produtosEscolhidos;
        this.valorAPagar = valorAPagar;
        this.desconto = desconto;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public LinkedList<Instrumento> getProdutosEscolhidos() {
        return produtosEscolhidos;
    }

    public void setProdutosEscolhidos(LinkedList<Instrumento> produtosEscolhidos) {
        this.produtosEscolhidos = produtosEscolhidos;
    }

    public float getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(float valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}