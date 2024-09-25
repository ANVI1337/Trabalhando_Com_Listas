package Aplicativo;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		// Implementação de uma lista.
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Melão");
		frutas.add("Banana");
		frutas.add("Pinha");
		frutas.add("Manga");
		frutas.add("Pinha");

		// Implementando um ArrayList e alguns elementos.
		ArrayList<Integer> contador = new ArrayList<>();
		contador.add(15);
		contador.add(25);
		contador.add(35);
		contador.add(2);
		
		// implementar lista de pessoas 
		ArrayList<String> nomePessoas = new ArrayList<>();
		nomePessoas.add("Maria");
		nomePessoas.add("Bruna");
		nomePessoas.add("Adriana");
		nomePessoas.add("Débora");
		nomePessoas.add("Cátia");
		nomePessoas.add("Eduarda");
		
		// Interação da lista
		for (Integer objeto : contador) {
			System.out.println(objeto);
		}

		if (contador.contains(40)) { // Utilizado para localizar algo na lista.
			System.out.println("o numero 15 existe na lista. ");
		} else {
			System.out.println("o num 40 não existe na lista.");
		}
		System.out.println("-----------OUTROS MÉTODOS------------");
		// Get, papra retornar um elemento na sua respectiva posição.
		System.out.println(frutas.get(2));
		
		// IndexOf, vai retornar a primeira instância localizada na lista.
		int localizacao = frutas.indexOf("Pinha");
		System.out.println(localizacao + ">>" + frutas.get(localizacao));
		// lastIndexOf retorna o ultimo elemento do indice em questão.
		System.out.println(localizacao + ">>>" + frutas.lastIndexOf("Pinha"));
		
		//set, substitui um elemento da lista no index especificado.
		contador.set(2, 100);
		
		for (Integer objeto : contador) {
			System.out.println(objeto);
		}
		
		System.out.println("------------REMOVER ELEMENTOS-----------");
		
		for (Integer objeto : contador) {
			System.out.println(objeto);
		}
		
		// remover o elemento da posição 2 da lista
		contador.remove(1);
		contador.remove(contador.indexOf(15));
		
		System.out.println("=-----------------ELEMENTOS REMOVIDOS------------=");
		// LISTAR ELEMENTOS DA LISTA APÓS A REMOÇÃO
		for (Integer objeto : contador) {
			System.out.println(objeto);
		}
		// LIMPAR A LISTA, DELETA TUDO DA LISTA, MAS A LISTA CONTINUA EXISTINDO CONFORME O METODO .SIZE
		frutas.clear();
		System.out.println("--------------LISTA DOS ELEMTNOS DE FRUTAS---------");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		// verificar se a lista está vazia 
		System.out.println(frutas.isEmpty());
		
		// verificar se a lista contém os elementos
		System.out.println(frutas.contains(""));
	
		// ordenação natural
		nomePessoas.sort(Comparator.naturalOrder());
		System.out.println("Lista ordenada (crescente :) " + nomePessoas);
		
		System.out.println("------------------------------------------------------------");
		
		//ordenação inversa
		nomePessoas.sort(Comparator.reverseOrder());
		System.out.println("Lista ordenada (crescente :) " + nomePessoas);
	}

}
