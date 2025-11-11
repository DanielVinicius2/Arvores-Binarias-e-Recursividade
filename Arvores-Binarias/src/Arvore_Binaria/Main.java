package Arvore_Binaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo valores
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);

        // Testando busca
        System.out.println("Buscar 6: " + arvore.buscar(6));
        System.out.println("Buscar 15: " + arvore.buscar(15));

        // Percursos
        System.out.print("Pré-ordem: ");
        arvore.preOrdem();

        System.out.print("Em ordem: ");
        arvore.emOrdem();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem();
    }
}

