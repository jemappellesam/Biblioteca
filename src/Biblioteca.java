import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros;
    private List<Autor> autores;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public boolean verificarDisponibilidade(String livro) {
        boolean disponibilidadeLivro = false;
        for (Livro l : livros) {
            if (l.getTitulo().equals(livro)) {
                disponibilidadeLivro = l.isDisponivel();
            }
        }
        return disponibilidadeLivro;
    }
}
