package classes;

import java.util.Locale;
import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.ReprodutorMusical;
import interfaces.Reprodutordemidia;

import java.util.Scanner;

public  class iphone implements ReprodutorMusical,AparelhoTelefonico, Reprodutordemidia {

	@Override
	public void tocar() {
	System.out.println("--♪-----♪--tocando ----♪-----♪");
	}
	@Override
	public void pausar() {
	System.out.println("----pausando---");
	}
	@Override
	public void selecionarMusica(String namesong) {
	Scanner sc= new Scanner(System.in);
		String nomedamusica=sc.next();
		System.out.println("musica escolhida"+nomedamusica);
		
		tocar();		
	
	}
	@Override
	public void ligar(String numero) {
		Scanner sc= new Scanner(System.in); 
		String num=sc.next();
		System.out.println("chamando"+num);
	}
	@Override
	public void atender() {
		System.out.println("atendendo");

	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando o correio de voz");
		
	}
	@Override
	public void addnumero(String num, String nome) {
		System.out.println("contato salvo"+ nome+"--"+num);
				
	}
	@Override
	public void reproduzirvideo(String nomevideo) {
		System.out.println("video escolhido:"+nomevideo);
		play();

	}
	@Override
	public void play() {
           System.out.println("-----reproduzindo o vídeo------");		
	}
	
}
