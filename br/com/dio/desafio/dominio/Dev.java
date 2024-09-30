package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();   //Um conjunto de conteúdos nos quais o desenvolvedor está inscrito, usando LinkedHashSet para manter a ordem
	

/* MÉTODO INSCREVER NO BOOTCAMP */	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	
         
//IMPLEMENTADOS: 
	
/* MÉTODO PARA DESINSCRIBIR DE CONTEÚDOS */
    public void desinscreverConteudo(Conteudo conteudo) {
        conteudoInscritos.remove(conteudo);
    }
    
	
/* MÉTODO PARA LISTAR CONTEÚDOS INSCRITOS */
    public void listarConteudosInscritos() {
        System.out.println("Conteúdos inscritos de " + nome + ":");
        for (Conteudo conteudo : conteudoInscritos) {
            System.out.println("- " + conteudo);
        }
}
	
	
	
	
/* MÉTODOS ESPECIAIS */	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}


	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
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
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscritos, other.conteudoInscritos) 
			&& Objects.equals(nome, other.nome);
	}
	
	
/* COLLECTIONS 'hashCode': AJUDA A OTIMIZAR A BUSCA E A INSERÇÃO EM COLEÇÕE. */	
	 @Override
	    public int hashCode() {
	        return Objects.hash(conteudoInscritos, nome);
	    }



	@Override
	public String toString() {
		return "Dev "
				+ "\nNome: " + getNome()+
				"\nConteudoInscritos: " + getConteudoInscritos();
	}	
}
