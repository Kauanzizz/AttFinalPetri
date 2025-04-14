public class ListaSimples implements IEstruturaSimples {
    private Object[] listaSimples;
    private int tamanho;

    public ListaSimples(int tamanhoLista) {
        listaSimples = new Object[tamanhoLista];
        this.tamanho = 0;
    }

    @Override
    public void inserirElemento(Object elemento) {
        if (estaCheia()) {
            System.out.println("A lista está cheia! Operação cancelada. ");
        }
        listaSimples[tamanho] = elemento;
        tamanho++;

    }

    @Override
    public void inserirElementoIndice(Object elemento, int indice) {
        if (estaCheia()) {
            System.out.println("A lista está cheia! Operação cancelada. ");
        }

        if (indice < 0 || indice > tamanho) {
            System.out.println("Esse índice não está aplicável na lista");
        }

        for (int i = tamanho; i > indice; i++) {
            listaSimples[indice + 1] = elemento;
        }
        listaSimples[indice] = elemento;
        tamanho++;

    }

    @Override
    public void inserirSequencia(Object elementos) {
        if (estaCheia()) {
            System.out.println("A lista está cheia! Operação cancelada. ");
        }
        for (int i = 0; i < listaSimples.length; i++) {
            inserirElemento(listaSimples[i]);
        }

    }

    @Override
    public boolean removerElemento() {
        if (estaVazia()) {
            System.out.println("A lista não possui nenhum elemento! Operação cancelada. ");
            return false;
        }
        listaSimples[tamanho--] = null;
        return true;


    }

    @Override
    public Object removerIndice(int indice) {
        if (estaVazia()) {
            System.out.println("A lista não possui nenhum elemento! Operação cancelada. ");
            return false;
        }
        for (int i = indice; i < tamanho; i++) {
            listaSimples[i] = listaSimples[i + 1];
        }
        tamanho--;
        return listaSimples[tamanho];
    }

    @Override
    public void removerSequencia(Object elementos) {
        if (estaVazia()) {
            System.out.println("A lista não possui nenhum elemento! Operação cancelada. ");
        }
        for (int i = 0; i < listaSimples.length; i++) {
            if (this.listaSimples[i] == listaSimples[i]) {

            }
        }
    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
        if (estaVazia()) {
            System.out.println("A lista não possui nenhum elemento! Operação cancelada. ");
        }
    }

    @Override
    public boolean estaCheia() {
            return tamanho == listaSimples.length;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean buscarElemento(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (listaSimples.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object buscarElementoIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }
        return listaSimples[indice];
    }

    @Override
    public void ordenarCrescente() {
        for (int i = 0; i < tamanho; i++) {
            if (listaSimples[i] != null) {
                try {
                    listaSimples[i] = Integer.parseInt((String) listaSimples[i]);

                } catch (Exception e) {
                    System.out.println("Não foi possível a continuação.");
                }
                return;
            }
        }
        for (int i = 0 ; i < tamanho ; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                Integer PrimeiroValor = (Integer) listaSimples[i];
                Integer SegundoValor = (Integer) listaSimples[j];

                if (PrimeiroValor > SegundoValor) {
                    Object aux = listaSimples[i];
                    listaSimples[i] = listaSimples[j];
                    listaSimples[j] = aux;

                }
            }
        }

    }

    @Override
    public void ordenarDecrescente() {

    }

    @Override
    public int quantidadeElementos() {
        return tamanho;
    }

    @Override
    public void dobrarCapacidade() {
        if (listaSimples.length == tamanho) {
            Object[] NovoObjeto = new Object[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                NovoObjeto[i] = listaSimples[i];
            }
            listaSimples = NovoObjeto;
        }
    }

    @Override
    public void editarElemento(Object elementoAntigo, Object elementoNovo) {

    }

    @Override
    public void limpar() {
        if (estaVazia() || estaCheia()) {
            System.out.println("Não é possível esvaziar a lista! Operação cancelada. ");
        }
        for (int i = 0; i < tamanho; i++) {
           listaSimples[i] = null;
        }
    }

    @Override
    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(listaSimples[i]);
        }
    }

    @Override
    public Object obterPrimeiroElemento() {
        if (estaVazia()) {
            System.out.println("Não é possível obter Elemento! Operação Cancelada. ");
            return null;
        }
        return listaSimples[0];
    }

    @Override
    public Object obterUltimoElemento() {
        if (estaVazia()) {
            System.out.println("Não é possível obter elemento! Operação Cancelada. ");
            return null;
        }
        return listaSimples[tamanho - 1];
    }
}
