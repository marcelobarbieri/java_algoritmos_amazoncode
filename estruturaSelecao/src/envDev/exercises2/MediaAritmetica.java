package envDev.exercises2;

import javax.swing.JOptionPane;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		try {
			
			final int qt_notas = 4;
			
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
			
			double media = (nota1 + nota2 + nota3 + nota4) / qt_notas;
			
			JOptionPane.showMessageDialog(null, 
					String.format("Média aritmética: %.2f", media));
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
