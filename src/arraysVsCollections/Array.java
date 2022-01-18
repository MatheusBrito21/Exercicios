package arraysVsCollections;

public class Array {

	public static void main(String[] args) {
		
		double[] notasJoao = {7.0, 8.5, 6.2,5.5};
		
		double[] notasMaria = new double[4];
		notasMaria[0] = 7.5;
		notasMaria[1] = 8.5;
		notasMaria[2] = 9.0;
		notasMaria[3] = 8.0;
		
		double totalJoao = 0;
		for(int i =0; i< notasJoao.length;i++) {
			totalJoao+=notasJoao[i];
		}
		
		//for(each)
		double totalMaria = 0;
		for(double nota: notasMaria ) {
			totalMaria+=nota;
		}
		
		System.out.println(totalJoao/notasJoao.length);
		System.out.println(totalMaria/notasMaria.length); 
		
		
	}

}
