
public class Copia {
    int id;
    Livro livro;

    public Copia(int id, Livro livro) {
        this.id = id;
        this.livro = livro;
    }

    public int getId() {
        return this.id;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}