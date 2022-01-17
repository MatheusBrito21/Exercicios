package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String resp1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String resp2 = JOptionPane.showInputDialog("Qual a nota 2?");
		
		System.out.println(resp1 +" - "+resp2);
		
		double nota1 = Double.parseDouble(resp1);
		double nota2 = Double.parseDouble(resp2);
		double media = (nota1+nota2)/2;
		
		System.out.println("Média:" + media);

	}

}
