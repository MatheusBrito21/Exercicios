package jdbc.curso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM PESSOAS";
		
		Statement stmt = conexao.createStatement();
		//retorna o resultado do comando sql
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//Verifica se ainda há linhas na tabela
		while(resultado.next()) {
			
			int codigo = resultado.getInt("COD");
			String nome = resultado.getString("NOME");
			pessoas.add(new Pessoa(codigo, nome));
			
		}
		
		pessoas.stream()
		.forEach(p -> System.out.println(p.getCod()+"->"+p.getNome()));
		
		conexao.close();
		
		
	}
}
