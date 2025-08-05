import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            switch (opcao) {
                case 1:
                    System.out.println("----Cadastrar Diretor----");
                    System.out.print("Nome do Diretor: ");
                    String nomeDiretor = scanner.nextLine();
                    Diretor novoDiretor = new Diretor(nomeDiretor);
                    diretores.add(novoDiretor);
                    break;
                case 2:
                    System.out.println("----Cadastrar Ator----");
                    System.out.println("Nome do Ator");
                    String nomeAtor = scanner.nextLine();
                    Ator novoAtor = new Ator(nomeAtor);
                    atores.add(novoAtor);
                    break;
                case 3:
                    System.out.println("----Cadastrar Filme----");
                    System.out.println("Digite nome do Filme");
                    String tituloFilme = scanner.nextLine();
                    System.out.println("Data de Lançamento (formato: AAAA-MM-DD):");
                    String data = scanner.nextLine();
                    LocalDate dataLancamento = LocalDate.parse(data);
                    System.out.println("Descrição:");
                    String descricao = scanner.nextLine();
                    System.out.println("Escolha o diretor pelo índice:");
                    for (int i = 0, i<diretores.size(), i++){
                    System.out.println(i + "- " + diretores.get(i).getnome());
                }
                int indice = scanner.nextInt();
                scanner.nextLine();
                Diretor diretorEscolhido = diretores.get(indice);

                Filme novoFilme = new Filme(tituloFilme, dataLancamento, descricao, diretorEscolhido);
                break;
                case 4:
                    System.out.println("----Buscar Filme pelo nome----");
                    System.out.println("Digite nome do filme: ");
                    String buscarFilme= scanner.nextLine();
                    for(Filme f: filmes){
                        if(f.getNome().equalsIgnoreCase(buscarFilme)){
                            return f;
                        }
                }
                    break;
                default:
                    System.out.printf("");
                    break;
            }
        }
    }
}
