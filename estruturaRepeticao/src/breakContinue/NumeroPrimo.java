package breakContinue;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {

		try {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			int divisores = 0;
			
			for (int i = 1; i <= numero; i++) {

				if (numero % i == 0)
					divisores += 1;
				
				if (divisores > 2)
					break;
			}
			
			if (divisores == 2)
				JOptionPane.showMessageDialog(null, "Primo");
			else
				JOptionPane.showMessageDialog(null, "Não é primo");
			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
