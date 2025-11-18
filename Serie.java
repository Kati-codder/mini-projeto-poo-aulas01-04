public class Serie extends Midia {
    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int anoLancamento, String genero, int temporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, genero);
        setTemporadas(temporadas);
        setEpisodiosPorTemporada(episodiosPorTemporada);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas <= 0) {
            throw new IllegalArgumentException("Número de temporadas inválido.");
        }
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada <= 0) {
            throw new IllegalArgumentException("Número de episódios inválido.");
        }
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() +
               "\nTemporadas: " + temporadas +
               "\nEpisódios por temporada: " + episodiosPorTemporada;
    }
}
