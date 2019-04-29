package generatebit.java;

import java.io.IOException;

/**
 * @author Elton Santos
 * @version 0.1
 * @since 29/04/2019
 */

public class Main {

    public static void main(String[] args) {
        Cadastro c = new Cadastro();

        while (true) {

            try {
                c.init();
            } catch (ProdutoException e) {
                System.err.format("Erro: %s", e.getMessage() + "\n");
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Deseja executar de novo?");
            System.out.println("Digite 1 para sim ou pressione qualquer tecla para sair");

            int opcao = 0;
            try {
                opcao = IO.lerInt();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.err.println(e.getCause());
            }

            switch (opcao) {
                case 1:
                    continue;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }

    }
}
