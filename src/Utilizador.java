
public class Utilizador {
    String nome;
    String estado;
    TipoUtilizador TipoUtilizador;

	public Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
		this.nome = nome;
		this.estado = estado;
		TipoUtilizador = tipoUtilizador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoUtilizador getTipoUtilizador() {
		return TipoUtilizador;
	}

	public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
		TipoUtilizador = tipoUtilizador;
	}

    
}
