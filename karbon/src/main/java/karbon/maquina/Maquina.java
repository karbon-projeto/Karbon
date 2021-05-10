package karbon.maquina;

import java.util.HashSet;
import java.util.Set;

public class Maquina {
	public String local;
	public String funcao;
	public Boolean emFuncionamento;
	public Set<String> equipamentos = new HashSet<String>();
	
	public void addEquipamentos (String equipamento) {
		this.equipamentos.add(equipamento);
	}
	
	public void setSituacao (Boolean situacao) {
		this.emFuncionamento = situacao;
	}
	
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	
	public void setLocal (String local) {
		this.local = local;
	}
	
	public Set<String> getEquipamentos () {
		return this.equipamentos;
	}
	
	public String getLocal () {
		return this.local;
	}
	
	public String getFuncao () {
		return this.funcao;
	}
	
	public Boolean getEmFuncionamento () {
		return this.emFuncionamento;
	}
}
