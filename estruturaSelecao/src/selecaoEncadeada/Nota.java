package selecaoEncadeada;

import javax.swing.JOptionPane;

public class Nota {

	public static void main(String[] args) {
		
		try {
			
			int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota"));
			
			if ((nota >= 0) && (nota <= 100)) {
				
				if (nota >= 90)
					JOptionPane.showMessageDialog(null, "Excelente");
				else if (nota >= 70)
					JOptionPane.showMessageDialog(null, "Bom");
				else if (nota >= 50)
					JOptionPane.showMessageDialog(null, "Regular");
				else
					JOptionPane.showMessageDialog(null, "Insuficiente");
				
			} else {
				JOptionPane.showMessageDialog(null, "Nota inválida");
			}
						
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
