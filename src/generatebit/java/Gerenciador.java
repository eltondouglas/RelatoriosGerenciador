package generatebit.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elton Santos
 * @version 0.1
 * @since 29/04/2019
 */
class Gerenciador {

    private static List<Produto> produtosList = new ArrayList<>();


    static void inserirProduto(Produto produto) throws ProdutoException {
        if (produto == null) {
            throw new ProdutoException("Não é possivel inserir um valor vazio");
        }
        System.out.println("Inserindo produto");
        produtosList.add(produto);

    }

    static Produto obterProduto(String nome) {

        for (Produto p : produtosList) {
            if (nome.equals(p.getNomeProd())) {
                return p;
            }
        }
        return null;
    }

    static void listarProdutos() throws ProdutoException {
        if (produtosList.isEmpty()) {
            throw new ProdutoException("Não é possível listar os produtos, a lista está vazia\n");

        }
        for (Produto produto : produtosList) {
            System.out.println("ID -> " + produto.getIdProd() + " Produto -> " + produto.getNomeProd() + " Valor - > " + produto.getValorProd());

        }
    }

    static boolean containProduto(String nome) {
        for (Produto p : produtosList) {
            if (p.getNomeProd().equals(nome)) {
                return true;
            }
        }
        return false;
    }


}
