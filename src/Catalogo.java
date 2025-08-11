import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import static javax.swing.UIManager.get;

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

    public void listarDiretores(){
        if (diretores.isEmpty()){
            System.out.println("Não há diretores cadastrados");
            return;
        }

        System.out.println("\nLista de Diretores");
        for (int i = 0; i < diretores.size(); i++) {
            System.out.println(i + " - " + diretores.get(i).getNome());
        }
    }

    public Diretor buscarDiretorPorIndice(int indice){
        if (indice >= 0 && indice < diretores.size()){
            return diretores.get(indice);
        }
        System.out.println("Erro: Indice inválido");
        return null;
    }

    //Método para Atores
    public void adicionarAtor(Ator ator){
        if (ator != null){
            atores.add(ator);
            System.out.println("Ator adicionado com sucesso!");
        } else {
            System.out.println("Erro: Ator inválido");
        }
    }


    public void listarAtores(){
        if (atores.isEmpty()) {
            System.out.println("Não há atores cadastrados");
            return;
        }
        System.out.println("\nLista de Atores");
        for (int i = 0; i < atores.size(); i++) {
            System.out.println(i + " - " + atores.get(i).getNome());
        }
    }

    //Métodos para Filmes
    public void adicionarFilme(Filme filme){
        if (filme != null){
            filmes.add(filme);
            System.out.println("Filme adicionado com sucesso!");
        }else{
            System.out.println("Erro: Filme inválido!");
        }
    }

    public void buscarFilmePorNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("Erro: Nome do filme inválido");
            return;
        }

        boolean encontrado = false;
        for (Filme filme : filmes){
            if (filme.getTitulo().equalsIgnoreCase(nome.trim())){
                exibirDetalhesFilme(filme);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Filme não encontrado!");
        }
    }

    public void listarFilmes(){
        if (filmes.isEmpty()){
            System.out.println("Não há filmes cadastrados!");
            return;
        }
        System.out.println("\nLista de Filmes");
        for (int i = 0; i < filmes.size(); i++){
            System.out.println(i + " - " + filmes.get(i).getTitulo());
        }
    }

    //Método auxiliar privado
    private void exibirDetalhesFilme(Filme filme){
        System.out.println("----------------------------------------");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Data de Lançamento: " + filme.getDataLancamento());
        System.out.println("Orçamento: " + filme.getOrcamento());
        System.out.println("Diretor: " + filme.getDiretor().getNome());
        System.out.println("Descrição: " + filme.getDescricao());
        System.out.println("Atores:");
        for (Ator ator : filme.getAtores()){
            System.out.println("- " + ator.getNome());
        }
        System.out.println("----------------------------------------");
    }

    //Métodos auxiliares para o menu
    public List<Diretor> getDiretores(){
        return diretores;
    }
    public List<Ator> getAtores(){
        return atores;
    }
    public List<Filme> getFilmes(){
        return filmes;
    }

}