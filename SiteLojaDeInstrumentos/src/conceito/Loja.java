package conceito;

import gerenciadoras.Venda;
import java.util.LinkedList;
import java.util.Scanner;

public class Loja {
    /*
     * SCANNER
     */

    final static Scanner LER = new Scanner(System.in);

    /*
     * Variaveis presentes em LOJA e suas declarações
     */
    private String nome;
    private int cnpj;
    private String endereco;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();
    private LinkedList<Instrumento> instrumentos = new LinkedList<>();
    private LinkedList<Cliente> clientes = new LinkedList<>();

    /*
     * Ações de administrador da loja
     */

    public void registrarCliente(LinkedList<Cliente> clientes) {

        Cliente cliente = new Cliente();

        System.out.println("Nome: ");
        cliente.setNome(LER.next());

        System.out.println("cpf: ");
        cliente.setCpf(LER.next());

        System.out.println("Numero: ");
        cliente.setNumero(LER.next());

        System.out.println("Desconto: ");
        cliente.setDesconto(LER.nextInt());

        clientes.addLast(cliente);
    }

    // @vyckPFH
    public void removerInstrumento(Loja loja) {
        System.out.println("Digite o nome do instrumento a ser removido: ");
        String inxtrumento = LER.next();
        Instrumento banido = null;

        for (Instrumento instrumento : loja.getInstrumentos()) {
            if (instrumento.getNome().equalsIgnoreCase(inxtrumento)) {
                banido = instrumento;
                break;
            }
        }
        if (banido != null) {
            loja.getInstrumentos().remove(banido);
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

        loja.getInstrumentos().add(instrumento);

    }

    public void registrarFuncionario(Loja loja) {
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do proletario: ");
        funcionario.setNome(LER.next());
        System.out.println();

        System.out.print("Digite o cadastro de pessoa fisica: ");
        funcionario.setCpf(LER.next());
        System.out.println();

        System.out.print("Digite o numero de contato do proletario: ");
        funcionario.setNumero(LER.next());
        System.out.println();

        System.out.print("Qual sera o cargo que este funcionario vai desempenhar?: ");
        funcionario.setCargo(LER.next());
        System.out.println();

        System.out.print("Qual sera o salario do funcionario?: ");
        funcionario.setSalario(LER.nextInt());
        System.out.println();

        loja.getFuncionarios().add(funcionario);
    }

    // @vyckPFH
    public void demitirFuncionario(Loja loja) {

        System.out.println("Digite o nome do funcionario a ser demitido: ");
        String demitido = LER.next();
        Funcionario funcionarioDemitido = null;

        for (Funcionario funcionario : loja.getFuncionarios()) {
            if (funcionario.getNome().equalsIgnoreCase(demitido)) {
                funcionarioDemitido = funcionario;
                break;
            }
        }
        if (loja.getFuncionarios().contains(funcionarioDemitido)) {
            loja.getFuncionarios().remove(funcionarioDemitido);
        }

    }

    /*
    * Patchs futuros:
    */
    public void alterarDadosFuncionario(Loja loja) {}
    public void alterarInstrumento() {}

    /*
     * Ações de clientes da loja
     */

    public void buyInstrumento(LinkedList<Venda> vendas) {

        System.out.println("Quem está realizando a venda?: ");
        Cliente criente = findCliente(LER.next());
        
        if (criente == null) {
            registrarCliente(clientes);
            criente = clientes.getLast();
        }

        LinkedList<Instrumento> comprados = new LinkedList<>();
        Venda venda = new Venda();
        float valor = 0f;
        int qtdInstrumentos = 0;
        System.out.println("vc pretende comprar quantos instrumentos?: ");
        qtdInstrumentos = LER.nextInt();

        for (int i = 0; i < qtdInstrumentos; i++) {
            System.out.println("Diga o nome do instrumento que sera comprado: ");
            Instrumento instrumento = findInstrumento(LER.next());

            if (instrumento.getQuantidade() == 0) {
                System.out.println("Fora de estoque!!!");
            } else {
                comprados.add(instrumento);
                valor += instrumento.getPreco();

                int estoque = instrumento.getQuantidade();
                estoque--;
                instrumento.setQuantidade(estoque);
                int pos = instrumentos.indexOf(instrumento);
                instrumentos.set(pos, instrumento);
            }
        }
        venda.setProdutosEscolhidos(comprados);
        venda.setCliente(criente);
        venda.setDesconto(criente.getDesconto());
        valor = calcularValorComDesconto(valor, venda.getDesconto());
        venda.setValorAPagar(valor);
        venda.printVenda(venda);
    }

    public float calcularValorComDesconto(float valor, int desconto) {
        valor = valor * (float) (desconto * 0.01);
        return valor;
    }

    /*
     * Metodos de print dados gerais
     */

    public void printSlaves() {
        if (funcionarios.isEmpty()) {
            System.out.println("  Nenhum funcionário cadastrado.");
        } else {
            System.out.println("------------------------------------");
            System.out.println("  Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("    ----------------------------");
                System.out.println("    Nome    : " + funcionario.getNome());
                System.out.println("    CPF     : " + funcionario.getCpf());
                System.out.println("    Número  : " + funcionario.getNumero());
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

            if (instrumento.getQuantidade() == 0) {
                // System.out.println(" " + contador + ") " + instrumento.getNome() + " | Tipo:
                // "
                // + instrumento.getTipo()
                // + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor()
                // + " | Tamanho: "
                // + instrumento.getTamanho() + " | Quantidade: " +
                // instrumento.getQuantidade());
                String texto = ("    " + contador + ") " + instrumento.getNome() + " | Tipo: "
                        + instrumento.getTipo()
                        + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                        + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade());
                texto = riscar(texto);
                System.out.print("INDISPONIVEL-> ");
                System.out.println(texto);
                contador++;
            } else {
                String texto = ("    " + contador + ") " + instrumento.getNome() + " | Tipo: "
                        + instrumento.getTipo()
                        + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor() + " | Tamanho: "
                        + instrumento.getTamanho() + " | Quantidade: " + instrumento.getQuantidade());
                // System.out.println(" " + contador + ") " + instrumento.getNome() + " | Tipo:
                // "
                // + instrumento.getTipo()
                // + " | Preço: R$" + instrumento.getPreco() + " | Cor: " + instrumento.getCor()
                // + " | Tamanho: "
                // + instrumento.getTamanho() + " | Quantidade: " +
                // instrumento.getQuantidade());
                System.out.println(texto);
                contador++;
            }

        }
    }

    /*
     * funcionamento interno
     */
    //pesquisado
    public String riscar(String texto) {
        return "\u001b[9m" + texto + "\u001b[0m";
    }

    public Funcionario findFuncionario(String nome) {

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public Cliente findCliente(String nome) {

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public Instrumento findInstrumento(String nome) {

        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getNome().equalsIgnoreCase(nome)) {
                return instrumento;
            }
        }
        return null;
    }

    /*
     * Construtores de LOJA
     */
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

    /*
     * Metodos GET and SET *
     */
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
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
