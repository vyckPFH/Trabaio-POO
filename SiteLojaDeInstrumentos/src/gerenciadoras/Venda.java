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
    
    public Venda(){}

    public Venda(LinkedList<Instrumento> produtosEscolhidos, float valorAPagar, int desconto, Cliente cliente) {
        this.produtosEscolhidos = produtosEscolhidos;
        this.valorAPagar = valorAPagar;
        this.desconto = desconto;
        this.cliente = cliente;
    }

    public void printVenda(Venda venda) {
        System.out.println("====================================");
        System.out.println("\t RESUMO DA VENDA \t");
        System.out.println("====================================");

        // Informações do cliente
        System.out.println("Cliente: " + venda.cliente.getNome());
        System.out.println("CPF: " + venda.cliente.getCpf());
        System.out.println("Desconto: " + venda.desconto + "%");
        System.out.println("------------------------------------");    

        // Valores
        System.out.println("Valor final a pagar: R$" + valorAPagar);
        System.out.println("====================================\n");
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