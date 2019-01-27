package filter;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataTest {

    @Test
    public void testDataInputStream() throws IOException {
        DataInputStream dataInputStream=new DataInputStream(new FileInputStream("pom.xml"));
        while (true){
            System.out.print((char)dataInputStream.readByte());
        }
    }
}
