/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class RelatorioUsuarioController implements Initializable {
    private GerenciadorDeImagens tela = GerenciadorDeImagens.getInstance();
    
    @FXML
    Button btnVoltarTEste;
    @FXML
    PieChart pieGrafico;

    private static final Logger LOGGER = Logger.getLogger(RelatorioUsuarioController.class.getName());
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY | hh:mm:ss");

    @FXML
    public void voltarTEste(){
        LOGGER.info("Usuario refazendo teste" + format.format(new Date()));  
        tela.goTo("Sample");
    }
    
    @FXML
    public void GerarGrafico(){
        LOGGER.info("Metodo gerar grafico " + format.format(new Date()));  
        
        ObservableList<PieChart.Data> pieChartData = null;
        pieGrafico.setTitle("");
        pieGrafico.setData(pieChartData);
        pieChartData = FXCollections.observableArrayList(
            new PieChart.Data("Certas de Primeira Tentativa", 75),
            new PieChart.Data("Certas de Segunda Tentatica", 33.5),
            new PieChart.Data("Erros", 22)
        );
        pieGrafico.setTitle("Relatorio de Pontuação");
        pieGrafico.setData(pieChartData);
    
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BasicConfigurator.configure();
        LOGGER.info("Iniciando classe principal " + format.format(new Date()));  
        GerarGrafico();
     
    }
}
