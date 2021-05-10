package karbon.abstractUser;

import java.util.HashSet;
import java.util.Set;

public class P4 extends AbstractUser {
	private Set<String> horarios = new HashSet<String>();
	
	public P4 (String nome, String email, String id) {
		super.setNome(nome);
		super.setEmail(email);
		super.setId(id);
	}
	
	public void addHorario (String horario) {
		this.horarios.add(horario);
	}
}
