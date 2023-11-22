
/**
 * Write a description of class Palavra here.
 *
 * @author (Fernanda Fortes)
 * @version (a version number or a date)
 */
public class Palavra
{
    // instance variables - replace the example below with your own
   
    private int ocorrencia;
    private int [] posicoes;
    private int pos;//posição de inserção do array
    private String palavra;
    
    //a funcão é eliminar palavras repetidas
    /**
     * Constructor for objects of class Palavra
     */
    public Palavra(String pal)
    {
        // initialise instance variables
     palavra = pal;
     ocorrencia=0;
     posicoes = new int[100];
    }

    public int getOcorreEPosicoes()
    {
      return ocorrencia;
    }
    
    public String getPalavra()
    {
      return palavra;
    }
    
    public void atualizaOcorrencia()
    {
      //atualizar num de ocoreencias e posicoes de ocorrencia da palavra
      
    }
}
