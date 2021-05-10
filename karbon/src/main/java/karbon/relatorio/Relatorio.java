package karbon.relatorio;

import karbon.causa.Causa;
import java.util.HashSet;
import java.util.Set;

public class Relatorio {
	public Set<Causa> causas = new HashSet<Causa>();
	
	public Relatorio () {
	}
	
	public void addCausas (Causa causa) {
		this.causas.add(causa);
	}
	
	public Set<Causa> getCausas () {
		return this.causas;
	}
}
