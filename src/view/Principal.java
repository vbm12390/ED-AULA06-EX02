package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.vinicius.filaDinamica.String.Fila;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
		TelefoneController TelControoler = new TelefoneController();
		Fila f = new Fila();
		String numeroTelefone = "";
		int opc = 0;
		Boolean validador = true;
		while (validador == true) {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("Indentificador de Chamadas" + "\nSelecione a Opção Desejada\n"
							+ "1-Inserir Numero\n" + "2-Consultar Chamadas Perdidas\n" + "3-Sair "));

			switch (opc) {
			case 1:
				numeroTelefone = JOptionPane.showInputDialog("Digite o numero de telefone: ");
				TelControoler.insereLigacao(f, numeroTelefone);
				break;
			case 2:
				TelefoneController.consultaLigaçcoes(f);
				break;
			case 3:
				validador = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");
				break;
			}
		}

	}

}