package selecaoEncadeada;

import javax.swing.JOptionPane;

public class Nadador {

	public static void main(String[] args) {
		
		try {
		
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			
			if ( (idade >= 0) && (idade <= 120) ) {
				
				if (idade <= 5)
					JOptionPane.showMessageDialog(null, "Infantil A");
				else if (idade <= 8)
					JOptionPane.showMessageDialog(null, "Infantil B");
				else if (idade <= 11)
					JOptionPane.showMessageDialog(null, "Infantil C");
				else if (idade <= 13)
					JOptionPane.showMessageDialog(null, "Juvenil A");
				else if (idade <= 17)
					JOptionPane.showMessageDialog(null, "Juvenil B");
				else
					JOptionPane.showMessageDialog(null, "Adulto");				
			} else
				JOptionPane.showMessageDialog(null, "Idade inválida");
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
