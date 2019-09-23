package curso;

import java.util.Scanner;

import dao.ConexaoJDBC;
import modelo.business.AlunosBusiness;
import modelo.entidades.Aluno;


public class Application {
	
	
    public static void main(String[] args) {  
    	
    	
    	
    	ConexaoJDBC conexao;
        	    	
    	
    	// <<<<<<<<  Conecta ao banco de Dados >>>>>>>    	
    	conexao = new ConexaoJDBC();
		if (!conexao.conecta()) {
			System.out.println("Não foi possível conectar ao Banco de Dados !");			
			return;
		}		
		System.out.println("Conectado ao Banco de Dados !");
		
		
		
		// <<<<<<<<  Exibe dados do Banco de dados >>>>>>>		
		AlunosBusiness alunosBusiness = new AlunosBusiness(conexao); 
    	
    	System.out.println("");
    	System.out.println("");
    	System.out.println("*********Relatório de Alunos**********");
    	System.out.println(alunosBusiness.relatorioAlunos());
    	
    	    	
    	
    	// <<<<<<<<  Inclui dados no Banco de Dados >>>>>>>
    	
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Tecle Enter para INCLUIR UM NOVO ALUNO....");    	
    	teclado.nextLine();
    	
    	Aluno aluno1 = new Aluno();
        aluno1.setNome("Aluno NOVISSIMO");
        aluno1.setIdade(19);
        aluno1.setCpf("000.001.002.41");
        aluno1.setMatricula("70256");        
        aluno1.setSexo("M");
        alunosBusiness.matricular(aluno1);
        
        
        System.out.println("Tecle Enter para VER A LISTA COM O NOVO ALUNO....");    	
    	teclado.nextLine();
    	
    	System.out.println(alunosBusiness.relatorioAlunos());
    	    	    	
    	   	    	
    	System.out.println("*****Obrigado por usar o SysEscola******");
    	System.out.println("");    	
    	System.out.println("");
    	System.out.println("       *****  **  ***   ***");
    	System.out.println("       **     **  ** * * **");
    	System.out.println("       ****   **  **  *  ** ");
    	System.out.println("       **     **  **     **");
    	System.out.println("       **     **  **     ** ");    
    	
    }
    	
	
}
