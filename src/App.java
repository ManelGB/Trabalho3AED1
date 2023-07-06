import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println(System.get);
        // ExtraiPalavra ep = new ExtraiPalavra("C:\\Users\\andre\\Documents\\projetos\\Temporario\\Trabalho3\\Trabalho3\\src\\delimitadores.txt", "C:\\Users\\andre\\Documents\\projetos\\Temporario\\Trabalho3\\Trabalho3\\src\\arquivo1.txt");
        ExtraiPalavra ep = new ExtraiPalavra("src/delimitadores.txt", "src/arquivo1.txt");

        String palavra = null;
        // while((palavra = ep.proximaPalavra()) !=null){
        //     System.out.println(palavra);
        // }
        HashTable hashTable = new HashTable(10);
        hashTable.put("key1", "value1");
        hashTable.put("key2", "value2");
        hashTable.put("key3", "value3");

        System.out.println(hashTable.get("key2")); // Output: value2

        hashTable.remove("key1");

        System.out.println(hashTable.get("key1")); // Output: null
            //     InvertedIndex invertedIndex = new InvertedIndex(10);

    //     // Adicionar documentos ao índice invertido
    //     invertedIndex.addDocument(1, new String[]{"apple", "banana", "orange"});
    //     invertedIndex.addDocument(2, new String[]{"banana", "grape"});
    //     invertedIndex.addDocument(3, new String[]{"apple", "orange"});

    //     // Pesquisar por um termo no índice invertido
    //     Set<Integer> documents = invertedIndex.search("apple");
    //     System.out.println("Documentos que contêm o termo 'apple': " + documents);
        
    }
}
