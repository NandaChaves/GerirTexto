 
/**
 * Write a description of class GerirTexto here.
 *
 * @author (Fernanda Fortes)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Arrays;
public class GerirTexto
{
    // instance variables - replace the example below with your own
    Palavra []palavras;
    int posp;
    private int posArrays;
    private int totalPaldif;
    private int [][] dupletos;
    private String alfabeto;
    private static String palavra;
    /**
     * Constructor for objects of class GerirTexto
     */
    public GerirTexto()
    {
        // initialise instance variables
        alfabeto = "abcdefghijklmnopqrstuvwxyz";
    }
     
    public void contarFrequenciaPalavras(String texto)//funciona
    {
       
       String []arrayString = texto.split(" ");       
       System.out.println("\n------Palavras repetidas---------\n");
       int quant;
       for(int i=0;i<arrayString.length;i++)
       {
         quant=1;
         for(int j=i+1;j<arrayString.length;j++)
         {
           if(arrayString[i].equals(arrayString[j])) 
           {
             quant = quant +1;
             arrayString[j] ="0";
           }
           }//fim do if para achar a frequencia de palavras
         if(arrayString[i]!="0")
         {
            System.out.println(arrayString[i]+":" +quant);
         }
       }//fim do for
       //System.out.println("\n------Em ordem alfabetica---------\n"); 
    }
    
    public void ordemAlfabetica(String texto)
    {
     String temp;
     String []arrayString = texto.split(" ");
     
      for(int i=0; i<arrayString.length;i++)
     {
        for(int j=i+1;j<arrayString.length;j++)
        {
         if(arrayString[i].compareTo(arrayString[j])>0)
         {
             temp = arrayString[i];
             arrayString[i] = arrayString[j];
             arrayString[j] = temp;
         }
        }
     }
     System.out.println("----Ordem alfabetica----");
     for(int i=0; i<arrayString.length;i++)
     {
       System.out.println(arrayString[i]);
     }
    }
    
    public void imprimePosi(String texto)//funciona
    {
      String []arrayString = texto.split(" ");
      System.out.println("\n-----Posição das palavras--------\n");
      for(int i=0;i<arrayString.length;i++)
      {
        System.out.println("Posição:"+ i +" "+ arrayString[i]);
      }
    }
    
    public void contaPalavras(String texto)//funciona
    {
     String []arrayString = texto.split(" ");
     System.out.println("O texto " + texto + " tem "  + arrayString.length + " palavras");
    }
    
    public void contarDupletos(String texto)
    {
     //percorrer o texto
     for(int i=0; i<texto.length()-1;i++)
     {
       //criar dupletos
       String c1;
       String c2;
       c1 = texto.substring(i,i+1);
       c2 = texto.substring(i+1,i+2);
       //procura dupletos
       int linha= alfabeto.indexOf(c1) ;
       int col = alfabeto.indexOf(c2);
       dupletos[linha][col] = dupletos[linha][col]+1; 
     }
    }
   
}
