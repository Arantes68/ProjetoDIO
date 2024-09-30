package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;

public class Principal {
	
	 public static List<Curso> cursos = new ArrayList<>();
	 public static List<Mentoria> mentorias = new ArrayList<>();
	 public static List<Bootcamp> bootcamps = new ArrayList<>();
	 public static List<Dev> desenvolvedores = new ArrayList<>();


    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "Brazil"));
        
        
    
        while (true) {
            menu(scan);   // chama o método menu
            int opcao = scan.nextInt();
            scan.nextLine();  // Consumir a nova linha
            
            
/* ESTRUTURA DE ESCOLHA PARA GERENCIAR OS MÉTODOS */            
            switch (opcao) {
                case 1:
                    cadastrarCurso(scan);
                    break;
                case 2:
                    cadastrarMentoria(scan);
                    break;
                case 3:
                    cadastrarBootcamp(scan);
                    break;
                case 4:
                    cadastrarDesenvolvedor(scan);
                    break;
                case 5:
                	exibirCursos();
                    exibirMentorias();
                    exibirBootcamps();
                    exibirDesenvolvedores();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    scan.close(); // Fechar o scanner antes de sair
                    return;      // Sair do programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    
    
/* MÉTODO MENU */  
    public static void menu(Scanner scan) {
        Date hoje = new Date();
        
        System.out.println();
        System.out.println();
        System.out.println("//////   ADMINISTRADOR DIGITAL INNOVATION ONE     //////");
        String dataAtual = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println("           Data: " + dataAtual);
        System.out.println();
        System.out.println();
        System.out.println("\n--------------------------------------------------------");
        System.out.println("   Escolha uma opção: ");
        System.out.println();
        System.out.println("  [1] Cadastro de Curso ");
        System.out.println("  [2] Cadastro de Mentoria ");
        System.out.println("  [3] Cadastro de Bootcamp ");
        System.out.println("  [4] Cadastro de Desenvolvedores ");
        System.out.println("  [5] Exibir Cadastrados ");
        System.out.println("  [6] Sair ");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.print("Por gentileza, digite a opção desejada: ");
    }
    
    
/* MÉTODO CADASTRAR CURSO */
    public static void cadastrarCurso(Scanner scan) {
        Curso curso = new Curso();  //Objeto da classe Curso
        
        System.out.println();
        System.out.println();

        System.out.print("\nTítulo do Curso: ");
        curso.setTitulo(scan.nextLine());
        
        System.out.print("\nDescrição do Curso: ");
        curso.setDescricao(scan.nextLine());
        
        System.out.print("\nCarga Horária do Curso: ");
        curso.setCargaHoraria(scan.nextInt());
        scan.nextLine(); // Consumir a nova linha

        System.out.println("\nCurso cadastrado: " + curso);
        perguntarContinuar(scan, "curso");
    }

    
/* MÉTODO CADASTRAR MENTORIA */     
    public static void cadastrarMentoria(Scanner scan) {
        Mentoria ment = new Mentoria();   // Objeto da classe Mentoria
        
        System.out.println();
        System.out.println();

        System.out.print("\nTítulo da Mentoria: ");
        ment.setTitulo(scan.nextLine());
        
        System.out.print("\nDescrição da Mentoria: ");
        ment.setDescricao(scan.nextLine());

        System.out.println("\nMentoria cadastrada: " + ment);
        perguntarContinuar(scan, "mentoria");
    }

    
    
/* MÉTODO CADASTRAR BOOTCAMP */    
    public static void cadastrarBootcamp(Scanner scan) {
        Bootcamp boot = new Bootcamp();  // Objeto da classe Bootcamp
        
        System.out.println();
        System.out.println();

        
        System.out.print("\nTítulo do Bootcamp: ");
        boot.setDescricao(scan.nextLine());
        
        System.out.print("\nDescrição do Bootcamp: ");
        boot.setDescricao(scan.nextLine());

        System.out.println("\nBootcamp cadastrado: " + boot);
        perguntarContinuar(scan, "bootcamp");
    }
    
    
    
/* MÉTODO CADASTRAR DESENVOLVEDOR */
    public static void cadastrarDesenvolvedor(Scanner scan) {
        Dev dev = new Dev();   //Objeto da classe Desenvolvedor
        
        System.out.println();
        System.out.println();

        
        System.out.print("\nNome do Desenvolvedor: ");
        dev.setNome(scan.nextLine());

        System.out.println("\nDesenvolvedor cadastrado: " + dev);
        perguntarContinuar(scan, "desenvolvedor");
    }
    
    
    public static void exibirCursos() {
        System.out.println("\nCursos cadastrados:");
        if(cursos.isEmpty()) {
        	System.out.println("Nenhum curso cadastrado.");
        } else {
        	for (Curso curso : cursos) {
                System.out.println(curso);
        }
    }
}

    public static void exibirMentorias() {
        System.out.println("\nMentorias cadastradas:");
        if(mentorias.isEmpty()) {
        	System.out.println("Nenhuma mentoria cadastrada.");
        } else {
        for (Mentoria mentoria : mentorias) {
            System.out.println(mentoria);
        }
    }
}

    public static void exibirBootcamps() {
    	  System.out.println("\nBootcamps cadastrados:");
          if(mentorias.isEmpty()) {
          	System.out.println("Nenhuma Bootcamp cadastrado.");
          } else {
          for (Bootcamp bootcamp : bootcamps) {
              System.out.println(bootcamp);
          }
      }
  }


    public static void exibirDesenvolvedores() {
    	  System.out.println("\nDesenvolvedores cadastrados:");
          if(mentorias.isEmpty()) {
          	System.out.println("Nenhum(a) Desenvolvedor(a) cadastrados(as).");
          } else {
          for (Dev desenvolvedor : desenvolvedores) {
              System.out.println(desenvolvedor);
          }
      }
  }


/* MÉTODO QUE PERGUNTA SE O USUÁRIO QUER CONTINUAR NA OPERAÇÃO */    
    public static void perguntarContinuar(Scanner scan, String tipo) {
    	
        System.out.println();
        System.out.println();

        System.out.print("Deseja cadastrar outro " + tipo + "? (s/n): ");
        String resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("n")) {
            System.out.println("Voltando ao menu principal...");
       } 
    }
}
    
