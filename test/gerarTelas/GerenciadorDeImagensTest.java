package gerarTelas;

import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class GerenciadorDeImagensTest {
    
    public GerenciadorDeImagensTest() {
    }
    
    // Testar o método GetInstance
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        GerenciadorDeImagens expResult = null;
        GerenciadorDeImagens result = GerenciadorDeImagens.getInstance();
        assertEquals(expResult, result);        
        fail("O caso de teste é um protótipo");
    }

    // Testar o método goTo     
    @Test
    public void testGoTo() {
        System.out.println("goTo");
        String arquivo = "";
        GerenciadorDeImagens instance = new GerenciadorDeImagens();
        instance.goTo(arquivo);        
        fail("O caso de teste é um protótipo");
    }

    //Testar o método Start
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        GerenciadorDeImagens instance = new GerenciadorDeImagens();
        instance.start(stage);       
        fail("O caso de teste é um protótipo");
    }

    //Testar o método Main
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GerenciadorDeImagens.main(args);
        fail("O caso de teste é um protótipo");
    }
   
    public void testTrocarCena() {
        String retorno = null;
        GerenciadorDeImagens instancia = new GerenciadorDeImagens();
        instancia.trocarCena("fxml");
        assertEquals("fxml", retorno);
    }    
}