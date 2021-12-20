package vacinacao;

import javax.swing.JOptionPane;

public class Vacina {

	private String marca;
	private String lote;
	private String validade;
	private String dataAplicacao;

	public void cadastrar() {

		setDataAplicacao(JOptionPane.showInputDialog("Informe a data de aplicação da vacina."));
		setMarca(JOptionPane.showInputDialog("Informe a marca da vacina."));
		setLote(JOptionPane.showInputDialog("Informe o lote da vacina."));
		setValidade(JOptionPane.showInputDialog("Informe a validade da vacina."));

	}

	public String toString() {

		return marca + " - " + "LT : " + lote + " | " + "VAL: " + validade + " | " + "Data de aplicação: "
				+ dataAplicacao + " | ";
	}

	public String getMarca() {
		return marca.toUpperCase();
	}

	public void setMarca(String marca) {
		if (marca.length() < 2) {
			setMarca(JOptionPane.showInputDialog("Informe a marca novamente."));
		} else {

			this.marca = marca;

		}
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

}
