package estruturaEnquanto;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		try {

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			int cont = numero;
			int fatorial = 1;
			
			while (cont > 0) {
				
				fatorial *= cont;
				
				cont--;			
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Fatorial de %d = %d", numero, fatorial));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
