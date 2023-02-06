package com.mycompany.JasperComandas;

import java.io.IOException;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import net.sf.jasperreports.engine.JRException;

public class SecondaryController {

    @FXML
    private DatePicker Desde;
    @FXML
    private DatePicker Hasta;
    @FXML
    private Button InformeFecha;

    private void switchToPrimary() throws IOException {
       
    }

    @FXML
    private void Desde(ActionEvent event) {
        
    }

    @FXML
    private void Hasta(ActionEvent event) {
    }

    @FXML
    private void FechaAFechaInforme(ActionEvent event) {
     
            Desde.getValue();
      
         Date deesde = Date.from(Desde.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
      
           Date Hastaa = Date.from(Hasta.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
  
        
    
         try {
            Informe.showPedidosFechaAFecha(deesde, Hastaa);
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Informe.showPedidosFechaAFecha(deesde, Hastaa);
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}