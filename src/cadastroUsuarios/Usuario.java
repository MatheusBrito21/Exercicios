package cadastroUsuarios;

public class Usuario {
	 String nome = "";
	 String email = "";
	 String senha = "";
	

	Usuario() {
		this("nome","gmail","123456");
	}
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String toString() {
		return String.format("Nome:%s\nEmail:%s", nome,email);
	}
	
	public boolean validarNome() {
		if(this.nome.length()<6) {
			throw new CaracteresException();
		}
		return true;
	}
	
	public boolean validarSenha() {
		if(this.senha.length()<6) {
			throw new CaracteresException();
		}
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
