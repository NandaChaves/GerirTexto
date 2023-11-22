
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (Fernanda Fortes) 
 * @version (número de versão ou data)
 */
public class Teste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
      public static void main(String[] args)
    {
       GerirTexto tx = new GerirTexto(); 
       String frase="adoro batata frita e adoro batata rústica\n";
       tx.contaPalavras(frase);
       tx.contarFrequenciaPalavras(frase);
       tx.ordemAlfabetica(frase);
       tx.imprimePosi(frase);
       tx.contarDupletos(frase);
    }
    
}
