package selecaoSimples;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		try {
			
			final double notas = 4;
			
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3"));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 4"));
			
			double media = (nota1 + nota2 + nota3 + nota4) / notas;
			
			JOptionPane.showMessageDialog(null,String.format("Média: %.2f",media));
			
			if (media < 5)
				JOptionPane.showMessageDialog(null, "Reprovado");
			
		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");			
			
		}

	}

}
