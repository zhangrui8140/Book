import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class ResourcePatternResolverTest {
    @Test
    public void testResourcePatternResolver()  throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //只加载一个绝对匹配Resource，且通过ResourceLoader.getResource进行加载
        Resource[] resources=resolver.getResources("classpath:META-INF/license.txt");
        Assert.assertEquals(1, resources.length);
        //只加载一个匹配的Resource，且通过ResourceLoader.getResource进行加载
        resources = resolver.getResources("classpath:META-INF/*.LIST");
        Assert.assertTrue(resources.length == 1);
    }
}
