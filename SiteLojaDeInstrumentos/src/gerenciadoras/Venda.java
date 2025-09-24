package gerenciadoras;

import conceito.Cliente;
import conceito.Instrumento;
import java.util.LinkedList;

public class Venda {
    private LinkedList<Instrumento> produtosEscolhidos;
    private float valorAPagar;
    private int desconto;
    private Cliente cliente;
    // private Loja loja;
    

    public Venda(LinkedList<Instrumento> produtosEscolhidos, float valorAPagar, int desconto, Cliente cliente) {
        this.produtosEscolhidos = produtosEscolhidos;
        this.valorAPagar = valorAPagar;
        this.desconto = desconto;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}