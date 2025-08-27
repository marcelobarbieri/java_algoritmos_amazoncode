package multiplaEscolha;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		
		try {
			
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Condição de Pagamento (1,2,3,4)"));
			
			switch (codigo) {
				case 1:
					JOptionPane.showMessageDialog(null, "À vista em dinheiro ou cheque, recebe 10% de desconto");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "À vista no cartão de crédito, recebe 5% de desconto");
					break;					
				case 3:
					JOptionPane.showMessageDialog(null, "Em 2 vezes sem juros");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Em 3 vezes com juros de 10%");
					break;					
				default:
					JOptionPane.showMessageDialog(null, "Condição de Pagamento inválida");
					break;
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
