package breakContinue;

import javax.swing.JOptionPane;

public class NumerosPares {

	public static void main(String[] args) {

		try {
			
			int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Número A"));
			int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Número B"));
			
			if ( (numeroA <= 0) || (numeroB <= 0) ) 
				JOptionPane.showMessageDialog(null, "Número menor que zero");
			
			else if (numeroA >= numeroB)
				JOptionPane.showMessageDialog(null, "Número A maior ou igual ao número B");
				
			else {				
				
				for (int i = numeroA; i <= numeroB; i++) {
					
					if (i % 2 != 0)
						continue;
						
					JOptionPane.showMessageDialog(null, 
							String.format("%d é número par",i));					
				}		
				
			}	
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}
		
	}
	
}
