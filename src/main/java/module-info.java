module com.mycompany.JasperComandas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires java.sql;
    requires jasperreports;

    
    opens com.mycompany.JasperComandas to javafx.fxml, javafx.swing, java.sql;
    exports com.mycompany.JasperComandas;
}
