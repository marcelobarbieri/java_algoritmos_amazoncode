package envDev.exercises2;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class RevendaVeiculos {

	public static void main(String[] args) {
		
		try {
			
			final double entrada = 0.5;
			final int parcelas = 12;
			
			String modelo = JOptionPane.showInputDialog("Modelo");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));

			double valorEntrada = preco * entrada;
			double valorParcelas = (preco - valorEntrada) / parcelas;			
			
			Locale localeBR = Locale.of("pt", "BR");
			NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(localeBR);
			//NumberFormat formatoNumero = NumberFormat.getNumberInstance(localeBR);			
			
			JOptionPane.showMessageDialog(null, 
					String.format("O valor do carro de modelo '%s' com %.0f%% de entrada é de %s com o saldo restante em %d parcelas de %s",
							modelo,
							entrada * 100,
							formatoMoeda.format(valorEntrada),
							parcelas,
						    formatoMoeda.format(valorParcelas)
			);									
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
