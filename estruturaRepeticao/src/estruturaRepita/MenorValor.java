package estruturaRepita;

import javax.swing.JOptionPane;

public class MenorValor {

	public static void main(String[] args) {

		try {
						
			double valor = 0;
			double menor = Double.MAX_VALUE;
			
			do {
				
				valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				
				if ( (valor != 0) && (valor < menor) )
					menor = valor;				
				
			} while (valor != 0);
			
			if (menor == Double.MAX_VALUE)
				JOptionPane.showMessageDialog(null, "Nenhum valor digitado");
			else
				JOptionPane.showMessageDialog(null, 
						String.format("Menor valor: %.2f", menor));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
