public class IndiceInvertido {
    public static String delimitador = "src/delimitadores.txt";
    public static String[] arquivos ={"src/arquivo1.txt","src/arquivo2.txt","src/arquivo3.txt","src/arquivo4.txt"};
    public static HashTable hash = new HashTable(arquivos.length);
    public IndiceInvertido(){
        CriaIndiceInvertido();
    }
    public void CriaIndiceInvertido(){
        for (String arquivo : arquivos) {
            try {
                ExtraiPalavra ep = new ExtraiPalavra("src/delimitadores.txt", arquivo);
                String palavra = null;
                DynamicArrayList<String> list = new DynamicArrayList<>();
                while((palavra = ep.proximaPalavra()) !=null){
                    list.add(palavra.toLowerCase());
                }
                hash.put(arquivo,list);
            } catch (Exception e) {

            }

            
        }
    }
    public DynamicArrayList<RetornoModel> search(String termo){
        DynamicArrayList<RetornoModel> retorno = new DynamicArrayList<>();
        for (String arquivo : arquivos) {
            DynamicArrayList<String> list = new DynamicArrayList<>();
            list = (DynamicArrayList<String>) hash.get(arquivo);
            int ocorrencias = list.countOccurrences(termo);
            retorno.add(new RetornoModel(termo,ocorrencias,arquivo));
            // System.out.println(list.get(1));
        }
        return retorno;
    }

}
