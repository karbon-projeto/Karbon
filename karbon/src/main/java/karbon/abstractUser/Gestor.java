package karbon.abstractUser;

public class Gestor extends AbstractUser {
	@SuppressWarnings("unused")
	private String funcaoNaEmpresa;
	
	public Gestor (String nome, String email, String id) {
		super.setNome(nome);
		super.setEmail(email);
		super.setId(id);
	}
	public void setFuncaoNaEmpresa (String funcaoNaEmpresa) {
		this.funcaoNaEmpresa = funcaoNaEmpresa;
	}
}
