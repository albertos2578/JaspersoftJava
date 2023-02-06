/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JasperComandas;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.swing.JRViewer;


public class Informe {

    public static void showCarta() throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();

      

        String report = "Carta_productos.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );

        JRViewer viewer = new JRViewer(jasperPrint);

        JFrame frame = new JFrame("Carta de hoy");
        frame.getContentPane().add(viewer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

        System.out.print("Done!");
    }

    public static void pdfReportCarta() throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();

 

        String report = "Carta_productos.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );
        
        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Carta.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();

         System.out.print("Listo");
    }
    
     public static void showComanda() throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();

      

        String report = "Comandas.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );

        JRViewer viewer = new JRViewer(jasperPrint);

        JFrame frame = new JFrame("Comandas");
        frame.getContentPane().add(viewer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

          System.out.print("Listo");
    }

    public static void pdfReportComanda() throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();

 

        String report = "Comandas.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );
        
        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Comandas.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();

        System.out.print("Listo");
    }
     public static void showPedidosFechaAFecha(Date fecha, Date fecha2) throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();
        hm.put("fecha", fecha);
        hm.put("fecha2", fecha2);
      

        String report = "ComandasDiaADia.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );

        JRViewer viewer = new JRViewer(jasperPrint);

        JFrame frame = new JFrame("ComandasDiaADia");
        frame.getContentPane().add(viewer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

        System.out.print("Listo");
    }

    public static void pdfReportPedidosFechaAFecha(Date fecha, Date fecha2) throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();

    

        hm.put("fecha", fecha);
        hm.put("fecha2", fecha2);

        String report = "ComandasDiaADia.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                hm, 
                JdbcUtil.getConnection()
        );
        
        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("ComandasDiaADia.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();

        System.out.print("Listo");
    }

}
