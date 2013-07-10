/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class HelpController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public Stage stage;
    private static final Logger LOGGER = Logger.getLogger(HelpController.class.getName());
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY | hh:mm:sss");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BasicConfigurator.configure();    
        LOGGER.info("Iniciando Help " + format.format(new Date()));
        
    }    
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Help.fxml"));
        
        Scene scene = new Scene(root);
        this.stage = stage;
        stage.setScene(scene);
        stage.setTitle("Help");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
}
