/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class SampleController implements Initializable {
    private GerenciadorDeImagens tela = GerenciadorDeImagens.getInstance();
    @FXML
    private Button btnGrafico, btnProxima;
    @FXML
    private MenuItem buscarDiretorio, ajuda, sobre;
    @FXML
    private Label lblPergunta,lblBuscarDiretorio;
    @FXML
    private ImageView iViewImagens;
    @FXML
    private RadioButton resposta1, resposta2, resposta3, resposta4;
    
    private String urlCaminho;
    private String imagens;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
          
    }    

    @FXML
    private void gerarGrafico(ActionEvent event) {
   
    }

    @FXML
    private void avancarQuestao(ActionEvent event) {
        System.out.println("Avancar");
       // System.out.println(lblPergunta.getText());
        respostaCerta();
        int i = Integer.parseInt(lblPergunta.getText());
        if(i >= 0 && i <= 9){
            i++;
            lblPergunta.setText("" + i);
            if(i == 10){
                btnProxima.setText("Gerar Relatorio");
            }
        }else if(i == 10){
            tela.goTo("RelatorioUsuario");
    
        }
    
        
    }

    @FXML
    private void CarregarHistograma(MouseEvent event) {
        System.out.println("CarregarHistograma");
        try {  
            new HistogramaController().start(new Stage());
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }

    @FXML
    private void carregarHistRespostas(MouseEvent event) {
        System.out.println("CarregarHistograma");
        try {  
            new HistogramaRespostaController().start(new Stage());
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
    @FXML
    private void buscarDiretorioImagens(ActionEvent event) {
        System.out.println("Diretorio de imagens Menu");
        try{
            DirectoryChooser pasta = new DirectoryChooser();
            File x = pasta.showDialog(tela.stage); 
            urlCaminho = (x.getAbsolutePath());
            
            System.out.println(urlCaminho);
            Image image1 = new Image("file:/"+ urlCaminho +"\\Lattes.jpg", true);
       
            iViewImagens.setImage(image1);
                
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Diretorio invalido");
        }
    }

    @FXML
    private void ajuda(ActionEvent event) {
        System.out.println("Ajuda");
        try {  
            new HelpController().start(new Stage());
                    //SegundoApp().start(new Stage());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }

    @FXML
    private void sobre(ActionEvent event) {
        System.out.println("Sobre os Autores Menu");
        try {  
            new SobreAutoresController().start(new Stage());
                    //SegundoApp().start(new Stage());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }

    @FXML
    private void clicarLabel(MouseEvent event) {
        try{
            DirectoryChooser pasta = new DirectoryChooser();
            File x = pasta.showDialog(tela.stage); 
            urlCaminho = (x.getAbsolutePath());
            
            System.out.println(urlCaminho);
            Image image1 = new Image("file:/"+ urlCaminho +"\\Lattes.jpg", true);
       
            iViewImagens.setImage(image1);
                
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Diretorio invalido");
        }
        
    }
    @FXML
    private void respostaCerta(){
       
       
            System.out.println("resposta1");
        //} 
        
    }
}

    
    
    
    
    