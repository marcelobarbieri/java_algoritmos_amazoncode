package selecaoEncadeada;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Saque {

	public static void main(String[] args) {
		
		try {
			
			int notas100, notas50, notas10, resto;
			
			int saque = Integer.parseInt("Saque");
			
			if ( (saque > 0) && (saque % 10 == 0)) {
				
				notas100 = Math.floorDiv(saque, 100);
				resto = saque % 100;
				
				notas50 = Math.floorDiv(saque,50);
				resto = saque % 50;
				
				notas10 = resto / 10;
				
				if (notas10 > 0)
					JOptionPane.showMessageDialog(null,String.format("Notas 10: %d",notas10));
				if (notas50 > 0)
					JOptionPane.showMessageDialog(null,String.format("Notas 50: %d",notas50));
				if (notas100 > 0)
					JOptionPane.showMessageDialog(null,String.format("Notas 100: %d",notas100));				
				
			} else
				JOptionPane.showMessageDialog(null, "Saque inválido");			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
