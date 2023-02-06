package com.mycompany.JasperComandas;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import net.sf.jasperreports.engine.JRException;

public class PrimaryController {

    private TextField tipo;
    @FXML
    private Button CartaHoy;
    @FXML
    private Button todosPedidos;
    @FXML
    private Button pedidosHoy;

 

    @FXML
    private void CartaHoy(ActionEvent event) {
           try {
            Informe.showCarta();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Informe.pdfReportCarta();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void InformeTodosPedidos(ActionEvent event) {
     try {
            Informe.showComanda();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Informe.pdfReportComanda();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  

    @FXML
    private void InformePedidosDefechaAFecha(ActionEvent event) {
         try {
            App.setRoot("Secondary");
        } catch (IOException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
