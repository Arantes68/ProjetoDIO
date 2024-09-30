package br.com.dio.desafio.dominio;

/* SUPER CLASSE */
public abstract class Conteudo {
	
/* ATRIBUTOS */	
	private String titulo;
	private String descricao;

	
/* MÉTODOS ESPECIAIS */	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("O título não pode ser nulo ou vazio");
		}
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("A descrição não pode ser nula ou vazia");
		}
		this.descricao = descricao;
	}

}
