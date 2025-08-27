package envDev.exercises2;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			int anterior = numero - 1;
			int posterior = numero + 1;
			JOptionPane.showMessageDialog(null,
					String.format("Número: %d, Anterior: %d, Posterior %d", 
							numero, anterior, posterior));
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido");
		}

	}

}
