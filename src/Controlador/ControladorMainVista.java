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

/**
 *
 * @author marc
 */
public class ControladorMainVista {

    private Magatzem mag;
    private Vista finestra;

    public ControladorMainVista() {
        this.finestra = new Vista(this);
        this.finestra.getjTable1().setModel(getCpuDataTable());
    }

    // ---------------------------------------------------------- //
    // Metodes de generació de taula
    // ---------------------------------------------------------- //
    public TableModel getCpuDataTable() {
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
}
