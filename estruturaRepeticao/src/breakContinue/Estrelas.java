package breakContinue;

import javax.swing.JOptionPane;

public class Estrelas {

	public static void main(String[] args) {

		try {
			
			String estrelas = "";
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			
			if (numero <= 1)
				JOptionPane.showMessageDialog(null, "Número deve ser maior que 1");
			else
			{
				for (int i = 1; i <= numero; i++) {
					estrelas = estrelas.concat("*");
					
					JOptionPane.showMessageDialog(null, estrelas);
				}
				
			}
						
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
