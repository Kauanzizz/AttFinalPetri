public class TesteMesa {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(6);

        Object elementos[] = {7, 3, 5, 2, 1, 10};
        listaSimples.inserirSequencia(elementos);
        listaSimples.ordenarCrescente();
    }
}
