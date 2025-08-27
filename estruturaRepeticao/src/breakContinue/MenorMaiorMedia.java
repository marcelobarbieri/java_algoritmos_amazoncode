package breakContinue;

import javax.swing.JOptionPane;

public class MenorMaiorMedia {

	public static void main(String[] args) {

		double maior = 0;
		double menor = 0;
		double media = 0;
		
		try {
			
			for (int i = 1; i <= 10; i++) {
				
				double numero = Double.parseDouble(JOptionPane.showInputDialog("Número"));

				if (i == 1) {
					maior = numero;
					menor = numero;
					
					continue;
				} 
				
				if (numero > maior)
					maior = numero;
				
				if (numero < menor)
					menor = numero;						
				
				media = media + numero;				
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Menor: %.2f, Maior: %.2f, Média: %.2f",menor,maior,media));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato Inválido");
			
		}			

	}

}
