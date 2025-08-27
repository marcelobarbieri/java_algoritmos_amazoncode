package estruturaEnquanto;

import javax.swing.JOptionPane;

public class MenorValor {

	public static void main(String[] args) {

		try {
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));			
			double menor = valor;
			
			while (valor != 0) {
				
				if (valor < menor)
					menor = valor;
				
				valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));				
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Menor valor: %.2f", menor));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
