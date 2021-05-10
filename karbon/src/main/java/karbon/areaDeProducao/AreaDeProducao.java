package karbon.areaDeProducao;

import karbon.maquina.Maquina;
import java.util.HashSet;
import java.util.Set;

public class AreaDeProducao {
	public Set<Maquina> maquinas = new HashSet<Maquina>();
	public String funcao;
	
	public AreaDeProducao (String funcao) {
		setFuncao(funcao);
	}
	
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	
	public void addMaquina (Maquina maquina) {
		this.maquinas.add(maquina);
	}
}
