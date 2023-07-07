import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println(System.get);
        // ExtraiPalavra ep = new ExtraiPalavra("C:\\Users\\andre\\Documents\\projetos\\Temporario\\Trabalho3\\Trabalho3\\src\\delimitadores.txt", "C:\\Users\\andre\\Documents\\projetos\\Temporario\\Trabalho3\\Trabalho3\\src\\arquivo1.txt");
        // ExtraiPalavra ep = new ExtraiPalavra("src/delimitadores.txt", "src/arquivo1.txt");

        // String palavra = null;
        // DynamicArrayList<String> list = new DynamicArrayList<>();
        // while((palavra = ep.proximaPalavra()) !=null){
        //     list.add(palavra);
        // }
        // HashTable hash = new HashTable(10);
        // hash.put("arquivo1.txt", list);
        // System.out.println(hash.get("arquivo1.txt"));

        IndiceInvertido i = new IndiceInvertido();
        i.CriaIndiceInvertido();
        imprimeResultados(i.search("quem"));;
        
    }
    public static void imprimeResultados(DynamicArrayList<RetornoModel> resultados){
        StringBuilder sb = new StringBuilder();
        sb.append(resultados.get(0).palavra);
        sb.append(" "); 
        for(int i = 0;i<resultados.size();i++){
            RetornoModel termo = resultados.get(i);
            if(termo.frequencia > 0){
                sb.append(termo.frequencia);
                sb.append(" "); 
                sb.append(termo.documento);
                sb.append("    "); 

            }
            
        }
        System.out.println(sb);
    }
}
