package school.cesar.q3;

import java.util.ArrayList;

/*3 - Crie uma classe chamada Contabilidade, essa classe guarda uma coleção de
Objetos do tipo Despesa (que possui um atributo Nome, um atributo valor e um
atributo data de inserção). Ambas as classes vem ser criadas no pacote
school.cesar.q3.
A classe Contabilidade não deve guardar mais de uma despesa com o mesmo
nome, mesmo que tenham valores e datas diferentes. Esta classe deve possuir
métodos que exibem as despesas ordenadas por valor (do maior para o menor e do
maior para o menor), por nome e por data de inserção.
Deve ainda haver um método que retorna a média de todas as despesas, outro que
retorna a soma de todas as despesas, outro que retorna a maior despesa, outro que
retorna a menor despesa, outro que retorna todas as despesas menores que um
valor passado como parâmetro, e outro que retorna uma lista com o nome de todas
as despesas.

Utilize funções lambda para implementar os métodos descritos nos dois parágrafos
anteriores.
No seu método main crie diferentes instâncias da classe Despesa e chame todos os
métodos da classe contabilidade para validá-los. Não é necessário ler informações
do teclado.*/

public class Contabilidade {
	private ArrayList<Despesa> listaDeDespesas = new ArrayList<Despesa>();

	public ArrayList<Despesa> getListaDeDespesas() {
		return listaDeDespesas;
	}

	public void setListaDeDespesas(ArrayList<Despesa> listaDeDespesas) {
		this.listaDeDespesas = listaDeDespesas;
	}
	
	public void addNewDespesa(Despesa novaDespesa) {
		ArrayList<Despesa> aux = new ArrayList<Despesa>();
		aux = listaDeDespesas;
		aux.add(novaDespesa);
		this.setListaDeDespesas(aux);
	}
	
	
}
