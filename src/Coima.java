public class Coima {
    String descricao;
    float valor;
    Devolucao devolucao;
    
    public Coima(String descricao, float valor, Devolucao devolucao) {
        this.descricao = descricao;
        this.valor = valor;
        this.devolucao = devolucao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Devolucao getDevolucao() {
        return this.devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
}
