package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

         public class CartaoDeCredito {
         private double limite;
         private ContaCorrente corrente;
	
	public CartaoDeCredito(  ContaCorrente corrente) {
		if(corrente.cliente.getIdade()<=40) {
			this.limite = gerarLimiteAleatorio1(5000, 7000);
		}else {
			this.limite = gerarLimiteAleatorio1(1500,2000);
		}

      
	}

	private double gerarLimiteAleatorio1(double inicioIntervalo,  double fimIntervalo) {

	        Random random = new Random();
	        double limiteAleatorio = inicioIntervalo + (fimIntervalo - inicioIntervalo) * random.nextDouble();
	        
	        BigDecimal valorFormatado = new BigDecimal(limiteAleatorio).setScale(2, RoundingMode.HALF_UP);
	        double valuelimite=valorFormatado.doubleValue();
	        return valuelimite;
	    }

	public double getLimite() {
		return limite;
	}
	
	public  boolean  comprarnocredito(double valor) {
		
		if(valor<=limite) {
			double limiteupdate=limite-valor;
			this.limite=limiteupdate;
			return true;

		}
			System.out.println("credito indisponível !");
		
		return false;
		
		
		
	
		
		
		
		
	}
	
         }