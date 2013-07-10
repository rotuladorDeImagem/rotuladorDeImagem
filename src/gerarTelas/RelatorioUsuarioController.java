/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;

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

    
    
    @FXML
    public void voltarTEste(){
        tela.goTo("Sample");
    }
    
    @FXML
    public void GerarGrafico(){
        
        System.out.println("gerarGrafico");
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
        GerarGrafico();
    }    
}
