package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class SampleControllerTest {
    
    // Testar o método Initialize
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        SampleController instance = new SampleController();
        instance.initialize(url, rb);
        fail("O caso de teste é um protótipo");
    }
}