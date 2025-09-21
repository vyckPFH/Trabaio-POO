import java.util.LinkedList;
import java.util.List;

public class SiteLojaInstrumentos {

  public static void main(String[] args) {

    LinkedList<Loja> lojas = new LinkedList<Loja>();
    criarBancoInicial(lojas);


    printBancoInicial(lojas);

    
  }

  public static void printBancoInicial(LinkedList<Loja> lojas) {
    for (Loja lojax : lojas) {
      System.out.println("====================================");
      System.out.println("LOJA");
      System.out.println("  Nome     : " + lojax.getNome());
      System.out.println("  CNPJ     : " + lojax.getCnpj());
      System.out.println("  Endereço : " + lojax.getEndereco());
      System.out.println("------------------------------------");

      System.out.println("  Catálogo de Instrumentos:");
      int contador = 1;
      for (Instrumento instrumento : lojax.getInstrumentos()) {
        System.out.println("    " + contador + ") " + instrumento.getNome()
            + " | Tipo: " + instrumento.getTipo()
            + " | Preço: R$" + instrumento.getPreco()
            + " | Cor: " + instrumento.getCor()
            + " | Tamanho: " + instrumento.getTamanho());
        contador++;
      }

      if (lojax.getFuncionarios().isEmpty()) {
        System.out.println("  Nenhum funcionário cadastrado.");
      } else {
        System.out.println("------------------------------------");
        System.out.println("  Funcionários:");
        for (Funcionario funcionario : lojax.getFuncionarios()) {
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
  }

  public static void criarBancoInicial(LinkedList lojas) {

    Loja loja3 = new Loja("loja Dos GuriBah + ox mainhaaaa", 123, "Rio pequeno do sul");
    Loja loja4 = new Loja("loja Das MINA VAMO MULHERES!!!", 666, "rio de janeiro?");
    Loja loja5 = new Loja("loja Dos Pobre 0 centavos no bolso", 696, "terapia");
    Loja loja = new Loja("loja Da Roberta", 1, "Ifpr");
    // get pra pegar a lista e ai sim adicionar, o SET seria pra settar/create toda
    // uma
    // novalista de funcionarios
    Funcionario prof = (new Funcionario(new Pessoa("Roberta", "n sei né", "n sei néhhhh"), 999999999,
        "fazer pograma"));
    Funcionario funcionarioPreguicoso = (new Funcionario(
        new Pessoa("Willami mayer serafin", "n sei né", "n sei néhhhh"), 1518, "filosofo"));
    Funcionario funcionarioNerdola = (new Funcionario(new Pessoa("Gustavo andré", "n sei né2", "777"), 1518,
        "kurt kobain 2"));
    Funcionario funcionarioDaProGasto = (new Funcionario(new Pessoa("euzinha", "n sei né3", "666dnv"), 1518,
        "querer comprar a loja inteira"));
    Funcionario funcionarioFds = (new Funcionario(new Pessoa("elias cardoso slaoq", "n sei né4", "fim de semana"),
        1518, "vir trabalhar"));
    Funcionario slaMano = (new Funcionario(new Pessoa("preguiça", "null", "1..."), 0, "existir."));

    loja.getFuncionarios().add(prof);
    loja.getFuncionarios().add(funcionarioPreguicoso);
    loja.getFuncionarios().add(funcionarioNerdola);
    loja.getFuncionarios().add(funcionarioDaProGasto);
    loja.getFuncionarios().add(funcionarioFds);
    loja.getFuncionarios().add(slaMano);

    loja3.getFuncionarios().add(slaMano);
    loja4.getFuncionarios().add(slaMano);
    loja5.getFuncionarios().add(slaMano);

    // LinkedList<Loja> lojas = new LinkedList<Loja>();
    lojas.add(loja);
    lojas.add(loja3);
    lojas.add(loja4);
    lojas.add(loja5);

    loja.getInstrumentos().add(new Instrumento("Violão Clássico", "Cordas", 750.00f, "Marrom", 2));
    loja.getInstrumentos().add(new Instrumento("Guitarra Stratocaster", "Cordas", 5500.00f, "Vermelha", 3));
    loja.getInstrumentos().add(new Instrumento("Baixo Jazz Bass", "Cordas", 2200.00f, "Preto", 3));
    loja.getInstrumentos().add(new Instrumento("Bateria Acústica", "Percussão", 8500.00f, "Azul", 3));
    loja.getInstrumentos().add(new Instrumento("Teclado Digital", "Teclas", 4200.00f, "Branco", 2));
    loja.getInstrumentos().add(new Instrumento("Saxofone Alto", "Sopro", 3900.00f, "Dourado", 2));
    loja.getInstrumentos().add(new Instrumento("Flauta Transversal", "Sopro", 1200.00f, "Prata", 1));
    loja.getInstrumentos().add(new Instrumento("Caixa de Bateria", "Percussão", 950.00f, "Preta", 2));
    loja.getInstrumentos().add(new Instrumento("Pandeiro", "Percussão", 180.00f, "Natural", 1));
    loja.getInstrumentos().add(new Instrumento("Microfone Dinâmico", "Acessórios", 600.00f, "Cinza", 1));

    loja3.getInstrumentos().add(new Instrumento("Violão A", "Cordas", 750.00f, "Marrom", 2));
    loja3.getInstrumentos().add(new Instrumento("Guitarra abc", "Cordas", 5500.00f, "Vermelha", 3));

    loja4.getInstrumentos().add(new Instrumento("Violão B", "Cordas", 750.00f, "Marrom", 2));
    loja4.getInstrumentos().add(new Instrumento("Guitarra bca", "Cordas", 5500.00f, "Vermelha", 3));

    loja5.getInstrumentos().add(new Instrumento("Violão c", "Cordas", 750.00f, "Marrom", 2));
    loja5.getInstrumentos().add(new Instrumento("Guitarra 000", "Cordas", 5500.00f, "Vermelha", 3));

  }

}
