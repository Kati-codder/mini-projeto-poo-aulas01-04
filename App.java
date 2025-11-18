public class App {
    public static void main(String[] args) {

        Filme f1 = new Filme("Interestelar", 2014, "Ficção Científica", 169);
        Serie s1 = new Serie("Breaking Bad", 2008, "Drama", 5, 13);

        System.out.println("=== Catálogo de Mídias ===\n");

        System.out.println("Filme:");
        System.out.println(f1.exibirResumo());

        System.out.println("\n==========================\n");

        System.out.println("Série:");
        System.out.println(s1.exibirResumo());
    }
}
