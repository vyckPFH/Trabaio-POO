public class Funcionario {
    private Pessoa pessoa;
    private int salario;
    private String cargo;

    public Funcionario() {}

    public Funcionario(Pessoa pessoa, int salario, String cargo) {
        this.pessoa = pessoa;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
