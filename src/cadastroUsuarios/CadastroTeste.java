package cadastroUsuarios;

public class CadastroTeste {
	public static void main(String[] args) {
		
		Controlador.getControle().cadastrarUsuario("Mathe", "matheusb790", "12345");
		Controlador.getControle().imprimirListaUsuarios();
		
	}
}
