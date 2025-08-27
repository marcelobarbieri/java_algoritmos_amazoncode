package selecaoComposta;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		try {
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Número")
			);
			
			if (numero % 2 == 0)
				JOptionPane.showMessageDialog(null,
						String.format("O número %d é par", numero)
				);
			else
				JOptionPane.showMessageDialog(null,
						String.format("O número %d é ímpar", numero)
				);				
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
