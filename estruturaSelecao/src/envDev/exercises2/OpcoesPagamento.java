package envDev.exercises2;

import javax.swing.JOptionPane;

public class OpcoesPagamento {

	public static void main(String[] args) {
		
		try {
			
			final double desconto = 0.1;
			final int parcelas = 3;
			
			double produto = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto"));
			
			JOptionPane.showMessageDialog(null, 
					String.format("À vista: %.2f, ou %d parcelas de %.2f", 
							produto * (1 - desconto), 
							parcelas, 
							produto / parcelas)
			);
			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
