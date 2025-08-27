package vetores;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		String alunos[];
		alunos = new String[5];				

		for (int i = 0; i < alunos.length; i++) {		
			String aluno = JOptionPane.showInputDialog(String.format("Aluno %d", i + 1));
			alunos[i] = aluno;			
		}
		
		for (int i = 0; i < alunos.length; i++) {
			JOptionPane.showMessageDialog(null, 
					String.format("Aluno %d: %s",i + 1,alunos[i]));
		}
	}

}
