import java.util.Scanner;

public class    MenuSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoLista;
        int escolha;

        System.out.println("Informe o tamanho da lista ");
        tamanhoLista = scanner.nextInt();

        ListaSimples listaSimples = new ListaSimples(tamanhoLista);

        do {
            System.out.println("Agora, escolha um método: ");
            System.out.println("1 - Inserir Elemento");
            System.out.println("2 - Remover Elemento");
            System.out.println("3 - Buscar Elemento");
            System.out.println("4 - Ordenar Elementos");
            System.out.println("5 - Dobrar tamanho da Lista");
            System.out.println("6 - Obter Primeiro Elemento");
            System.out.println("7 - Obter Último Elemento");
            System.out.println("8 - Limpar Lista");
            System.out.println("9 - Exibir Lista");
            System.out.println("0 - Cancelar");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int InserirMetodo;
                    do {

                        System.out.println("Qual das opções você quer utilizar: ");
                        System.out.println("1 - Inserir Elemento normal");
                        System.out.println("2 - Inserir Elemento em um índice específico");
                        System.out.println("3 - Inserir sequência de elementos");
                        System.out.println("0 - Voltar para os métodos");
                        InserirMetodo = scanner.nextInt();

                        switch (InserirMetodo) {

                            case 1:
                                System.out.println("Insira o elemento que você quer implementar: ");
                                Object elemento = scanner.next();
                                listaSimples.inserirElemento(elemento);
                                break;

                            case 2:
                                System.out.println("Insira o elemento que você quer implementar: ");
                                Object elementoIndice = scanner.next();
                                System.out.println("Agora, insira em qual índice você gostaria de inserir o elemento: ");
                                int indice = scanner.nextInt();
                                listaSimples.inserirElementoIndice(elementoIndice, indice);
                                break;

                            case 3:
                                System.out.println("Quantos elementos você gostaria de inserir? ");
                                int QtdElementos = scanner.nextInt();
                                Object[] ElementosNovos = new Object[QtdElementos];
                                for (int i = 0; i < QtdElementos ; i++) {
                                    System.out.println("Insira o Elemento: " + i + 1);
                                    ElementosNovos[i] = scanner.next();
                                }
                                listaSimples.inserirSequencia(ElementosNovos);
                                break;

                            case 0:
                                break;
                        }
                    } while (InserirMetodo != 0);

                case 2:
                    int RemoverMetodo;
                    do {

                        System.out.println("Como deseja remover o(s) Elemento(s): ");
                        System.out.println("1 - Remover Elemento");
                        System.out.println("2 - Remover Elemento específico");
                        System.out.println("3 - Remover Sequência de elementos");
                        System.out.println("4 - Remover ocorrências da lista");
                        System.out.println("0 - Voltar para os métodos");
                        RemoverMetodo = scanner.nextInt();

                        switch (RemoverMetodo) {

                            case 1:
                                listaSimples.removerElemento();
                                System.out.println("O "+ (tamanhoLista - 1) + "o elemento foi removido com sucesso");
                                break;

                            case 2:
                                System.out.println("Qual elemento você gostaria de remover: ");
                                int ElementoIndice = scanner.nextInt();
                                Object ElementoRemovido = listaSimples.removerIndice(ElementoIndice);


                                if (ElementoRemovido != null && ElementoRemovido.equals(0)) {
                                    System.out.println("O elemento " + ElementoIndice + " foi removido");
                                }
                                else {
                                    System.out.println("Esse elemento nao está na lista ou ela está vazia");
                                }
                                break;

                            case 3:
                                System.out.println("Quantos elementos você gostaria de remover: ");
                                int QtdElementos = scanner.nextInt();
                                Object[] sequenciaRemover = new Object[QtdElementos];
                                for (int i = 0; i < QtdElementos ; i++) {
                                    System.out.println("Elemento " + i + 1);
                                    sequenciaRemover[i] = listaSimples.removerIndice(i);
                                }
                                listaSimples.removerSequencia(sequenciaRemover);
                                break;

                            case 4:
                                System.out.println("Qual elemento de todas as ocorrências você gostaria de remover da lista: ");
                                Object RemoverOcorrencia = scanner.next();
                                listaSimples.removerTodasOcorrencias(RemoverOcorrencia);
                                break;

                            case 0:
                                break;

                        }
                    } while (RemoverMetodo != 0);

                case 3:
                    int BuscarMetodo;
                    do {

                        System.out.println("Qual forma de busca você deseja utilizar: ");
                        System.out.println("1 - Buscar Elemento");
                        System.out.println("2 - Buscar Elemento pelo índice");
                        System.out.println("0 - Voltar para os métodos");
                        BuscarMetodo = scanner.nextInt();

                        switch (BuscarMetodo) {

                            case 1:
                                System.out.println("Qual elemento você gostaria de buscar: ");
                                Object ElementoBusca = scanner.next();

                                boolean encontrar = listaSimples.buscarElemento(ElementoBusca);

                                if (encontrar) {
                                    System.out.println("O elemento "+ ElementoBusca + " foi encontrado");
                                } else {
                                    System.out.println("Esse elemento não foi encontrado");
                                }
                                break;

                            case 2:
                                System.out.println("Qual índice você irá inserir: ");
                                int BuscaIndice = scanner.nextInt();

                                Object EncontrarIndice = listaSimples.buscarElementoIndice(BuscaIndice);

                                if (EncontrarIndice != null) {
                                    System.out.println("O índice "+ BuscaIndice+" possui o elemento "+ EncontrarIndice);
                                }  else {
                                    System.out.println("Esse índice não consta na lista");
                                }
                                break;

                            case 0:
                                break;


                        }

                    } while (BuscarMetodo != 0);

                case 4:

                    int OrdenarMetodo;
                    do {
                        System.out.println("Quais das ordenações você deseja utilizar: ");
                        System.out.println("1 - Ordenar Elemento de forma Crescente");
                        System.out.println("2 - Ordenar Elemento de forma Decrescente");
                        System.out.println("0 - Voltar para os métodos");
                        OrdenarMetodo = scanner.nextInt();

                        switch (OrdenarMetodo) {

                            case 1:
                                listaSimples.ordenarCrescente();
                                break;

                            case 2:
                                listaSimples.ordenarDecrescente();
                                break;

                            case 0:
                                break;
                        }

                    } while (OrdenarMetodo != 0);

                case 5:
                    listaSimples.dobrarCapacidade();
                    System.out.println("A Quantidade de índices da Lista foi dobrada! ");
                    break;

                case 6:
                    System.out.println("O primeiro elemento da lista é o " + listaSimples.obterPrimeiroElemento());
                    break;

                case 7:
                    System.out.println("O último elemento da lista é o " + listaSimples.obterUltimoElemento());
                    break;

                case 8:
                    listaSimples.limpar();
                    System.out.println("Lista foi limpa!");
                    break;

                case 9:
                    listaSimples.exibir();
                    break;
            }
        } while (escolha != 0);
    }
}
