import java.time.LocalDate;

public class Requisicao {
    LocalDate data;
    Utilizador utilizador;
    Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador, Copia copia) {
        this.data = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Copia getCopia() {
        return this.copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}
