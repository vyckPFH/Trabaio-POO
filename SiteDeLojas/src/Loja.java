import java.util.LinkedList;

public class Loja {
    private String nome;
    private int cnpj;
    private String endereco;
    private LinkedList<Funcionario> funcionarios;
    private LinkedList<Instrumento> instrumentos;

    public Loja() {
        this.funcionarios = new LinkedList<>();
        this.instrumentos = new LinkedList<>();
    }

    public Loja(String nome, int cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.funcionarios = new LinkedList<>();
        this.instrumentos = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public LinkedList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(LinkedList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
