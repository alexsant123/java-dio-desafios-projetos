package entities;

import java.util.Scanner;

public class Cliente {
	private String nome;
    private String cpf;
    private int idade;
    
    

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		
		checkcpf(cpf);
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

   public boolean checkcpf(String cpf) {
	       if(cpf.length()==8) {
	    	   
	    	   return true;
	       }else {
	    	   
	    	   System.out.println("cpf invalido");
	    	
	    	   return false;
	    	   
	       }
      }
   
   
	
	
}
