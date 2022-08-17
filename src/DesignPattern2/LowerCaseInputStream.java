package DesignPattern2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }
    public int read() throws IOException {
        int symbol = in.read();
        return symbol == -1 ? symbol : Character.toLowerCase((char) symbol);
    }
    public int read(byte b[], int off, int len) throws IOException {
        int result = in.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
