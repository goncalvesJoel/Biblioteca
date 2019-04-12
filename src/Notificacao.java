import java.time.LocalDate;

public class Notificacao {
    LocalDate data;
    Emprestimo emprestimo;

    public Notificacao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Emprestimo getEmprestimo() {
        return this.emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
