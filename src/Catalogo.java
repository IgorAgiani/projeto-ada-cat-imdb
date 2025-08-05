import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogo {
    private final List<Filme> filmes;
    private final List<Diretor> diretores;
    private final List<Ator> atores;


    //Construtor
    public Catalogo(){
        this.filmes = new ArrayList<>();
        this.diretores = new ArrayList<>();
        this.atores = new ArrayList<>();
    }

    //Método para diretores
    public void adicionarDiretor(Diretor diretor){
        if (diretor != null){
            diretores.add(diretor);
            System.out.println("Diretor adicionado com sucesso");
        } else {
            System.out.println("Erro: Diretor inválido");
        }
    }






}



//- `adicionarDiretor(Diretor diretor)`
//- `adicionarAtor(Ator ator)`
//- `adicionarFilme(Filme filme)`
//- `listarDiretores()`
//- `buscarDiretorPorIndice(int indice)`
//- `buscarFilmePorNome(String nome)`
//- `listarFilmes()`