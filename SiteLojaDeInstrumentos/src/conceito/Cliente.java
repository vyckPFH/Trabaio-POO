package conceito;

public class Cliente extends Pessoa {
    private int desconto;

    public Cliente(){}

    public Cliente(int desconto, String nome, String cpf, String numero) {
        super(nome, cpf, numero);
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

}
