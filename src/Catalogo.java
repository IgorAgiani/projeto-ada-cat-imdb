import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private final List<Filme> filmes;
    private final List<Diretor> diretores;
    private final List<Ator> atores;

    public Catalogo() {
        this.filmes = new ArrayList<>();
        this.diretores = new ArrayList<>();
        this.atores = new ArrayList<>();
    }

    public void adicionarDiretor(Diretor diretor) {
        if (diretor != null) {
            diretores.add(diretor);
            System.out.println("Diretor adicionado com sucesso");
        } else {
            System.out.println("Erro: Diretor inválido");
        }
    }

    public void listarDiretores() {
        if (diretores.isEmpty()) {
            System.out.println("Não há diretores cadastrados");
            return;
        }

        System.out.println("\nLista de Diretores");
        for (int i = 0; i < diretores.size(); i++) {
            System.out.println(i + " - " + diretores.get(i).getNome());
        }
    }

    public Diretor buscarDiretorPorIndice(int indice) {
        if (indice >= 0 && indice < diretores.size()) {
            return diretores.get(indice);
        }
        System.out.println("Erro: Indice inválido");
        return null;
    }

    public void buscarDiretorPorNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Erro: Nome do Diretor inválido");
            return;
        }
        boolean diretorEncontrado = false;
        for (Diretor diretor : diretores) {
            if (diretor.getNome().equalsIgnoreCase(nome)) {
                diretor.exibirDetalhes();
                diretorEncontrado = true;
                break;
            }
        }
        if (!diretorEncontrado) {
            System.out.println("Diretor não encontrado!");
        }
    }

    public void adicionarAtor(Ator ator) {
        if (ator != null) {
            atores.add(ator);
            System.out.println("Ator adicionado com sucesso!");
        } else {
            System.out.println("Erro: Ator inválido");
        }
    }

    public void listarAtores() {
        if (atores.isEmpty()) {
            System.out.println("Não há atores cadastrados");
            return;
        }
        System.out.println("\nLista de Atores");
        for (int i = 0; i < atores.size(); i++) {
            System.out.println(i + " - " + atores.get(i).getNome());
        }
    }

    public void adicionarFilme(Filme filme) {
        if (filme != null) {
            filmes.add(filme);
            System.out.println("Filme adicionado com sucesso!");
        } else {
            System.out.println("Erro: Filme inválido!");
        }
    }

    public void buscarFilmePorNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Erro: Nome do filme inválido");
            return;
        }

        boolean encontrado = false;
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(nome.trim())) {
                exibirDetalhesFilme(filme);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Filme não encontrado!");
        }
    }

    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Não há filmes cadastrados!");
            return;
        }
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(i + " - " + filmes.get(i).getTitulo());
        }
    }

    private void exibirDetalhesFilme(Filme filme) {
        System.out.println("----------------------------------------");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Data de Lançamento: " + filme.getDataLancamento());
        System.out.println("Orçamento: " + filme.getOrcamento());
        System.out.println("Diretor: " + filme.getDiretor().getNome());
        System.out.println("Descrição: " + filme.getDescricao());
        System.out.println("Atores:");
        for (Ator ator : filme.getAtores()) {
            System.out.println("- " + ator.getNome());
        }
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void removerFilme(int indice) {
        if (indice >= 0 && indice < filmes.size()) {
            filmes.remove(indice);
            System.out.println("Filme removido");
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void removerDiretor(int indice) {
        if(indice>=0 && indice<diretores.size()){
            diretores.remove(indice);
            System.out.println("Diretor removido");
        }else
            System.out.println("índice inválido");
    }

    public void removerAtor(int indice) {
        if(indice>=0 && indice<atores.size()){
            atores.remove(indice);
            System.out.println("Ator removido");
        }else
            System.out.println("índice inválido");
    }

    public void buscarAtorPorNome(String buscarAtor) {
        if (buscarAtor == null || buscarAtor.isEmpty()) {
            System.out.println("Erro: Nome do Ator inválido");
            return;
        }

        boolean encontrado = false;
        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(buscarAtor)) {
                ator.exibirDetalhes();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ator não encontrado!");
        }
    }
}