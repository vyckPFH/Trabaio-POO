package conceito;

import gerenciadoras.Venda;
import java.util.LinkedList;
import java.util.Scanner;

public class Loja {
    private String nome;
    private int cnpj;
    private String endereco;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();
    private LinkedList<Instrumento> instrumentos = new LinkedList<>();
    private LinkedList<Cliente> clientes = new LinkedList<>();

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    final static Scanner LER = new Scanner(System.in);

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
        this.clientes = new LinkedList<>();
    }

    public void comprarInstrumento(LinkedList<Venda> vendas, Loja loja) {
        Cliente clienteDVenda = new Cliente();
        LinkedList<Instrumento> vendidosInstrumentos = new LinkedList<>();
        boolean repete = true;
        float preco = 0f;

        while (repete) {
            System.out.println("Qual instrumento vc deseja comprar?: ");
            String instrumento = LER.next();

            for (Instrumento instrumentoX : loja.getInstrumentos()) {
                if (instrumentoX.getNome().equals(instrumento)) {
                    vendidosInstrumentos.add(instrumentoX);
                    int estoque = instrumentoX.getQuantidade();
                    estoque--;
                    loja.getInstrumentos().get(instrumentoX.getId()).setQuantidade(estoque);
                    preco += instrumentoX.getPreco();
                }
            }

            System.out.println("Comprar novamente? (true): sim (false): não");
            repete = LER.nextBoolean();
        }
                
        

        System.out.println("Qual cliente está realizando esta compra?: ");
        String criente = LER.next();

        for (Cliente client : loja.getClientes()) {
            if (client.getPessoa().getNome().equals(criente)) {
                clienteDVenda = client;
            }
        }

        // System.out.println(clienteDVenda.getPessoa().getNome());
        if (clienteDVenda.getPessoa() == null) {
            registrarCliente(clientes);
            clienteDVenda = clientes.getLast();
        }

        float desconto = (float)clienteDVenda.getDesconto()/100;
        preco = preco - (float) ((preco * desconto));
        Venda venda = new Venda(vendidosInstrumentos, preco, clienteDVenda.getDesconto(), clienteDVenda);
        vendas.add(venda);
    }

    public void registrarCliente(LinkedList<Cliente> clientes) {
        Pessoa novaPessoa = new Pessoa();
        Cliente novoCliente = new Cliente();
        System.out.println("Nome: ");
        novaPessoa.setNome(LER.next());
        System.out.println("cpf: ");
        novaPessoa.setCpf(LER.next());
        System.out.println("Numero: ");
        novaPessoa.setNumero(LER.next());
        System.out.println("Desconto: ");
        novoCliente.setDesconto(LER.nextInt());

        clientes.addLast(novoCliente);
    }

    public void removerInstrumento(Loja loja) {
        System.out.println("Digite o nome do instrumento a ser removido: ");
        String inxtrumento = LER.next();
        for (Instrumento instrumentox : loja.getInstrumentos()) {
            if (instrumentox.getNome().equals(inxtrumento)) {
                loja.getInstrumentos().remove(instrumentox);
            }
        }
    }

    public void addInstrumento(Loja loja) {

        Instrumento instrumento = new Instrumento();
        System.out.println("Digite o nome do instrumento: ");

        instrumento.setNome(LER.next());

        System.out.println("Digite o tipo do instrumento: ");
        instrumento.setTipo(LER.next());

        System.out.println("Digite o preço do instrumento: ");
        instrumento.setPreco(LER.nextFloat());

        System.out.println("Digite a cor do instrumento: ");
        instrumento.setCor(LER.next());

        System.out.println("Digite o tamanho do instrumento: ");
        instrumento.setTamanho(LER.nextInt());

        System.out.println("Digite a quantidade em estoque: ");
        instrumento.setQuantidade(LER.nextInt());

        System.out.println("Digite o indetificador do instrumento: ");
        instrumento.setId(LER.nextInt());

        loja.getInstrumentos().add(instrumento);

    }

    public void registrarFuncionario(Loja loja) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do proletario: ");
        pessoa.setNome(LER.next());
        System.out.println();
        System.out.print("Digite o cadastro de pessoa fisica: ");
        pessoa.setCpf(LER.next());
        System.out.println();
        System.out.print("Digite o numero de contato do proletario: ");
        pessoa.setNumero(LER.next());
        System.out.println();

        System.out.print("Qual sera o cargo que este funcionario vai desempenhar?: ");
        funcionario.setCargo(LER.next());
        System.out.println();

        System.out.print("Qual sera o salario do funcionario?: ");
        funcionario.setSalario(LER.nextInt());
        System.out.println();

        funcionario.setPessoa(pessoa);

        loja.getFuncionarios().add(funcionario);
    }

    public void demitirFuncionario(Loja loja) {

        System.out.println("Digite o nome do funcionario a ser demitido: ");
        String demitido = LER.next();
        for (Funcionario funcionario : loja.getFuncionarios()) {
            if (funcionario.getPessoa().getNome().equals(demitido)) {
                loja.getFuncionarios().remove(funcionario);
            }
        }

    }

    public void alterarDadosFuncionario(Loja loja) {

    }

    public void alterarInstrumento() {
    }

    // public static void comprarInstrumento(Loja loja){
    // int escolha = LER.nextInt();

    // }

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
                System.out.println("    " + contador + ") " + instrumento.getNome() + " | Tipo: "
                        + instrumento.getTipo()
                        + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                        + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade()
                        + " | ID para compra: " + instrumento.getId());
                contador++;
            }
            System.out.println("    " + contador + ") " + instrumento.getNome() + " | Tipo: " + instrumento.getTipo()
                    + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                    + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade() + " | ID para compra: "
                    + instrumento.getId());

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
