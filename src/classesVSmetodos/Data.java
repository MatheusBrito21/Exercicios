package classesVSmetodos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//o metodo This() faz referencia ao construtor Data(int dia,int mes, int ano);
		this(1,1,1970);
	}
	
	Data(int dia,int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	
	 String formatarData() {
		return dia+"/"+mes+"/"+ano;
	}
}
