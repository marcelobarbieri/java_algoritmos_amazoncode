package estruturaRepita;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {

		try {
			
			double soma = 0;
			double valor = 0;
			int cont = 0;
			
			do {								
				valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				
				if (valor != -1) {
					soma =+ valor;
					cont ++;					
				}			
				
			} while (valor != -1);			
			
			if (cont == 0)
				JOptionPane.showMessageDialog(null, "Nenhum valor informado");
			else
				JOptionPane.showMessageDialog(null, 
						String.format("Média: %.2f", soma / cont));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}
		

	}

}
