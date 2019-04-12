import java.time.LocalDate;

public class Encomenda {
    LocalDate data;
    RequisicaoCompra requisicao;

    public Encomenda(LocalDate data, RequisicaoCompra requisicao) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public RequisicaoCompra getRequisicao() {
        return this.requisicao;
    }

    public void setRequisicao(RequisicaoCompra requisicao) {
        this.requisicao = requisicao;
    }
}
