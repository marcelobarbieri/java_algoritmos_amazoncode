package envDev.exercises1;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {

		double valor = 3.50;
		
		String fruta = JOptionPane.showInputDialog("Digite a fruta");
		JOptionPane.showMessageDialog(null, "O valor da fruta " + fruta + " é " + valor);
		
	}

}
