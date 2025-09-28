package conceito;

// Explicação no readme do motivo dp extends e super.
public class Funcionario extends Pessoa { // extends indica qual classe Funcionario esta herdando
    private int salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String numero, int salario, String cargo) {
        super(nome, cpf, numero); // super é um comando que chama o construtor da classe da qual funcionario herdou
        this.salario = salario;
        this.cargo = cargo;
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
