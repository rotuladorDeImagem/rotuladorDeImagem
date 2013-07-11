package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class RelatorioUsuarioControllerTest {
    
    // Testar o método VoltarTEste
    @Test
    public void testVoltarTEste() {
        System.out.println("voltarTEste");
        RelatorioUsuarioController instance = new RelatorioUsuarioController();
        instance.voltarTEste();
        fail("O caso de teste é um protótipo");
    }

    // Testar o método GerarGrafico
    @Test
    public void testGerarGrafico() {
        System.out.println("GerarGrafico");
        RelatorioUsuarioController instance = new RelatorioUsuarioController();
        instance.GerarGrafico();
        fail("O caso de teste é um protótipo");
    }

    // Testar o método Initialize
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        RelatorioUsuarioController instance = new RelatorioUsuarioController();
        instance.initialize(url, rb);
        fail("O caso de teste é um protótipo");
    }
}