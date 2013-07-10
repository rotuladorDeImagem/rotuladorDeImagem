/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

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
    private static final Logger LOGGER = Logger.getLogger(SampleController.class.getName());
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY | hh:mm:ss");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       BasicConfigurator.configure();
       LOGGER.info("Iniciando classe principal " + format.format(new Date()));
          
    }    

    @FXML
    private void gerarGrafico(ActionEvent event) {
        LOGGER.info("Gerar Grafico " + format.format(new Date()));
    }

    @FXML
    private void avancarQuestao(ActionEvent event) {
        LOGGER.info("Metodo para avancar questão " + format.format(new Date()));
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
        try {  
            LOGGER.info("Carregando Histograma " + format.format(new Date()));
            new HistogramaController().start(new Stage());
            
        } catch (Exception e) {  
            LOGGER.fatal("Histograma com problemas " + format.format(new Date()));
        }  
    }

    @FXML
    private void carregarHistRespostas(MouseEvent event) {
        try {  
            LOGGER.info("Carregando Histograma das Alternativas " + format.format(new Date()));
            new HistogramaRespostaController().start(new Stage());
            
        } catch (Exception e) {  
            LOGGER.fatal("Histograma com problemas " + format.format(new Date()));
        }  
    }
    @FXML
    private void buscarDiretorioImagens(ActionEvent event) {
        try{
            
            DirectoryChooser pasta = new DirectoryChooser();
            File x = pasta.showDialog(tela.stage); 
            urlCaminho = (x.getAbsolutePath());
            Image image1 = new Image("file:/"+ urlCaminho +"\\Lattes.jpg", true);
            iViewImagens.setImage(image1);
            LOGGER.info("Diretorio da imagens " + urlCaminho+  " -- "+  format.format(new Date()));
                
        } catch(Exception e){
            LOGGER.fatal("Exception no Diretorio " + format.format(new Date()));
        }
    }

    @FXML
    private void ajuda(ActionEvent event) {
        try {  
            new HelpController().start(new Stage());
                   
        } catch (Exception e) {  
            LOGGER.fatal("Exception na Ajuda " + format.format(new Date()));
        }  
    }

    @FXML
    private void sobre(ActionEvent event) {
        try {  
            new SobreAutoresController().start(new Stage());
                      
        } catch (Exception e) {  
            LOGGER.fatal("Exception no Sobre Autores " + format.format(new Date()));
        }  
    }

    @FXML
    private void clicarLabel(MouseEvent event) {
        try{
            DirectoryChooser pasta = new DirectoryChooser();
            File x = pasta.showDialog(tela.stage); 
            urlCaminho = (x.getAbsolutePath());
            Image image1 = new Image("file:/"+ urlCaminho +"\\Lattes.jpg", true);
            iViewImagens.setImage(image1);
            LOGGER.info("Diretorio da imagens " + urlCaminho+  " -- "+  format.format(new Date()));
            
        } catch(Exception e){
           LOGGER.fatal("Exception no Diretorio " + format.format(new Date()));
        }
        
    }
    @FXML
    private void respostaCerta(){
 
    }
}

    
    
    
    
    