package filter;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest {

    @Test
    public void testBufferedReader(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("pom.xml"));
            StringBuilder sb=new StringBuilder();
            String s;
            while ((s=bufferedReader.readLine())!=null){
                sb.append(s+"\n");
            }
            bufferedReader.close();
        }
        catch (IOException e){

        }
    }
}
