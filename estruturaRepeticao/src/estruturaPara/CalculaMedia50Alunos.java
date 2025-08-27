package estruturaPara;

import javax.swing.JOptionPane;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		
		try {

			double mediaTotal = 0;
			
			for (int i = 1; i < 50; i++) {
				
				double nota1 = Double.parseDouble(
						JOptionPane.showInputDialog(String.format("&d - Nota 1",i)));

				double nota2 = Double.parseDouble(
						JOptionPane.showInputDialog(String.format("&d - Nota 2",i)));

				double nota3 = Double.parseDouble(
						JOptionPane.showInputDialog(String.format("&d - Nota 3",i)));

				double nota4 = Double.parseDouble(
						JOptionPane.showInputDialog(String.format("&d - Nota 4",i)));
				
				double media = (nota1 + nota2 + nota3 + nota4) / 4;
				
				mediaTotal = mediaTotal + media;
				
			}
			
			mediaTotal = mediaTotal / 50;
			
			JOptionPane.showMessageDialog(null, 
					String.format("Média Total: %.2f",mediaTotal));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
