package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {
	
/* ATRIBUTOS */
	private String nome;
	private String descricao;
	private Set<Dev> devsInscritos = new HashSet<>();             //Um conjunto de desenvolvedores inscritos no bootcamp. HashSet: eficiência na adição e busca
	private Set<Conteudo> conteudos = new LinkedHashSet<>();     //Um conjunto de conteúdos do bootcamp, usando LinkedHashSet para manter a ordem de inserção
	
	
	
/* MÉTODOS ESPECIAIS */	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	
//IMPLEMENTADO:
	public void inscreverDev(Dev dev) {
	        devsInscritos.add(dev);
	}

	public void desinscreverDev(Dev dev) {
	        devsInscritos.remove(dev);
	}

	public void adicionarConteudo(Conteudo conteudo) {
	        conteudos.add(conteudo);
    }
	
	 public void listarConteudos() {
	        System.out.println("Conteúdos do Bootcamp:");
	        for (Conteudo conteudo : conteudos) {
	            System.out.println("- " + conteudo);
	        }
    }
//	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, descricao, devsInscritos, nome);
	}
	
	
	
/* FUNÇÃO DESTE MÉTODO É DETERMINAR SE DOIS OBJETOS SÃO CONSIDERADOS IGUAIS */	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos)
				&&Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos)
				&& Objects.equals(nome, other.nome);
	}
	
	
}
