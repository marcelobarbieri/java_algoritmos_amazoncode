package selecaoComposta;

import javax.swing.JOptionPane;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		try {
			
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a'"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b'"));
			int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c'"));
		
			double delta = b * b - 4 * a * c;
			
			if (delta >= 0) {
				
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				
				JOptionPane.showMessageDialog(null,
						String.format("Raiz 1: %.2f, Raiz 2: %.2f",x1,x2)
				);
				
			} else

				JOptionPane.showMessageDialog(null,"Não existem raízes reais");
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
