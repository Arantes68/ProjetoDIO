package br.com.dio.desafio.dominio;

/* SUBCLASSE */
public class Curso extends Conteudo{

/* ATRIBUTOS */	
	private int cargaHoraria;
	
	
	
/* CONSTRUTOR PADRÃO */	
	public Curso() {
	}
	
	
	
/* MÉTODOS ESPECIAIS */		
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria <= 0) {
			throw new IllegalArgumentException("A carga horária deve ser um número positivo.");
		}
		this.cargaHoraria = cargaHoraria;
	}
	
	
/* MÉTODO ToString */		
	@Override
	public String toString() {
		return  "Curso: \n" +
				"\nTitulo: " + getTitulo() + 
				"\nDescricao: " + getDescricao() +
				"\nCargaHoraria: " + cargaHoraria;
	}
}

