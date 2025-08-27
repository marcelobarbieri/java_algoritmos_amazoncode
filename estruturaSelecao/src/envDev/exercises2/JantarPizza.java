package envDev.exercises2;

import javax.swing.JOptionPane;

public class JantarPizza {

	public static void main(String[] args) {
		
		try {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do jantar"));
			int clientes = Integer.parseInt(JOptionPane.showInputDialog("Clientes"));
			JOptionPane.showMessageDialog(null,
					String.format("Valor do jantar por cliente %.2f", valor / clientes));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato inválido");
		}

	}

}
