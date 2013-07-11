package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class HistogramaRespostaControllerTest {
    
    // Testar o método Initialize
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        HistogramaRespostaController instance = new HistogramaRespostaController();
        instance.initialize(url, rb);
        fail("O caso de teste é um protótipo");
    }
    
    // Testar o método Start
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        HistogramaRespostaController instance = new HistogramaRespostaController();
        instance.start(stage);
        fail("O caso de teste é um protótipo");
    }
}