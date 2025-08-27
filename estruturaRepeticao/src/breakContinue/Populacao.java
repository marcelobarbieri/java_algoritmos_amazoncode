package breakContinue;

import javax.swing.JOptionPane;

public class Populacao {

	public static void main(String[] args) {

		try {
			
			double habitantesA = 5000000;
			final double natalidadeA = 3;
			
			double habitantesB = 7000000;			
			final double natalidadeB = 2;
						
			int tempo = 0;
			
			while (habitantesA < habitantesB) {
				
				habitantesA = habitantesA * (1 + ( natalidadeA / 100 ));
				habitantesB = habitantesB * (1 + ( natalidadeB / 100 ));				
				
				tempo ++;
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Tempo: %d",tempo));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
