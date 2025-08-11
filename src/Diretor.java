// classe Diretor herda os atibutos da classe Pessoa
public class Diretor extends Pessoa {
    private double avaliacao;

    public Diretor(String nome, String miniBiografia, double avaliacao) {
        super(nome, miniBiografia);
        this.avaliacao = avaliacao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Avaliação da Academia de Artes e Ciências Cinematrográficas: " + getAvaliacao());
    }
}
