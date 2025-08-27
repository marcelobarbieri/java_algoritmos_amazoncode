package estruturaEnquanto;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		try {
			
			double soma = 0;			
			int cont = 0;	
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			
			while (valor != -1) {				
				
				soma =+ valor;
				cont ++;		
				
				valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));				
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Média: %.2f", soma / cont));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
