package generatebit.java;

import java.io.IOException;

/**
 * @author Elton Santos
 * @version 0.1
 * @since 29/04/2019
 */

class Cadastro {


    void init() throws ProdutoException, IOException {
        System.out.println("CADASTRO DE PRODUTOS");

        while (true) {
            System.out.print("Para cadastrar produtos pressione 1\n");
            System.out.print("Para listar produtos pressione 2\n");
            System.out.print("Para obter um produto pelo nome pressione 3\n");
            System.out.print("Para sair pressione 4\n");

            System.out.print("Digite uma opção: ");

            String entrada = IO.lerString();

            int opcao;

            for (char a : entrada.toCharArray()) {
                if (!Character.isDigit(a)) {
                    throw new ProdutoException("Não é um valor válido");
                }
            }

            opcao = Integer.parseInt(entrada);


            switch (opcao) {
                case 1:
                    Produto pd = cadastroProd();
                    if (Gerenciador.containProduto(pd.getNomeProd())) {
                        throw new ProdutoException("Produto já cadastrado!");
                    } else {
                        try {
                            Gerenciador.inserirProduto(pd);
                        } catch (ProdutoException e) {
                            System.err.format("Erro: %s %n", e.getMessage());
                        }
                    }
                    break;
                case 2:
                    try {
                        System.out.println();
                        Gerenciador.listarProdutos();
                        System.out.println();
                    } catch (ProdutoException e) {
                        System.err.format("Erro: %s", e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Insira o nome do produto: ");
                    try {
                        Produto p = Gerenciador.obterProduto(IO.lerString());
                        if (p == null) {
                            throw new ProdutoException("O produto não existe!");
                        } else
                            System.out.println(p);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Saindo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção incorreta!");


            }
        }


    }

    private Produto cadastroProd() {
        Produto p = new Produto();

        System.out.println("Insira o nome de um produto");
        try {
            p.setNomeProd(IO.lerString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Insira o valor do produto");
        try {
            double valor = IO.lerDouble();
            p.setValorProd(valor);
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (NumberFormatException e) {
            System.err.println("Valor inválido!");
        }

        return p;
    }
}
