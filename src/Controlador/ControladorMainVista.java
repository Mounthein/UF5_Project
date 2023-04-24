/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Cpu;
import Model.Magatzem;
import Vista.Vista;
import Vista.addDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author marc
 */
public class ControladorMainVista {

    private Magatzem mag = new Magatzem("Pepet", "miguelo");
    private Vista finestra;

    public ControladorMainVista() {
        testMag();
        this.finestra = new Vista(this);
        this.finestra.getjTable1().setModel(getCpuDataTable());
        this.finestra.getjTable1().setEnabled(false);
        this.setComboBoxIndex();
        this.finestra.setVisible(true);
    }
    
    // ---------------------------------------------------------- //
    // Entrada de dades de prova
    // ---------------------------------------------------------- //
    private void testMag(){
        Cpu c = new Cpu(1, "Intel Core i9-11900K", "Rocket Lake", "March 2021", "Intel", 8, 539.00);
        Cpu c1 = new Cpu(2, "AMD Ryzen 9 5950X", "Zen 3", "November 2020", "AMD", 16, 799.00);

        this.mag.addProduct(c);
        this.mag.addProduct(c1);
        ArrayList<String> a = new ArrayList<>();
        a.add("opt1");
        a.add("opt2");
        c.setOptionals(a);
    }
    // ---------------------------------------------------------- //
    // set index of combo box
    // ---------------------------------------------------------- //
    private void setComboBoxIndex(){
        ArrayList<String> cpusArc = new ArrayList<>();
        for (String arc : cpusArc) {
            this.finestra.getFiltreComboBox().addItem(arc);
        }
    }
    
    // ---------------------------------------------------------- //
    // Apply Filter
    // ---------------------------------------------------------- //
    
    // ---------------------------------------------------------- //
    // Metodes de generació de taula
    // ---------------------------------------------------------- //
    // per alguna raó que desconec, la septima columna fa que peti amb un out of bound
    
    public TableModel getCpuDataTable() {
        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Arquitectura");
        tm.addColumn("Data Llençament");
        tm.addColumn("Fabricant");
        tm.addColumn("Cores");
        tm.addColumn("Preu");
        //tm.addColumn("Extres");
        for (Cpu producte : this.mag.getInventari()) {
            Object[] fila = new Object[7];
            fila[0] = producte.getCodi();
            fila[1] = producte.getNom();
            fila[2] = producte.getArquitectura();
            fila[3] = producte.getDataLlencament();
            fila[4] = producte.getFabricant();
            fila[5] = producte.getCores();
            fila[6] = producte.getPreu();
            //fila[7] = "test";

            tm.addRow(fila);
        }
        return tm;
    }

    public TableModel getCpuDataTableFiltre(String arc) {
        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Arquitectura");
        tm.addColumn("Data Llençament");
        tm.addColumn("Fabricant");
        tm.addColumn("Cores");
        tm.addColumn("Preu");
        tm.addColumn("Extres");
        for (Cpu producte : mag.getInventari()) {
            if (producte.getArquitectura().equals(arc)) {
                Object[] fila = new Object[7];
                fila[0] = producte.getCodi();
                fila[1] = producte.getNom();
                fila[2] = producte.getArquitectura();
                fila[3] = producte.getDataLlencament();
                fila[4] = producte.getFabricant();
                fila[5] = producte.getCores();
                fila[6] = producte.getPreu();
                fila[7] = producte.getOptionalString();

                tm.addRow(fila);
            }
        }
        return tm;
    }
    
    // ---------------------------------------------------------- //
    // Emplenar camps del filtre
    // ---------------------------------------------------------- //
    public JComboBox<String> setFiltreOptions(){
        return null;
    }
    
}
