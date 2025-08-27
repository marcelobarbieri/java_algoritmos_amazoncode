package vetores;

import javax.swing.JOptionPane;

public class Elementos {

	public static void main(String[] args) {
		
		double elementosA[], elementosB[];
		
		elementosA = new double[10];
		elementosB = new double[10];
		
		try {
			
			for (int i = 0; i < elementosA.length; i++) {
				
				elementosA[i] = Double.parseDouble(JOptionPane.showInputDialog(
						String.format("Elemento %d",i + 1)));

				if (elementosA[i] % 2 == 0)
					elementosB[i] = elementosA[i] * 2.00;
				else
					elementosB[i] = elementosA[i] / 2.00;							
			}
			
			for (int i = 0; i < elementosB.length; i++) {
				JOptionPane.showMessageDialog(null, 
						String.format("Elemento %d: %.2f",i + 1, elementosB[i]));
			}			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
