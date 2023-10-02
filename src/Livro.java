public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String tirulo, String autor, boolean disponivel) {
        this.titulo = tirulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tirulo) {
        this.titulo = tirulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
