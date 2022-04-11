package jdbc.curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePessoas {
	public static void main(String[] args) throws SQLException {
		int cod = 0;
		
		Scanner e = new Scanner(System.in);
		System.out.println("Informe o código do usuário:");
		cod = e.nextInt();
		
		
	
		Connection conexao = FabricaConexao.getConexao();
		String sqlSel = "SELECT cod,nome FROM PESSOAS where cod =?";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlSel);
		stmt.setInt(1, cod);
		ResultSet r = stmt.executeQuery();
		
		if(!r.next()) {
			System.out.println("Não há registro.");
		}else {
			int codigo = r.getInt("COD");
			String nome = r.getString("NOME");
			Pessoa p = new Pessoa(codigo, nome);
			System.out.println("O nome atual é "+p.getNome());
			
			System.out.println("Deseja atualizar?(Y/N)");
			String op = e.next();
			
			if(op.equalsIgnoreCase("Y")) {
				e.nextLine();
				
				System.out.println("Informe o novo nome:");
				String nomeUpdate = e.nextLine();
				
				String sqlUp = "UPDATE PESSOAS SET NOME = ? WHERE COD = ?";
				stmt = conexao.prepareStatement(sqlUp);
				stmt.setString(1, nomeUpdate );
				stmt.setInt(2, cod);
				stmt.execute();
				System.out.println("Nome atualizado!");
				
			}else {
				System.out.println("Finalizado!");
			}
			
		}
		
		e.close();
		conexao.close();
	}
}
