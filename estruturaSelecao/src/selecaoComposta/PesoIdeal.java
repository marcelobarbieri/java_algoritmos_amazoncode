package selecaoComposta;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		 
		try {
			
			double peso_ideal;
			
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
			String sexo = JOptionPane.showInputDialog("Sexo (F/M)");
			
			if (sexo.equalsIgnoreCase("F")) {
			
				peso_ideal = (62.1 * altura) - 44.7;
				
				JOptionPane.showMessageDialog(null, 
						String.format("Peso ideal: %.2f", peso_ideal)
				);
				
			} else {
				
				peso_ideal = (72.7 * altura) - 58;
				
				JOptionPane.showMessageDialog(null, 
						String.format("Peso ideal: %.2f", peso_ideal)
				);				
				
			}			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
