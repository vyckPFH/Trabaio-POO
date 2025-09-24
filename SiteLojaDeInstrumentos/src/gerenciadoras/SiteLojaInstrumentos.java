package gerenciadoras;

import conceito.*;
import java.util.LinkedList;
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
    boolean acess = true;

    while (acess) {
      System.out.println("Escolha como você ira logar: ");
      System.out.println("Digite 0 para: exit. ");
      System.out.println("Digite 1 para: adicionar um instrumento a loja; ");
      System.out.println("Digite 2 para: remover um instrumento da loja; ");
      System.out.println("Digite 3 para: mostrar todos os instrumentos atuais registrados; ");

      System.out.println("Digite 4 para: registrar um funcionario na loja; ");
      System.out.println("Digite 5 para: demitir um funcionario da loja; ");
      System.out.println("Digite 6 para: mostrar os funcionarios registrados atuais; ");

      /*
       * adicionar os metodos de alteração!!!!!!!!!!!!!!!!!!!
       */
      switch (LER.nextInt()) {
        case 0:
          acess = false;
          break;
        case 1:
          loja.addInstrumento(loja);
          break;
        case 2:
          loja.removerInstrumento(loja);
          break;
        case 3:
          loja.printInstruments();
          break;
        case 4:
          loja.registrarFuncionario(loja);
          break;
        case 5:
          loja.demitirFuncionario(loja);
          break;
        case 6:
          loja.printSlaves();
        default:
          System.out.println("Digite uma escolha valida!");
          break;

      }
    }
  }

  public static void acessarComoCliente(Loja loja) {
    LinkedList<Venda> vendax = new LinkedList();
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
          System.out.println();
          break;
        case 3:
          loja.printInstruments();
          System.out.println();
          break;
        case 4:
          loja.comprarInstrumento();
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

  public static Loja criarBancoInicial() {

    Loja loja = new Loja("loja Da Roberta", 1, "Ifpr");

    Funcionario prof = (new Funcionario(new Pessoa("Roberta", "n sei né", "n sei néhhhh"), 999999999,
        "fazer pograma"));
    Funcionario funcionarioPreguicoso = (new Funcionario(
        new Pessoa("Willami", "n sei né", "n sei néhhhh"), 1518, "filosofo"));
    Funcionario funcionarioNerdola = (new Funcionario(new Pessoa("Guxtavin", "n sei né2", "777"), 1518,
        "kurt kobain 2"));
    Funcionario funcionarioDaProGasto = (new Funcionario(new Pessoa("euzinha", "n sei né3", "666dnv"), 1518,
        "querer comprar a loja inteira"));
    Funcionario funcionarioFds = (new Funcionario(new Pessoa("Elias", "n sei né4", "fim de semana"),
        1518, "vir trabalhar"));
    Funcionario slaMano = (new Funcionario(new Pessoa("preguiça", "null", "1..."), 0, "existir."));

    loja.getFuncionarios().add(prof);
    loja.getFuncionarios().add(funcionarioPreguicoso);
    loja.getFuncionarios().add(funcionarioNerdola);
    loja.getFuncionarios().add(funcionarioDaProGasto);
    loja.getFuncionarios().add(funcionarioFds);
    loja.getFuncionarios().add(slaMano);

    loja.getInstrumentos().add(new Instrumento("Violão", "Cordas", 750.00f, "Marrom", 2, 5, 03));
    loja.getInstrumentos().add(new Instrumento("Guitarra", "Cordas", 5500.00f, "Vermelha", 3, 10, 01));
    loja.getInstrumentos().add(new Instrumento("Baixo", "Cordas", 2200.00f, "Preto", 3, 2, 007));
    loja.getInstrumentos().add(new Instrumento("Bateria", "Percussão", 8500.00f, "Azul", 3, 5, 06));
    loja.getInstrumentos().add(new Instrumento("Teclado", "Teclas", 4200.00f, "Branco", 2, 3, 005));
    loja.getInstrumentos().add(new Instrumento("Saxofone", "Sopro", 3900.00f, "Dourado", 2, 2, 004));
    loja.getInstrumentos().add(new Instrumento("Flauta", "Sopro", 1200.00f, "Prata", 1, 6, 003));
    loja.getInstrumentos().add(new Instrumento("Caixa", "Percussão", 950.00f, "Preta", 2, 32, 002));
    loja.getInstrumentos().add(new Instrumento("Pandeiro", "Percussão", 180.00f, "Natural", 1, 8, 1));
    loja.getInstrumentos().add(new Instrumento("Microfone", "Acessórios", 600.00f, "Cinza", 1, 15, 001));

    return loja;
  }

}
