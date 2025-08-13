// classe Ator herda os atibutos da classe Pessoa
public class Ator extends Pessoa {
    private String premio;

    public Ator(String nome, String miniBiografia, String premio) {
        super(nome, miniBiografia);
        this.premio = premio;
    }

    public String getPremio() {
        return premio;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Ultimo prêmio: " + getPremio());
    }
}

