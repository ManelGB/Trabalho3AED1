import java.util.StringTokenizer;
import java.io.*;

public class ExtraiPalavra {
    private BufferedReader arqAlf, arqTxt;
    private StringTokenizer palavras;
    private String delimitadores;//,palavra,palavraAnt;

    // private boolean eDelimitador(char ch) {
    //     return (this.delimitadores.indexOf(ch) >= 0);
    // }

    public ExtraiPalavra(String nomeArqAlf, String nomeArqTxt) throws Exception {
        this.arqAlf = new BufferedReader(new FileReader(nomeArqAlf));
        this.arqTxt = new BufferedReader(new FileReader(nomeArqTxt));
        
        // Os delimitadores devem estar juntos em uma única linha do arquivo
        this.delimitadores = arqAlf.readLine() + "\r\n";
        this.palavras = null;
        // this.palavra = null;
        // this.palavraAnt = "";
    }

    public String proximaPalavra() throws Exception {
        if(palavras == null || !palavras.hasMoreTokens()){
            String linha = arqTxt.readLine();
            if(linha==null)
                return null;
            this.palavras=new StringTokenizer(linha, this.delimitadores);
            if(!palavras.hasMoreTokens()){
                return "";
            }
        }
        return this.palavras.nextToken();
    }
}
