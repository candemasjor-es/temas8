/**
*
* @autor: Camilo Mascarell Jorques
* Ejercicio 2 Tema 8 – Interfaces
* ….
*/

package Ejercicio2;

public class Revista extends Publicacion {
	int numero;
	
	public Revista() {
		
	}
	
	public Revista(int codigo, int ano, int numero, boolean prestado) {
		this.codigo = codigo;
		this.ano = ano;
		this.numero = numero;
		this.prestado = prestado;
	}

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override public String toString() {
		String todo = super.toString();
		todo = todo + " Numero: "+numero;
		return todo;
	}

}
