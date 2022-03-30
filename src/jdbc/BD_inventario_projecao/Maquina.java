package jdbc.BD_inventario_projecao;

public class Maquina {
	private int ep;
	private String marca;
	private String modelo;
	private String setor;
	public Maquina(int ep, String marca, String modelo, String setor) {
		this.ep = ep;
		this.marca = marca;
		this.modelo = modelo;
		this.setor = setor;
	}
	public int getEp() {
		return ep;
	}
	public void setEp(int ep) {
		this.ep = ep;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
