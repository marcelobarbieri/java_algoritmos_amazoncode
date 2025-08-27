package estruturaPara;

import javax.swing.JOptionPane;

public class ProblemaMatematico1v2 {

	public static void main(String[] args) {
		
		int s,s9,s10,s100,s10000;
		
		try {		
			
			s      = 0;
			s9     = 0;
			s10    = 0;
			s100   = 0;
			s10000 = 0;			
			
			for (int i = 1; i <= 10000; i++) {
				
				if (i == 1)
					
					s = 1;
				
				else {
				
					s = s + 3;
					
					switch (i) {
						case     9: s9     = s; break;
						case    10: s10    = s; break;
						case   100: s100   = s; break;
						case 10000: s10000 = s; break;
					}
					
				}
				
			}				
						
			JOptionPane.showMessageDialog(null, 
					String.format("Posição 9 Sequência %d",s9));
			
			JOptionPane.showMessageDialog(null, 
					String.format("Posição 10 Sequência %d",s10));
			
			JOptionPane.showMessageDialog(null, 
					String.format("Posição 100 Sequência %d",s100));
			
			JOptionPane.showMessageDialog(null, 
					String.format("Posição 10000 Sequência %d",s10000));			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}

	}

}
