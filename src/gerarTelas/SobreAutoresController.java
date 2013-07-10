/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class SobreAutoresController implements Initializable {
  
    @FXML
    Label lblJonatan, lblThiago;
    public Stage stage;
    private static final Logger LOGGER = Logger.getLogger(SobreAutoresController.class.getName());
    /**
     * Initializes the controller class.
     */
    @FXML
    private void referenciaJonatan() throws IOException{
        BasicConfigurator.configure();
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/YYYY | hh:mm:sss");
        LOGGER.info("Verificando referencias Jonatan " + format.format(new Date()));
        
        try {
            Runtime.getRuntime().exec("cmd.exe /C start Chrome.exe "
                + "http://buscatextual.cnpq.br/buscatextual/visualizacv.do?id=K4842389A6");
        } catch (Exception e) {
            LOGGER.error("Pagina Invalida");
        }
        
    } 
    
    @FXML 
    private void referenciaThiago() throws IOException{
        BasicConfigurator.configure();
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/YYYY | hh:mm:sss");
        LOGGER.info("Verificando referencias Thiago " + format.format(new Date()));
        
        try {
            Runtime.getRuntime().exec("cmd.exe /C start Chrome.exe "
                + "http://buscatextual.cnpq.br/buscatextual/visualizacv.do?id=K4646324E8"); 
            
        } catch (Exception e) {
            LOGGER.error("Pagina não encontrada " + format.format(new Date())); 
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
   
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SobreAutores.fxml"));
        
        Scene scene = new Scene(root);
        this.stage = stage;
        stage.setScene(scene);
        stage.setTitle("Sobre Autores");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
    
    

}
