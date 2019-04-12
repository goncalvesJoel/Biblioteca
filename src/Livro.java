public class Livro {
    String titulo;
    String editora;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
