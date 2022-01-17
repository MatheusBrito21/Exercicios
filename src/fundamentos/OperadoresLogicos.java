package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean exTrabalho1 = false;
		boolean exTrabalho2 = true;
		
		boolean comprouSorvete = exTrabalho1 || exTrabalho2;// || - ou
		boolean comprouTv50 = exTrabalho1 && exTrabalho2;// && - e
		boolean comprouTv32 = exTrabalho1 ^ exTrabalho2;// ou exclusivo
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("Tv 50 = "+comprouTv50);
		System.out.println("Tv 32 = "+comprouTv32);
		
//		operador unario intruso -> ! negação
		
		System.out.println("Fome = "+ !comprouSorvete);
		
	}

}
