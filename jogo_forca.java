import java.util.Random;
import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    String palavra,palavra_traco;
	    char letra;
	    Scanner ler = new Scanner(System.in);

		palavra=(PegaPalavra(Sorteio()));
		palavra_traco=PalavraTraco(palavra);
		System.out.println("Que palavra é essa?");
		ImprimeTraco(palavra_traco);
		do{
		 System.out.println("Entre com uma letra:");
		 letra=ler.next().charAt(0);
		 palavra_traco=verificaLetra(palavra,palavra_traco,letra);
		 System.out.println("Palavra atual");
		 ImprimeTraco(palavra_traco);
		}while(!palavra.equals(palavra_traco));
	}
	
	 public static int Sorteio(){
          int i;
          Random random = new Random();
          i = random.nextInt(6);
          return i;
        
    }
	  public static String PegaPalavra(int posicao){
          String bdPalavras[]={"carro","programa","armario","cabana","psicologia","satelite"};
          return(bdPalavras[posicao]);
    }
      public static String verificaLetra(String p,String r,char l){
          String q="";
          for(int i=0;i<p.length();i++){
              if(p.charAt(i)==l && r.charAt(i)=='_'){
                  q=q+p.charAt(i);
              }
              else if(r.charAt(i)!='_'){
                  q=q+r.charAt(i);
              }
              else{
                  q=q+'_';
              }
          }
          return q;
    }
    
      public static String PalavraTraco(String p){
          String r="";
          for(int i=0;i<p.length();i++){
              r=r+'_';
          }
          return r;
    }
     public static void ImprimeTraco(String p){
  
          for(int i=0;i<p.length();i++){
              System.out.print(p.charAt(i)+ " ");
          }
          System.out.println();
   
    }

}
