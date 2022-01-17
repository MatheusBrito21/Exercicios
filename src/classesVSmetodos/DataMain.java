package classesVSmetodos;

public class DataMain {
	public static void main(String[] args) {
		
		Data padrao = new Data();
		Data nascimento = new Data(4, 4, 1998);
		
		System.out.println(padrao.formatarData());
		System.out.println(nascimento.formatarData());
	}

}
