package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.terceiro;

public class CadastrosFuncionarios {

		public static void main(String[] args) {
			
			int n; 
			int i;
			char ch;
			double hora;
			double valor;
			double valorextra;
			String nome;
			
      Scanner leia = new Scanner(System.in);
			
		
     List <Funcionario> list = new ArrayList<>(); // interface metodo arraylist um abaixo do outro 
     
     System.out.println("Digite o número de Funcionários: ");
     n= leia.nextInt();
     
     
     for (i=0; i<=n ; i++) {
    	 
    	 System.out.println("Nome do funcionário: "+i+":");
    	 System.out.println("Terceiro [S/N]: ");
    	 ch=leia.next().charAt(0);
    	 System.out.println("Nome:");
    	 nome=leia.next();
    	 System.out.println("Horas trabalhadas : ");
    	 hora = leia.nextInt();
    	 System.out.println("Valor da hora trabalhada: ");
    	 valor= leia.nextDouble();
    	 
    	 if (ch =='S') {
    		 
    		 
    		 System.out.println("Digite o valor da hora extra");
    		 valorextra=leia.nextDouble();
    		 //tericeiro exemplo1= new terceiro(nome,horas,valorhors,valorextra)
    		 list.add(new terceiro(nome,hora,valor,valorextra));
    	 }
    	 
    	 else {
    		 
    		 
    	 }
    	 
    	 
    	 
    	 
     }
     
     
	}

}
