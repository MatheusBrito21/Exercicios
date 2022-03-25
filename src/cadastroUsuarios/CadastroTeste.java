package cadastroUsuarios;

public class CadastroTeste {
	public static void main(String[] args) {
		
		Controlador.getControle().cadastrarUsuario("Matheus", "matheusb790", "123456");
		Controlador.getControle().imprimirListaUsuarios();
		
	}
}
