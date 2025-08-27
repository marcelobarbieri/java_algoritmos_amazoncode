package estruturaEnquanto;

import javax.swing.JOptionPane;

public class CadastraAluno {

	public static void main(String[] args) {
		
		try {
			
			// int cont = 0;
			
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula"));
			
			while (matricula != 0) {
					
	            // String nome = JOptionPane.showInputDialog("Nome");
				// String endereco = JOptionPane.showInputDialog("Endereço");
				// String telefone = JOptionPane.showInputDialog("Telefone"); */
				
				// cont++;
				
				matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula"));
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
