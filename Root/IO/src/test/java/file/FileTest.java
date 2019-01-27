package file;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.regex.Pattern;
import static java.lang.System.*;
public class FileTest {


    @Test
    public void testFileChannel() throws IOException{
        FileChannel fileChannel=new FileInputStream("test.xml").getChannel();


    }


    @Test
    public void testFile(){
        File path=new File(".");
        final String regex="";
        String[] list=path.list();
        String[] list2=path.list(new FilenameFilter() {
            private Pattern  pattern=Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list) {
            out.println(dirItem);
        }
    }

    @Test
    public void testFileResource() {
        File file = new File("pom.xml");
        Resource resource = new FileSystemResource(file);
        if(resource.exists()) {
            dumpStream(resource);
        }
        Assert.assertEquals(false, resource.isOpen());
    }

    @Test
    public void testFileResourceLoader(){
        ResourceLoader resourceLoader=new FileSystemResourceLoader();
        Resource resource=resourceLoader.getResource("pom.xml");
    }

    @Test
    public void testFileReader(){
        //FileReader
    }


    private void dumpStream(Resource resource) {
        InputStream is = null;
        try {
            //1.获取文件资源
            is = resource.getInputStream();
            //2.读取资源
            byte[] descBytes = new byte[is.available()];
            is.read(descBytes);
            System.out.println(new String(descBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                //3.关闭资源
                is.close();
            } catch (IOException e) {
            }
        }
    }
}


class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex){
        pattern=Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
