package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Nota final?");
		n = n.replace(',', '.');
		double nota = Double.parseDouble(n);
		System.out.println("Nota: "+nota);
		
		String c = JOptionPane.showInputDialog("Bom comportamento? Y/N");
		c = c.toUpperCase();
		
		boolean bomComportamento;
		if(c.equals("Y")) {
			bomComportamento = true;
		}else {
			bomComportamento = false;
		}
		System.out.println("Bom Comportamento? "+bomComportamento);
		
		if(nota >= 9 && bomComportamento) {
			System.out.println("Quadro de honra!");
		}else if(nota>=8 || bomComportamento) {
			System.out.println("Parabéns!");
		}
		else {
			System.out.println("Estude mais.");
		}
		
		
	}
}
