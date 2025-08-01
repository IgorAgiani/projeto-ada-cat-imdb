public class Filme {
    private String titulo;
    private java.time.LocalDate dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private java.util.List<Ator> atores;

    // Construtor
    public Filme(String titulo, java.time.LocalDate dataLancamento, double orcamento, String descricao, Diretor diretor, java.util.List<Ator> atores) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public java.time.LocalDate getDataLancamento() { return dataLancamento; }
    public void setDataLancamento(java.time.LocalDate dataLancamento) { this.dataLancamento = dataLancamento; }

    public double getOrcamento() { return orcamento; }
    public void setOrcamento(double orcamento) { this.orcamento = orcamento; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Diretor getDiretor() { return diretor; }
    public void setDiretor(Diretor diretor) { this.diretor = diretor; }

    public java.util.List<Ator> getAtores() { return atores; }
    public void setAtores(java.util.List<Ator> atores) { this.atores = atores; }
}
