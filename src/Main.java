import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("Miles Millar",
                "Miles Millar nasceu em 1970. É conhecido pelo seu trabalho em Smallville", 8);
        Ator ator1 = new Ator("Jenna Ortega", "Jenna Ortega nasceu o 27 de setembro de 2002 em Califórnia, EUA",
                "Best Younger Performer in a Film");
        Ator ator2 = new Ator("Hunter Doohan", "Hunter Doohan nasceu o 18 de janeiro de 1994 em Arkansas, EUA.",
                "Best Ensemble Cast Soundwave");
        List<Ator> atores = new ArrayList<>();
        atores.add(ator1);
        atores.add(ator2);

        LocalDate data = LocalDate.of(2022, 10, 31);
        Filme filme = new Filme("Wandinha", data, 2900000, "Inteligente, sarcástica e apática, Wandinha Addams pode estar meio morta por dentro, mas na Escola Nunca Mais ela faz amigos, inimigos e investiga assassinatos."
                , diretor, atores);

        Catalogo catalogo = new Catalogo();
        catalogo.adicionarFilme(filme);
        catalogo.buscarFilmePorNome(filme.getTitulo());

        Menu menu = new Menu();
        menu.exibirMenu();
    }
}