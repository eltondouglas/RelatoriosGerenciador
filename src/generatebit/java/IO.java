package generatebit.java;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Elton Santos
 * @version 0.1
 * @since 29/04/2019
 */
class IO {

    static int lerInt() throws IOException {
        return Integer.parseInt(lerString());
    }

    static String lerString() throws IOException {
        DataInput di = new DataInputStream(System.in);
        return di.readLine();
    }

    static double lerDouble() throws IOException {
        return Double.parseDouble(lerString());
    }
}