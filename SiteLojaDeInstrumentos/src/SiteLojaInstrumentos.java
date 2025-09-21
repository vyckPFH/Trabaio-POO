import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SiteLojaInstrumentos {

  final static Scanner LER = new Scanner(System.in);

  public static void main(String[] args) {
    boolean acess = true;

    Loja loja = criarBancoInicial();

    while (acess) {
      System.out.println("Escolha como você ira logar: ");
      System.out.println("Digite 1 para: Acessar o site como 'cliente'; ");
      System.out.println("Digite 2 para: Acessar o site como 'fornecedor'; ");
      System.out.println("Digite 3 para: exit. ");

      int choice = LER.nextInt();

      switch (choice) {
        case 1:
          acessarComoCliente(loja);
          break;
        case 2:
          acessarComoFornecedor(loja);
          break;
        case 3:
          acess = false;
          break;
        default:
          System.out.println("Digite uma escolha valida!");

      }

    }

    // printBancoInicial(loja);

  }

  public static void acessarComoFornecedor(Loja loja) {

  }

  public static void acessarComoCliente(Loja loja) {
    boolean acess = true;

    while (acess) {
      System.out.println("Ações: ");
      System.out.println("Digite 0 para: EXIT");
      System.out.println("Digite 1 para: Conhecer nossa loja!");
      System.out.println("Digite 2 para: Ver quem são nossos funcionarios!");
      System.out.println("Digite 3 para: Consultar quais instrumentos estão disponiveis");
      System.out.println("Digite 4 para: Comprar um instrumento");
      System.out.println("Digite 5 para: Encomendar instrumentos!");

      switch (LER.nextInt()) {
        case 0:
          acess = false;
          break;
        case 1:
          loja.printAboutUs();
          System.out.println();
          break;
        case 2:
          loja.printSlaves();
          System.out.println();// sout loja.funcionarios
          break;
        case 3:
          loja.printInstruments();
          System.out.println();// sout loja.instrumentos
          break;
        case 4:
          // comprarInstrumento();
          break;
        case 5:
          // encomendarInstrumentos();
          break;
        default:
          System.out.println("Digite uma ação valida!!!");
          break;

      }

    }

  }

  public static void comprarInstrumento(){

  }

  public static Loja criarBancoInicial() {

    Loja loja = new Loja("loja Da Roberta", 1, "Ifpr");

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

    loja.getInstrumentos().add(new Instrumento("Violão Clássico", "Cordas", 750.00f, "Marrom", 2, 5));
    loja.getInstrumentos().add(new Instrumento("Guitarra Stratocaster", "Cordas", 5500.00f, "Vermelha", 3, 10));
    loja.getInstrumentos().add(new Instrumento("Baixo Jazz Bass", "Cordas", 2200.00f, "Preto", 3, 2));
    loja.getInstrumentos().add(new Instrumento("Bateria Acústica", "Percussão", 8500.00f, "Azul", 3, 5));
    loja.getInstrumentos().add(new Instrumento("Teclado Digital", "Teclas", 4200.00f, "Branco", 2, 3));
    loja.getInstrumentos().add(new Instrumento("Saxofone Alto", "Sopro", 3900.00f, "Dourado", 2, 2));
    loja.getInstrumentos().add(new Instrumento("Flauta Transversal", "Sopro", 1200.00f, "Prata", 1, 6));
    loja.getInstrumentos().add(new Instrumento("Caixa de Bateria", "Percussão", 950.00f, "Preta", 2, 32));
    loja.getInstrumentos().add(new Instrumento("Pandeiro", "Percussão", 180.00f, "Natural", 1, 8));
    loja.getInstrumentos().add(new Instrumento("Microfone Dinâmico", "Acessórios", 600.00f, "Cinza", 1, 15));

    return loja;
  }

}
