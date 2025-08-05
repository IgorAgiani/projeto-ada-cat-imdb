import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogo {

    private final List<Filme> filmes;

    public Catalogo() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        if (filme != null) {
            this.filmes.add(filme);
        }
    }

}