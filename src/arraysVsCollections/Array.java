package arraysVsCollections;

public class Array {

	public static void main(String[] args) {
		
		double[] notasJoao = {7.0, 8.5, 6.2,5.5};
		
		double[] notasPedro = new double[4];
		notasPedro[0] = 7.5;
		notasPedro[1] = 8.5;
		notasPedro[2] = 9.0;
		notasPedro[3] = 8.0;
		
		double totalJoao = 0;
		for(int i =0; i< notasJoao.length;i++) {
			totalJoao+=notasJoao[i];
		}
		
		
		//alteração 19/01/22
		//teste de upload
		double totalPedro = 0;
		for(double nota: notasPedro ) {
			totalPedro+=nota;
		}
		
		System.out.println(totalJoao/notasJoao.length);
		System.out.println(totalPedro/notasPedro.length); 
		
		
	}

}
