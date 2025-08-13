import java.time.LocalDate;
import java.util.List;

public class Filme {
    private String titulo;
    private LocalDate dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String titulo, LocalDate dataLancamento, double orcamento, String descricao, Diretor diretor, List<Ator> atores) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getTitulo() { return titulo; }

    public LocalDate getDataLancamento() { return dataLancamento; }

    public double getOrcamento() { return orcamento; }

    public String getDescricao() { return descricao; }

    public Diretor getDiretor() { return diretor; }

    public List<Ator> getAtores() { return atores; }
}
