import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {

        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcao;
        boolean menu = true;
        while (menu) {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                   CATÁLOGO IMDB                     ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Diretor                    ");
            System.out.println("            2 - Buscar Diretor pelo nome             ");
            System.out.println("            3 - Deletar Diretor                      ");
            System.out.println("            4 - Listar Diretor                       ");
            System.out.println("            5 - Cadastrar Ator                       ");
            System.out.println("            6 - Buscar Ator pelo nome                ");
            System.out.println("            7 - Deletar Ator                         ");
            System.out.println("            8 - Listar Ator                          ");
            System.out.println("            9 - Cadastrar Filme                      ");
            System.out.println("            10 - Buscar Filme pelo nome              ");
            System.out.println("            11 - Deletar Filme                       ");
            System.out.println("            12 - Listar Filmes                       ");
            System.out.println("            13 - Sair                                ");
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
                    buscarDiretor(catalogo);
                    break;
                case 3:
                    deletarDiretor(catalogo);
                    break;
                case 4:
                    listarDiretor(catalogo);
                    break;
                case 5:
                    cadastrarAtor(catalogo);
                    break;
                case 6:
                    buscarAtor(catalogo);
                    break;
                case 7:
                    deletarAtor(catalogo);
                    break;
                case 8:
                    listarAtor(catalogo);
                    break;
                case 9:
                    cadastrarFilme(catalogo);
                    break;
                case 10:
                    buscarFilme(catalogo);
                    break;
                case 11:
                    deletarFilme(catalogo);
                    break;
                case 12:
                    listarFilme(catalogo);
                    break;
                case 13:
                    System.out.println("Saindo do sistema...");
                    menu = false;
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

    private static void listarDiretor(Catalogo catalogo) {
        System.out.println("----Lista de Diretores----");
        catalogo.listarDiretores();
    }

    private static void deletarDiretor(Catalogo catalogo) {
        if (catalogo.getDiretores().isEmpty()) {
            System.out.println("Não há diretores para deletar.");
            return;
        }
        catalogo.listarDiretores();
        System.out.println("Digite o índice do Diretor a ser deletado:");
        int indice = scanner.nextInt();
        scanner.nextLine();
        catalogo.removerDiretor(indice);
    }

    private static void buscarDiretor(Catalogo catalogo) {
        System.out.println("----Buscar Diretor pelo nome----");
        System.out.println("Digite nome do Diretor: ");
        String buscarDiretor = scanner.nextLine();
        catalogo.buscarDiretorPorNome(buscarDiretor);
    }

    private static void listarAtor(Catalogo catalogo) {
        System.out.println("----Lista de Atores----");
        catalogo.listarAtores();
    }

    private static void deletarAtor(Catalogo catalogo) {
        if (catalogo.getAtores().isEmpty()) {
            System.out.println("Não há atores para deletar.");
            return;
        }
        catalogo.listarAtores();
        System.out.println("\nDigite o índice do Ator a ser deletado:");
        int indice = scanner.nextInt();
        scanner.nextLine();
        catalogo.removerAtor(indice);
    }

    private static void buscarAtor(Catalogo catalogo) {
        System.out.println("----Buscar Ator pelo nome----");
        System.out.println("Digite nome do Ator: ");
        String buscarAtor = scanner.nextLine();
        catalogo.buscarAtorPorNome(buscarAtor);

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

        catalogo.listarDiretores();
        System.out.println("\nEscolha o diretor pelo índice:");
        int indiceDiretor = scanner.nextInt();
        scanner.nextLine();

        Diretor diretorEscolhido = catalogo.buscarDiretorPorIndice(indiceDiretor);
        if (diretorEscolhido != null) {
            ArrayList<Ator> elenco = new ArrayList<>();

            catalogo.listarAtores();
            if (catalogo.getAtores().isEmpty()) {
                System.out.println("Cadastre atores antes de associar a um filme");
            } else {
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

    public static void deletarFilme(Catalogo catalogo) {
        if (catalogo.getFilmes().isEmpty()) {
            System.out.println("Não há filmes para deletar.");
            return;
        }
        catalogo.listarFilmes();
        System.out.println("\nDigite o índice do filme a ser deletado:");
        int indice = scanner.nextInt();
        scanner.nextLine();
        catalogo.removerFilme(indice);
    }
}
