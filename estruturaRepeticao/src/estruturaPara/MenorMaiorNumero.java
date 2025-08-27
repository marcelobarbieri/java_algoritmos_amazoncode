package estruturaPara;

import javax.swing.JOptionPane;

public class MenorMaiorNumero {

	public static void main(String[] args) {
		
		int maior = 0;
		int menor = 0;
		
		try {
			
			for (int i = 1; i <= 10; i++) {
				
				int numero = Integer.parseInt(
						JOptionPane.showInputDialog(
								String.format("Número %d", i)));
				if (i == 1) {
					maior = numero;
					menor = numero;
				} else {
				
					if (numero > maior)
						maior = numero;
					
					if (numero < menor)
						menor = numero;					
				}					
				
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Menor: %d, Maior: %d",menor,maior));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato Inválido");
			
		}		

	}

}
