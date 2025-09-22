import java.util.LinkedList;

public class Loja {
    private String nome;
    private int cnpj;
    private String endereco;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();
    private LinkedList<Instrumento> instrumentos = new LinkedList<>();

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

    public void printSlaves() {
        if (funcionarios.isEmpty()) {
            System.out.println("  Nenhum funcionário cadastrado.");
        } else {
            System.out.println("------------------------------------");
            System.out.println("  Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("    ----------------------------");
                System.out.println("    Nome    : " + funcionario.getPessoa().getNome());
                System.out.println("    CPF     : " + funcionario.getPessoa().getCpf());
                System.out.println("    Número  : " + funcionario.getPessoa().getNumero());
                System.out.println("    Cargo   : " + funcionario.getCargo());
                System.out.println("    Salário : " + funcionario.getSalario());
            }
        }
        System.out.println("====================================\n");
    }

    public void printAboutUs() {
        System.out.println("====================================");
        System.out.println("\t SOBRE NÓS \t");
        System.out.println("====================================");
        System.out.println("   Informações da Loja:");
        System.out.println("     Nome     : " + nome);
        System.out.println("     CNPJ     : " + cnpj);
        System.out.println("     Endereço : " + endereco);
        System.out.println("====================================");
    }

    public void printInstruments() {
        System.out.println("  Catálogo de Instrumentos:");
        int contador = 1;
        for (Instrumento instrumento : instrumentos) {

            if (instrumento.getId() == 0) {
                System.out.println("----INDISPONIVEL----");
                System.out.println("    " + contador + ") " + instrumento.getNome() + " | Tipo: " + instrumento.getTipo()
                    + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                    + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade() + " | ID para compra: " + instrumento.getId());
                    contador++;
            }
            System.out.println("    " + contador + ") " + instrumento.getNome() + " | Tipo: " + instrumento.getTipo()
                    + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                    + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade() + " | ID para compra: " + instrumento.getId());

            contador++;
        }
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
