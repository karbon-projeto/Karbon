package karbon.falha;

import java.util.HashSet;
import java.util.Set;
import karbon.causa.Causa;
import java.time.LocalDateTime;

public class Falha {
	public Set<Causa> causas = new HashSet<Causa>();
	public LocalDateTime dataHoraInicio;
	public LocalDateTime dataHoraFim;
	public double duracaoDeFalha;
	
	public Falha () {
	}
	
	public void addCausa (Causa causa) {
		this.causas.add(causa);
	}
	
	public void setDataHoraInicio () {
		this.dataHoraInicio = LocalDateTime.now();
	}
	
	public void setDataHoraFim () {
		this.dataHoraFim = LocalDateTime.now();
	}
	
	public void setPeriodoDeTempo (double periodoDeTempo) {
		this.duracaoDeFalha = periodoDeTempo;
	}
	
	public double getPeriodoDeTempo () {
		return this.duracaoDeFalha;
	}
	
	public LocalDateTime getDataInicio () {
		return this.dataHoraInicio;
	}
	
	public LocalDateTime getDataFim () {
		return this.dataHoraFim;
	}
	
	public Set<Causa> getCausas () {
		return this.causas;
	}
	
	
}
