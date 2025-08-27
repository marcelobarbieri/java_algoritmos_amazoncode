package estruturaPara;

import javax.swing.JOptionPane;

public class MostraTabuada {

	public static void main(String[] args) {
		
		try {
			
			int total;
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			
			for (int i = 1; i <= 10; i++) {
				total = numero * i;
				JOptionPane.showMessageDialog(null, 
						String.format("%d x %d = %d",numero,i,total)
				);				
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}			

	}

}
