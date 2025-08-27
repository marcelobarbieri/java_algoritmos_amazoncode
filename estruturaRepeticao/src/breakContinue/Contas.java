package breakContinue;

import javax.swing.JOptionPane;

public class Contas {

	public static void main(String[] args) {
		
		try {
			
			String opcao = "";			
			double soma = 0;
			int quantidade = 0; 
			
			do {
				
				opcao = JOptionPane.showInputDialog("(I)ncluir, (S)air");
				
				if (opcao.equalsIgnoreCase("S"))
						break;
				
				// String conta = JOptionPane.showInputDialog("Conta");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				
				soma =+ valor;
				quantidade ++;						
				
			} while (true);
			
			JOptionPane.showMessageDialog(null, 
					String.format("Quantidade: %d, Soma: %.2f",quantidade,soma));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
