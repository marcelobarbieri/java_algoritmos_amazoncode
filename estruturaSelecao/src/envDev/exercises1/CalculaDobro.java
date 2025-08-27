package envDev.exercises1;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		
		 double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe o número"));
		 JOptionPane.showMessageDialog(null, "O dobro do numero é " + (numero * 2));

	}

}
