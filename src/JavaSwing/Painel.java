package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Painel extends JPanel {
	private Color COR = Color.WHITE;
	private JLabel campo = new JLabel("");
//	private JLabel telefone = new JLabel("");
	
	public Painel() {
		setBackground(Color.darkGray);
		setLayout(new BorderLayout());
		setFont(new Font("times", Font.BOLD, 20));
		
		
		campo.setForeground(COR);
		campo.setText("Nome:");
		add(campo, BorderLayout.WEST);
		
	}


	
	
	
}
