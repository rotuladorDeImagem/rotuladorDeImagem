/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarTelas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;

import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonatan
 */
public class HistogramaRespostaController implements Initializable {
    
    @FXML
    AreaChart areaChartResposta;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
//    private void init(Stage primaryStage) {
//        Group root = new Group();
//        primaryStage.setScene(new Scene(root));
//        root.getChildren().add(createChart());
//    }
    public void start(Stage stage) throws Exception {
        
//        Parent root = FXMLLoader.load(getClass().getResource("Histograma.fxml"));
//        Scene scene = new Scene(root);
//        this.stage = stage;
//        stage.setScene(scene);
//        stage.setTitle("Histograma");
//        stage.setResizable(false);
//        stage.setY(150);
//        stage.setX(150);
//        //stage.centerOnScreen();
//        init(stage);
//        stage.show();
    }
//    @FXML
//    protected AreaChart<Number, Number> createChart() {
//        
//        NumberAxis xAxis = new NumberAxis();
//        NumberAxis yAxis = new NumberAxis();
//        AreaChart<Number,Number> ac = new AreaChart<Number,Number>(xAxis,yAxis);
//        // setup chart
//        //ac.setTitle("Area Chart Example");
//        xAxis.setLabel("X Axis");
//        yAxis.setLabel("Y Axis");
//        // add starting data
//        for (int s=0;s<3;s++) {
//            XYChart.Series<Number,Number> series = new XYChart.Series<Number,Number>();
//            series.setName("Cores "+s);
//            double x = 0;
//            while (x<95) {
//                series.getData().add(new XYChart.Data<Number,Number>(x, Math.random()*99));
//                x += 5 + (15*Math.random());
//            }
//            series.getData().add(new XYChart.Data<Number,Number>(99d, Math.random()*99));
//            ac.getData().add(series);
//        }
//        return ac;
//    
//    }
}
