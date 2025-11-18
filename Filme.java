public class Filme extends Midia {
    private int duracaoMinutos;

    public Filme(String titulo, int anoLancamento, String genero, int duracaoMinutos) {
        super(titulo, anoLancamento, genero);
        setDuracaoMinutos(duracaoMinutos);
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("Duração inválida.");
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + "\nDuração: " + duracaoMinutos + " minutos";
    }
}

