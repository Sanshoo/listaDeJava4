package school.cesar.q3;

public class Despesa {
	private String nome;
	private int valor;
	private int dataDeInsercao; //ddmmAAAA
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getDataDeInsercao() {
		return dataDeInsercao;
	}
	public void setDataDeInsercao(int dataDeInsercao) {
		this.dataDeInsercao = dataDeInsercao;
	}

}
