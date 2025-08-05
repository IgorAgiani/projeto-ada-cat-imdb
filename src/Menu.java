import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcao;
        ArrayList<Diretor> diretores = new ArrayList<>();
        ArrayList<Ator> atores = new ArrayList<>();
        ArrayList<Filme> filmes = new ArrayList<>();

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
            scanner. nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("----Cadastrar Diretor----");
                    System.out.print("Nome do Diretor: ");
                    String nomeDiretor = scanner.nextLine();
                    System.out.print("Mini biografia: ");
                    String miniBiografia = scanner.nextLine();
                    System.out.print("Avaliação da Academia de Artes e Ciências Cinematrográficas: ");
                    double avaliacao = scanner.nextDouble();
                    scanner.nextLine();

                    Diretor novoDiretor = new Diretor(nomeDiretor, miniBiografia, avaliacao);
                    catalogo.adicionarDiretor(novoDiretor);
                    break;
                case 2:
                    System.out.println("----Cadastrar Ator----");
                    System.out.print("Nome do Ator: ");
                    String nomeAtor = scanner.nextLine();
                    System.out.print("Mini Biografia: ");
                    String biografiaAtor = scanner.nextLine();
                    System.out.print("Último Prêmio: ");
                    String premio = scanner.nextLine();

                    Ator novoAtor = new Ator(nomeAtor, biografiaAtor, premio);
                    catalogo.adicionarAtor(novoAtor);

                    break;
                case 3:
                    System.out.println("----Cadastrar Filme----");
                    System.out.print("Digite nome do Filme: ");
                    String tituloFilme = scanner.nextLine();
                    System.out.print("Data de Lançamento (formato: AAAA-MM-DD): ");
                    String data = scanner.nextLine();
                    LocalDate dataLancamento = LocalDate.parse(data);
                    System.out.print("Orçamento: ");
                    double orcamento = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.println("\nEscolha o diretor pelo índice:");
                    catalogo. listarDiretores();
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    Diretor diretorEscolhido = catalogo.buscarDiretorPorIndice(indice);
                    if (diretorEscolhido != null) {
                        ArrayList<Ator> elenco = new ArrayList<>();
                        System.out.println("\n Deseja adicionar atores ao filme? (S/N)");
                        String resposta = scanner.nextLine();

                        while (resposta.equalsIgnoreCase("S")){
                            catalogo.listarAtores();
                            System.out.println("\nEscolha o ator pelo índice: ");
                            int indiceAtor = scanner.nextInt();
                            scanner.nextLine();

                            if (indiceAtor >= 0 && indiceAtor < catalogo.getAtores().size()){
                                elenco.add(catalogo.getAtores().get(indiceAtor));
                            }

                            System.out.println("Deseja adicionar mais atores? (S/N)");
                            resposta = scanner.nextLine();
                        }
                        Filme novoFilme = new Filme(tituloFilme, dataLancamento, orcamento, descricao, diretorEscolhido, elenco);
                        catalogo.adicionarFilme(novoFilme);
                    }
                break;

                case 4:
                    System.out.println("----Buscar Filme pelo nome----");
                    System.out.println("Digite nome do filme: ");
                    String buscarFilme= scanner.nextLine();
                    catalogo.buscarFilmePorNome(buscarFilme);
                    break;

                case 5:
                    System.out.println("----Lista de Filmes----");
                    catalogo.listarFilmes();
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
