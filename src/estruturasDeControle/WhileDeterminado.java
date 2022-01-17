package estruturasDeControle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int base =1;
		int expoente = 0;
		
		System.out.println("2^"+expoente+" = "+base);
		while(base <128) {
			base*=2;
			expoente++;
			System.out.println("2^"+expoente+" = "+base);
			
		}
	}

}
