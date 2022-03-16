package JavaSwing;

import java.awt.Container;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	
	
	public static void main(String[] args) {	
		Janela field = new Janela();
		field.gerarTela();
	}
	

	private void gerarTela() {
		Container janela = getContentPane();
		setLayout(null);
		
		JLabel labelNome = new JLabel("Nome: ");
		labelNome.setBounds(50, 40, 50, 20);
		
		JFormattedTextField textNome = new JFormattedTextField();
		textNome.setBounds(100, 40, 200, 20);
		
		janela.add(labelNome);
		janela.add(textNome);
		
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
