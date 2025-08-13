public abstract class Pessoa {

    private String nome;
    private String miniBiografia;

    public Pessoa(String nome, String miniBiografia) {
        this.nome = nome;
        this.miniBiografia = miniBiografia;
    }

    public String getNome() {
        return nome;
    }

    public String getMiniBiografia() {
        return miniBiografia;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Mini biografia: " + this.getMiniBiografia());
    }
}


