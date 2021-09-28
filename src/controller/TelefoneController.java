package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.filaDinamica.String.Fila;

public class TelefoneController {

	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}

	public static void consultaLigaçcoes(Fila f) {
		int tamanho = f.size();
		String removido = "";
		if(tamanho==0) {
			JOptionPane.showMessageDialog(null, "Nenhuma Ligação Perdida");
			return;
		}
		try {
			for(int i = 0;i < tamanho;i++) {
				removido += i+1 +"-Telefone " + f.remove()+ "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Ligacão perdida \n" + removido);
	}
	
	

}