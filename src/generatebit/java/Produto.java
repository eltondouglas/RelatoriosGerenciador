package generatebit.java;

/**
 * @author Elton Santos
 * @version 0.1
 * @since 29/04/2019
 */
public class Produto {

    private static int instancias;
    private String nomeProd;
    private double valorProd;
    private int idProd;

    Produto() {
        idProd = ++instancias;
    }

    String getNomeProd() {
        return nomeProd;
    }

    void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    double getValorProd() {
        return valorProd;
    }

    void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    int getIdProd() {
        return idProd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProd='" + nomeProd + '\'' +
                ", valorProd=" + valorProd +
                ", idProd=" + idProd +
                '}';
    }
}
