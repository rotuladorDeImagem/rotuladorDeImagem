/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Jonatan
 */
public class GerenciadorDeImagens extends Application {
   
    public Stage stage;
    public static GerenciadorDeImagens instance;
    
    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeImagens.class.getName());
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY | hh:mm:sss");
    
    public static GerenciadorDeImagens getInstance() {
        if (instance == null)
            return new GerenciadorDeImagens();
        else
            return instance;
    }

    private Parent trocarCena(String fxml) {
        try{
            Parent page = (Parent) FXMLLoader.load(GerenciadorDeImagens.class.getResource(fxml), 
                    null, new JavaFXBuilderFactory());
            Scene scene = stage.getScene();
            if (scene == null) {
                scene = new Scene(page);
                stage.setScene(scene);
            } else {
                stage.getScene().setRoot(page);          
            }
            stage.sizeToScene();
            stage.centerOnScreen();
            return page;
        }catch(Exception e){
            LOGGER.fatal("Exception em Trocar de Cena "+ format.format(new Date()));
            return null;
        }
    }
    public GerenciadorDeImagens() {
        instance = this;
    }

    public void goTo(String arquivo) {
        try {
            trocarCena(arquivo + ".fxml");
        } catch (Exception ex) {
            LOGGER.fatal("Exception em alterar Nome "+ format.format(new Date()));
        }
    }

    
    @Override
    public void start(Stage stage) throws Exception {
        BasicConfigurator.configure();
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        
        Scene scene = new Scene(root);
        this.stage = stage;
        stage.setScene(scene);
        stage.setTitle("Gerenciador de Imagens");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}