public class ListaIdentificadores {
    private String identificador;
    private ListaIdentificadores prox;

    public ListaIdentificadores(String identificador) {
        this.identificador = identificador;
        this.prox = null;
    }

    public String getIdentificador() {
        return identificador;
    }

    public ListaIdentificadores getProx() {
        return prox;
    }

    public void setProx(ListaIdentificadores prox) {
        this.prox = prox;
    }
}
