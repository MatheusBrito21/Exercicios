package estruturasDeControle;

public class Break {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			if(i == 2) {
				break;
			}//o break finaliza o laço de repetição 
			System.out.println(i);
		}
		System.out.println("Fim");
	}

}
