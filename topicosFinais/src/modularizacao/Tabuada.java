package modularizacao;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void calculaTabuada (int numero) {
	
		int resultado = 0;
		
		for (int i = 1; i <= 10; i++) {			
			resultado = numero * i;			
			JOptionPane.showMessageDialog(null, 
					String.format("%d x %d = %d",numero,i,resultado));			
		}		
	}
	
	public static void main(String[] args) {		
		try {			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			calculaTabuada(numero);			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato inválido");
		}	
	}
}
