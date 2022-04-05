package jdbc.curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPorParametro {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite um valor para pesquisar:");
		String valor = null;
		valor = e.next();
		
		
		String sql = "SELECT * FROM PESSOAS WHERE NOME LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		//seta o valor do primeiro ? no comando sql
		stmt.setString(1,"%" + valor +"%" );
		ResultSet resultado = stmt.executeQuery();
		
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		while(resultado.next()) {
				int cod = resultado.getInt("COD");
				String nome = resultado.getString("NOME");
				listaPessoas.add(new Pessoa(cod, nome));
		}
		listaPessoas.stream().forEach(p -> 
		System.out.println("Cod:"+p.getCod()+"=>"+p.getNome()));
		
		
		
		e.close();
		
	}
}
