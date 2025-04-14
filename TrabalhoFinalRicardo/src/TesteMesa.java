public class TesteMesa {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);

        Object elementos[] = {7, 3, 5, 2, 1};
        listaSimples.inserirSequencia(elementos);
        listaSimples.ordenarCrescente();
    }
}
