/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class DiretorioController implements Initializable {
    private GerenciadorDeImagens tela = GerenciadorDeImagens.getInstance();
    @FXML
    Button btnOk;
    @FXML
    TextField text;
    //public Stage stage;
    public String urlDiretorio;
    
    @FXML
    private void btnDiretorio(){
        System.out.println("Botao Ok do diretorio");
        urlDiretorio = text.getText();
        System.out.println("" + urlDiretorio);
        tela.goTo("Sample");
        
    }
    private String caminho(){
        
        return urlDiretorio;
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("Diretorio.fxml"));
//        
//        Scene scene = new Scene(root);
//        this.stage = stage;
//        stage.setScene(scene);
//        stage.setTitle("Gerenciador de Imagens");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.show();
//    }
    

}
