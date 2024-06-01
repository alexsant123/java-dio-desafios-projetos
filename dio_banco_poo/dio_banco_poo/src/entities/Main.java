package entities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      Cliente c=new Cliente();
		c.setNome("alex santos");
		c.setIdade(45);
	   c.setCpf("12345678");	
	   
	   if(c.getCpf().length()==8) {
		   
		   ContaCorrente corrente= new ContaCorrente(c);
		   System.out.println("contacorrente criada com sucesso");
            CartaoDeCredito cartao= new CartaoDeCredito(corrente);		   
		   System.out.println( "saldo: "+corrente.getSaldo());
		   System.out.println("limite: R$"+cartao.getLimite());
		   System.out.println("comprar no credito");
		   
		   System.out.println("qual valor da compra ?");		

		   Double valor=sc.nextDouble();

	        cartao.comprarnocredito(valor);
	        System.out.println("compra realizada com sucesso !");

      		    
	} 
	}
}
                 
	   

	   
	
	
	  
	     
	
