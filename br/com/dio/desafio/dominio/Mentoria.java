package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/* SUBCLASSE */
public class Mentoria extends Conteudo {

	
/* REPRESENTA DATA DA MENTORIA */	
	LocalDate data;

	
/* CONSTRUTOR PADRÃO */	
	public Mentoria() {
	}
	
	
/* MÉTODOS ESPECIAIS */	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
/* MÉTODO ToString */	
	@Override
	public String toString() {
		return  "Mentoria: \n" +
				"\nTitulo: " + getTitulo() +
				"\nDescricao: " + getDescricao() +
				"\nData: " + data;
	}
}
