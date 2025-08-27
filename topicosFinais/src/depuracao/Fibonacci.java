package depuracao;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {

		try {
			
			int s0 = 0;
			int s1 = 0;
			int s2 = 0;
						
			int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição"));			
						
			for (int i = 1; i <= posicao; i++) {
					
				s0 = i == 1 ? 1 : s1 + s2;
								
				s2 = s1;
				s1 = s0;			
			}

			JOptionPane.showMessageDialog(null,
					String.format("Posição: %d, Sequência: %d",posicao,s0));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}			

	}

}
