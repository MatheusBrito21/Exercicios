package exercicios;

public class Invoice {
	
	String nomeItem;
	long codBarras;
	int qtd;
	double preco;
	
	
	Invoice(){
		nomeItem ="";
		codBarras = 000000;
		qtd = 0;
		preco = 0.0;
	}
	
	Invoice(String nome,long codBarras, int qtd, double preco){
		this.nomeItem = nome;
		this.codBarras = codBarras;
		this.qtd = qtd;
		this.preco = preco;
	}
	
	double getInvoice() {
		double total = qtd*preco;
		return total;
	}
	
	@Override
	public String toString() {
	return String.format(
		"Item:%s"
		+ "\nPreco:R$%.2f"
		+ "\nQuantidade:%d\n", nomeItem,preco,qtd);
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public long getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(long codBarras) {
		this.codBarras = codBarras;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


}

