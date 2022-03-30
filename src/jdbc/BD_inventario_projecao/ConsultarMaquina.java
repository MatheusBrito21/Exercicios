package jdbc.BD_inventario_projecao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsultarMaquina {
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = ConectarBD.getConexao();
		Statement stmt = conexao.createStatement();
		
		String sql = "SELECT * FROM INV_MAQUINAS WHERE SETOR = 'CSTI';";
		
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Maquina> lista_maquina = new ArrayList<Maquina>();
		
		//Verifica se ainda há linhas na tabela
				while(resultado.next()) {
					
					int ep = resultado.getInt("EP");
					String marca = resultado.getString("MARCA");
					String modelo = resultado.getString("MODELO");
					String setor = resultado.getString("SETOR");
				lista_maquina.add(new Maquina(ep, marca, modelo, setor));
					
				}
				
				Consumer<Maquina> imprimir = m -> 
				System.out.println("EP:"+ m.getEp()+" "
								+ m.getMarca()
								+ " "+m.getModelo()+" "
								+ "Setor:"+m.getSetor());
				
			lista_maquina.forEach(imprimir);
	}
}
