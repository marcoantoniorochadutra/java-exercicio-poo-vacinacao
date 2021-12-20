package vacinacao;
//A classe Pessoa possui os atributos:

import javax.swing.JOptionPane;

//• String nome
//• int idade
//• Vacina dose1
//• Vacina dose2
//E os métodos
//• cadastra (somente o nome e a idade)
//• toString (listando todas as informações da pessoa)
//• aplicaVacina (pergunta qual a dose, instancia o objeto específico e cadastra a vacina)

public class Pessoa {

	private String nome;
	private int idade;
	private Vacina dose1;
	private Vacina dose2;

	public void cadastra() {

		setNome(JOptionPane.showInputDialog("Informe o nome do paciente"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade de " + nome)));
	}

	public void aplicaVacina() {
		int dose = Integer.parseInt(JOptionPane.showInputDialog("Qual dose foi aplicada?"));
		if (dose == 1) {
			dose1 = new Vacina();			
			dose1.cadastrar();
		}
		if (dose == 2) {
			dose2 = new Vacina();
			dose2.cadastrar();
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", \n dose1=" + dose1 + ", \ndose2=" + dose2 + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Vacina getDose1() {
		return dose1;
	}

	public void setDose1(Vacina dose1) {
		this.dose1 = dose1;
	}

	public Vacina getDose2() {
		return dose2;
	}

	public void setDose2(Vacina dose2) {
		this.dose2 = dose2;
	}

}
