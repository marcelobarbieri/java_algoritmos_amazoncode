package estruturaRepita;

import javax.swing.JOptionPane;

public class CadastraAluno {

	public static void main(String[] args) {

		try {
			
			// int cont = 0;
			int matricula = 0;
			
			do {
			
				matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula"));
				if (matricula != 0) {
		            // String nome = JOptionPane.showInputDialog("Nome");
					// String endereco = JOptionPane.showInputDialog("Endereço");
					// String telefone = JOptionPane.showInputDialog("Telefone"); */
					
					// cont++;					
				}
				
			} while (matricula != 0);
			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
