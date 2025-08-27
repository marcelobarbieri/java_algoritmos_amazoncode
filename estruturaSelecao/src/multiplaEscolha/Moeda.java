package multiplaEscolha;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		
		try {
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			int moeda = Integer.parseInt(JOptionPane.showInputDialog("Moeda (1,2,3)"));
			
			switch (moeda) {
				case 1:
					JOptionPane.showMessageDialog(null, 
							String.format("Valor em Libras: %.2f", valor / 5));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, 
							String.format("Valor em Dólar: %.2f", valor / 4));				
					break;
				case 3:
					JOptionPane.showMessageDialog(null, 
							String.format("Valor em Euro: %.2f", valor / 4.4));				
					break;
	
				default:
					JOptionPane.showMessageDialog(null,"Moeda inválida"); 
					break;
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato inválido");
		}

	}

}
