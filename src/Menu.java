import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
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
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarDiretor(catalogo);
                    break;
                case 2:
                    cadastrarAtor(catalogo);
                    break;
                case 3:
                    cadastrarFilme(catalogo);
                    break;
                case 4:
                    buscarFilme(catalogo);
                    break;
                case 5:
                    listarFilme(catalogo);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void cadastrarDiretor(Catalogo catalogo) {
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
    }

    public static void cadastrarAtor(Catalogo catalogo) {
        System.out.println("----Cadastrar Ator----");
        System.out.print("Nome do Ator: ");
        String nomeAtor = scanner.nextLine();
        System.out.print("Mini Biografia: ");
        String biografiaAtor = scanner.nextLine();
        System.out.print("Último Prêmio: ");
        String premio = scanner.nextLine();

        Ator novoAtor = new Ator(nomeAtor, biografiaAtor, premio);
        catalogo.adicionarAtor(novoAtor);
    }

    public static void cadastrarFilme(Catalogo catalogo) {
        System.out.println("----Cadastrar Filme----");
        System.out.print("Digite nome do Filme: ");
        String tituloFilme = scanner.nextLine();
        System.out.print("Data de Lançamento no formato: AAAA-MM-DD: ");
        String data = scanner.nextLine();
        LocalDate dataLancamento = LocalDate.parse(data);
        System.out.print("Orçamento: ");
        double orcamento = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("\nEscolha o diretor pelo índice:");
        catalogo.listarDiretores();
        int indiceDiretor = scanner.nextInt();
        scanner.nextLine();

        Diretor diretorEscolhido = catalogo.buscarDiretorPorIndice(indiceDiretor);
        if (diretorEscolhido != null) {
            ArrayList<Ator> elenco = new ArrayList<>();

            catalogo.listarAtores();
            if (catalogo.getAtores().isEmpty()) {
                System.out.println("Cadastre atores antes de associar a um filme");
            } else {
                System.out.println("\nLista de atores:");
                System.out.println("Digite os índices dos atores separados por vírgula:");
                String indices = scanner.nextLine();

                String[] partes = indices.split(",");
                for (String parte : partes) {
                    try {
                        int indiceAtor = Integer.parseInt(parte.trim());
                        if (indiceAtor >= 0 && indiceAtor < catalogo.getAtores().size()) {
                            elenco.add(catalogo.getAtores().get(indiceAtor));
                        } else {
                            System.out.println("Índice inválido: " + indiceAtor);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido: " + parte.trim());
                    }
                }
                Filme novoFilme = new Filme(tituloFilme, dataLancamento, orcamento, descricao, diretorEscolhido, elenco);
                catalogo.adicionarFilme(novoFilme);
            }
        }

    }

    public static void buscarFilme(Catalogo catalogo) {
        System.out.println("----Buscar Filme pelo nome----");
        System.out.println("Digite nome do filme: ");
        String buscarFilme = scanner.nextLine();
        catalogo.buscarFilmePorNome(buscarFilme);
    }

    public static void listarFilme(Catalogo catalogo) {
        System.out.println("----Lista de Filmes----");
        catalogo.listarFilmes();
    }
}
