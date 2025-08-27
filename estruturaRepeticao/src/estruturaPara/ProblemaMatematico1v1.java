package estruturaPara;

import javax.swing.JOptionPane;

public class ProblemaMatematico1v1 {

	public static void main(String[] args) {
		
		try {
			
			int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição"));			
						
			JOptionPane.showMessageDialog(null, 
					String.format("Posição %d Sequência %d",posicao,1 + (3 * (posicao - 1))));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
