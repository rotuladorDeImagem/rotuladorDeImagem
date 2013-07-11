package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.chart.AreaChart;
import javafx.stage.Stage;
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
public class HistogramaControllerTest {

    // Testar o método Initialize
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        HistogramaController instance = new HistogramaController();
        instance.initialize(url, rb);    
        fail("O caso de teste é um protótipo");
    }

    // Testar o método Start
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        HistogramaController instance = new HistogramaController();
        instance.start(stage);
        fail("O caso de teste é um protótipo");
    }

    // Testar o método CreateChart
    @Test
    public void testCreateChart() {
        System.out.println("createChart");
        HistogramaController instance = new HistogramaController();
        AreaChart expResult = null;
        AreaChart result = instance.createChart();
        assertEquals(expResult, result);
        fail("O caso de teste é um protótipo");
    }
}