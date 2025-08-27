package selecaoEncadeada;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		
		try {

			int a = Integer.parseInt(JOptionPane.showInputDialog("A"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("B"));
			int c = Integer.parseInt(JOptionPane.showInputDialog("C"));

			if ( (a < b + c) && (b < a + c) && (c < a + b) ) {
				
				if ( (a == b) && (b == c) )
					JOptionPane.showMessageDialog(null, "Equilátero");
				else {
					if ( (a == b) || (b == c) || (c == a) )
						JOptionPane.showMessageDialog(null, "Isóceles");
					else
						JOptionPane.showMessageDialog(null, "Escaleno");
				}
				
			} else
				JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo");
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}
		
	}

}
