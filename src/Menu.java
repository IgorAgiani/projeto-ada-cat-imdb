import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        while (true) {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                   CATÁLOGO IMDB                     ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Diretores                  ");
            System.out.println("            2 - Cadastrar Atores                     ");
            System.out.println("            3 - Cadastrar Filme                      ");
            System.out.println("            4 - Buscar Filme pelo nome               ");
            System.out.println("            5 - Listar Filmes                         ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite nome do Diretor");
                    String nomeDiretor= scanner.nextLine();
                    //cadastrarDiretor(String nomeDiretor);
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite nome do Filme");
                    String nomeFilme = scanner.nextLine();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.printf("");
                    break;
            }
        }
    }
}
