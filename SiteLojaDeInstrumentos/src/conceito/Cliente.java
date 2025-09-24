package conceito;
public class Cliente {
    private Pessoa pessoa;
    private boolean desconto;

    public Cliente() {}

    public Cliente(Pessoa pessoa, boolean desconto) {
        this.pessoa = pessoa;
        this.desconto = desconto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }
}
