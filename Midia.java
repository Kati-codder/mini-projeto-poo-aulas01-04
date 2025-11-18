public class Midia {
    private String titulo;
    private int anoLancamento;
    private String genero;

    public Midia(String titulo, int anoLancamento, String genero) {
        setTitulo(titulo);
        setAnoLancamento(anoLancamento);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título inválido.");
        }
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento < 1880) {
            throw new IllegalArgumentException("Ano inválido.");
        }
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("Gênero inválido.");
        }
        this.genero = genero;
    }

    public String exibirResumo() {
        return "Título: " + titulo +
               "\nAno: " + anoLancamento +
               "\nGênero: " + genero;
    }
}
