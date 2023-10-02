public class Main {

    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca("Lib");

        Livro l1 = new Livro("programação", "Roger", true);
        Livro l2 = new Livro("POO", "Marcelo", true);
        Livro l3 = new Livro("java", "Mracia", false);

        Autor a1 = new Autor("Reginaldo");
        Autor a2 = new Autor("Maria");
        Autor a3 = new Autor("Ana");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.adicionarAutor(a1);
        biblioteca.adicionarAutor(a2);
        biblioteca.adicionarAutor(a3);

        System.out.println(biblioteca.verificarDisponibilidade("programação"));
        System.out.println(biblioteca.verificarDisponibilidade("POO"));
        System.out.println(biblioteca.verificarDisponibilidade("java"));
    }
}
