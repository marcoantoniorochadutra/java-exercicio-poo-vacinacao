package vacinacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {

	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void main(String[] args) {

		String menu = "1 - Cadastrar paciente.\n" + "2 - Aplicar vacina.\n" + "3 - Listar pessoas\n\n" + "0 - Sair";
		String menuRelatorio = "1 - Pessoas não vacinadas\n" + "2 - Pessoas com uma dose.\n"
				+ "3 - Pessoas com duas doses\n" + "4 - Pesquisar por marca\n" + "5 - Voltar";
		int op = 0;
		int op2 = 0;

		do {

			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (op) {
			case 1:
				CadastraPessoa();
				break;

			case 2:
				aplicaVacina();
				break;
			case 3:
				do {
					op2 = Integer.parseInt(JOptionPane.showInputDialog(menuRelatorio));
					if (op2 == 1)
						exibePessoasPorDose(0);
					if (op2 == 2)
						exibePessoasPorDose(1);
					if (op2 == 3)
						exibePessoasPorDose(2);
					if (op2 == 4)
						exibePessoasPorMarca();

				} while (op2 != 5);

				break;

			case 4:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Informa uma opção válida, seu animal");
			}

		} while (op != 0);

	}

	private static void CadastraPessoa() {
		Pessoa p = new Pessoa();
		p.cadastra();
		pessoas.add(p);

	}

	private static void aplicaVacina() {
		String nome = JOptionPane.showInputDialog("Quem será vacinado?");
		for (Pessoa p : pessoas) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				p.aplicaVacina();

			}

		}

	}

	private static void exibePessoasPorDose(int qt) {
		String ret = "";
		for (Pessoa p : pessoas) {
			if (qt == 0) {

				if (p.getDose1() == null && p.getDose2() == null)
					ret += p.getNome() + "\n";

			}
			if (qt == 1) {
				if (p.getDose1() != null && p.getDose2() == null)
					ret += p.getNome() + "\n";

			}
			if (qt == 2) {
				if (p.getDose1() != null && p.getDose2() != null)
					ret += p.getNome() + "\n";

			}

		}
		JOptionPane.showMessageDialog(null, ret);
	}

	private static void exibePessoasPorMarca() {
		String ret = "";
		String BuscaMarca = JOptionPane.showInputDialog("Qual marca foi aplicada no paciente?");
		for (Pessoa p : pessoas) {
			if ((p.getDose1() != null && p.getDose1().getMarca().equalsIgnoreCase(BuscaMarca))
					|| (p.getDose2() != null && p.getDose2().getMarca().equalsIgnoreCase(BuscaMarca))) {

				ret += p.getNome() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}

}
