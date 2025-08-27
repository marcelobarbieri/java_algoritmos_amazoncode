package estruturaRepita;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {

		try {

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));			

			int cont = 1;
			int fatorial = 1;			
			
			do {
				fatorial *= cont;				
				cont ++;
			} while (cont <= numero);
			
			JOptionPane.showMessageDialog(null, 
					String.format("Fatorial de %d = %d", numero, fatorial));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
