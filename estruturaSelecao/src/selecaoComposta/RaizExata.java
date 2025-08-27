package selecaoComposta;

import javax.swing.JOptionPane;

public class RaizExata {

	public static void main(String[] args) {
		
		try {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			
			double raiz_exata = Math.sqrt(numero);
			double maior_valor = Math.round(raiz_exata);
			
			if (raiz_exata == maior_valor)
				JOptionPane.showMessageDialog(null,
						String.format("Existe raiz exata para o número %d",numero)
				);
			else
				JOptionPane.showMessageDialog(null,
						String.format("Não existe raiz exata para o número %d",numero)
				);			
			
			
		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
