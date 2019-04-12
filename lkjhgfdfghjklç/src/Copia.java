public class Copia {

    int id;
    Livro livro;

    //Constructors
    public Copia(int id, Livro livro) {
        this.id = id;
        this.livro = livro;
    }

    //GETs
    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setId(int id) {
        this.id = id;
    }

    //SETs
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
