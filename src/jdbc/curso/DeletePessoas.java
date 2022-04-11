package jdbc.curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePessoas {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o codigo do usuário");
		int cod = e.nextInt();
		
		String sql = "DELETE FROM PESSOAS WHERE COD = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, cod);
		
		//executa o comando e retorna a quantidade de linhas afetadas
		if(stmt.executeUpdate()>0) {
			System.out.println("Usuário deletado.");
		}else {
			System.out.println("Não há registro.");
		}
		
		e.close();
		conexao.close();
		
	}
}
