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

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMiniBiografia() {
        return miniBiografia;
    }

    public void setMiniBiografia(String miniBiografia) {
        this.miniBiografia = miniBiografia;
    }


    public void exibirDetalhes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Mini biografia: " +  this.getMiniBiografia());
    }

}


