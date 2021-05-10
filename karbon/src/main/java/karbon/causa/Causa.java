package karbon.causa;

public class Causa {
	public String tipo;
	public String atributo;
	public String disfuncao;
	
	public Causa (String tipo, String atributo, String disfuncao) {
		setTipo(tipo);
		setAtributo(atributo);
		setDisfuncao(disfuncao);
	}

	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public void setAtributo (String atributo) {
		this.atributo = atributo;
	}
	
	public void setDisfuncao (String disfuncao) {
		this.disfuncao = disfuncao;
	}
	
	public String getTipo () {
		return this.tipo;
	}
	
	public String getAtributo () {
		return this.atributo;
	}
	
	public String getDisfuncao () {
		return this.disfuncao;
	}
	
	public String toString() {
		return(tipo + "\t\t" + atributo + "\t\t" + disfuncao + "\n");
	}
}
