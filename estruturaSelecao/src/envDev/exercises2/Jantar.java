package envDev.exercises2;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {
		
		final double taxa_garcom = 0.1;
		
		try {			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do jantar"));		
			double total = valor * (1 + taxa_garcom);
			JOptionPane.showMessageDialog(null, 
					String.format("Total: %.2f", total));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}

	}

}
