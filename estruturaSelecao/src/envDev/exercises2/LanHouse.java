package envDev.exercises2;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {
		
		try {
			
			final int minutos_bloco = 15;
			final double valor_bloco = 2.00;
			
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
			int minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos"));
			
			int total_minutos = horas * 60 + minutos;
			
			double blocos = Math.ceil((double)total_minutos/minutos_bloco);
			
			double total_pagar = blocos * valor_bloco;
			
			Locale localeBR = Locale.of("pt", "BR");
			NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(localeBR);				
			
			JOptionPane.showMessageDialog(null, 
					String.format("Blocos: %.0f, Total a pagar: %s",
							blocos,
							formatoMoeda.format(total_pagar))
			);
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
