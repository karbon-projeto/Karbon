package karbon.abstractUser;

public abstract class AbstractUser {
	public String nome;
	public String email;
	public String id;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setId (String id) {
		this.id = id;
	}
}
