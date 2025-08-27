package oo;

import javax.swing.JOptionPane;

public class Imposto {

	public static void main(String[] args) {

		try {
			
			int contribuintes = 1;
			
			while (contribuintes <= 10) {
				
				String nome = JOptionPane.showInputDialog("Nome");
				String cpf  = JOptionPane.showInputDialog("CPF");
				int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Dependentes"));
				double renda = Double.parseDouble(JOptionPane.showInputDialog("Renda Mensal"));
						
				double base = (renda * (1 - 0.11)) - (dependentes * 189.59); 
				
				double aliquota = 0;
				double deducao = 0;
				double imposto = 0;				
				
				if (base <= 1903.98) {
					aliquota = 0;
					deducao = 0;
				} else if (base <= 2826.65) {
					aliquota = 7.5;
					deducao = 142.80; 
				} else if (base <= 3751.05) {
					aliquota = 15;
					deducao = 354.80; 
				} else if (base <= 4664.68) {
					aliquota = 22.5;
					deducao = 636.13;										
				} else {
					aliquota = 27.5;
					deducao = 869.36;
				}
				
				imposto = (base * (aliquota / 100)) - deducao;
				
				JOptionPane.showMessageDialog(null, 
						String.format(
								"Nome: %s\nCPF: %s\nDependentes: %d\nRenda: %.2f\nBase: %.2f\nAlíquota: %.1f\nDedução: %.2f\nImposto: %.2f",
								nome,cpf,dependentes,renda,base,aliquota,deducao,imposto));
					
				contribuintes++;
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Formato inválido");
			
		}		

	}

}
