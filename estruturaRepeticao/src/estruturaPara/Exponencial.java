package estruturaPara;

import javax.swing.JOptionPane;

public class Exponencial {

	public static void main(String[] args) {
		
		try {

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			int termos = Integer.parseInt(JOptionPane.showInputDialog("Termos"));
			
			double e = 0;
						
			for (int i = 1; i <= termos; i++)					
				e += Math.pow(numero, i) / i;				
			
			JOptionPane.showMessageDialog(null,
					String.format("e ^ %d = %.2e%n",numero,e));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}			

	}

}
