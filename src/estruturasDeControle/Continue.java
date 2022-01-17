package estruturasDeControle;

public class Continue {
	public static void main(String[] args) {
		
		for ( int i= 0; i < 5; i++) {
			if(i == 2) {
				continue;
			}//o continue pula a execução do codigo quando i == 2
			System.out.println(i);
		}
		System.out.println("Fim");
	}
}
