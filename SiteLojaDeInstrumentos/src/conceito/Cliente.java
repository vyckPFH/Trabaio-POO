package conceito;
public class Cliente {
    private Pessoa pessoa;
    private int desconto;

    public Cliente(Pessoa pessoa, int desconto) {
        this.pessoa = pessoa;
        this.desconto = desconto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Cliente() {}

   
}
