package matrizes;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {

		try {
			
			String alunos[] = new String[5];
			double notas[][] = new double[5][4];			
			boolean aprovacao[] = new boolean[5];
			
			double soma,media;
			int aprovados,reprovados;
			
			for (int i = 0; i < alunos.length; i++) {
				
				alunos[i] = JOptionPane.showInputDialog(String.format("Aluno %d", i + 1));
				
				soma = 0;				
				for (int j = 0; j < notas.length; j++) {
					
					double nota = Double.parseDouble(JOptionPane.showInputDialog(
							String.format("Aluno %d Nota %d",i + 1, j + 1)));
					
					soma =+ nota;
				}
				
				media = soma / 4;
				
				aprovacao[i] = media >= 5 ? true : false;
			}

			aprovados = 0;
			reprovados = 0;			
			for (int i = 0; i < aprovacao.length; i++) {
				if (aprovacao[i])
					aprovados++;
				else
					reprovados++;				
			}
			
			JOptionPane.showMessageDialog(null, 
					String.format("Aprovados: %d, Reprovados: %d",aprovados,reprovados, args));
			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
