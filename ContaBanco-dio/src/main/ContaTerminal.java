package main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
	    
		 Scanner sc = new Scanner(System.in);
	     Double saldo=10.05;

		 System.out.println("Por favor, digite o número da Conta !");
	     int numero = sc.nextInt();
	     
	     
		 System.out.println(" digite o número da agência!");
	     String agencia = sc.next();
	     
	     sc.nextLine();

		 System.out.println("Por favor, digite o seu nome completo !");
	     String nomeCliente = sc.nextLine(); 	   
	     	     
		 System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$"+saldo+" já está disponível para saque !");

         sc.close();
	}

}
