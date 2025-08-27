package envDev.exercises2;

import javax.swing.JOptionPane;

public class Locadora {

	public static void main(String[] args) {
		
		try {
			
			String filme = JOptionPane.showInputDialog("Filme");
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
			int minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos"));
			int duracao = horas * 60 + minutos;
			
			JOptionPane.showMessageDialog(null, 
					String.format("A duração do fime '%s' em minutos é de %d", filme, duracao)
			);
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
