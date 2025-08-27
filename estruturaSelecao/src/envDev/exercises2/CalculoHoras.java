package envDev.exercises2;

import javax.swing.JOptionPane;

public class CalculoHoras {

	public static void main(String[] args) {

		try {
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias de viagem"));
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de viagem"));
			JOptionPane.showMessageDialog(null, 
					String.format("Horas total de viagem: %d", dias * 24 + horas));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido");
		}

	}

}
