package estruturaPara;

import javax.swing.JOptionPane;

public class NumeroDecrescente {

	public static void main(String[] args) {
		
		try {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			
			for (int i = numero; i > 0; i--) {
				
				JOptionPane.showMessageDialog(null, i);
				
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
