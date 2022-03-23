package cadastroUsuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Controlador {
	private static Controlador controle = new Controlador();
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Controlador() {
		
	}
	
	public void cadastrarUsuario(String nome, String email, String senha) {
		try {
			Usuario user = new Usuario();
			user.nome = nome;
			user.email = email;
			user.senha = senha;
			user.validarNome();
			user.validarSenha();
			
			usuarios.add(user);
		} catch (Exception e) {
			System.out.println("Digite no minimo 6 caracteres para Nome e Senha.");
		}
	}
	
	Consumer<Usuario> imprimirUsuarios = u -> System.out.println(u);
	public void imprimirListaUsuarios() {
		usuarios.stream().forEach(imprimirUsuarios);
	}

	public static Controlador getControle() {
		return controle;
	}
	
	
	
	
}
