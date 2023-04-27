/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Magatzem;
import Vista.Vista;
import Vista.addDialog;
import Model.Cpu;
import java.util.ArrayList;

/**
 *
 * @author marc
 */
public class ControladorDialegCpu {

    private Magatzem mag;
    private addDialog dialeg;
    private Cpu c;

    // Constructor de modificació
    public ControladorDialegCpu(Vista finestraPare, Cpu c, Magatzem mag, Boolean editar) {
        dialeg = new addDialog(finestraPare, true);
        this.c = c;
        this.mag = mag;
        Integer codix = c.getCodi();
        dialeg.getCodeLabelMod().setText(codix.toString());
        setFiltreOptions();
        setDataModificar(c);
        if (editar) {
            setEnabledCamps();
        } else {
            setDisableCamps();
        }
        this.dialeg.setVisible(true);
    }

    // Constructor nova cpu
    public ControladorDialegCpu(Vista finestraPare, Integer codix, Magatzem mag) {
        dialeg = new addDialog(finestraPare, true);
        this.mag = mag;
        codix += 1;
        dialeg.getCodeLabelMod().setText(codix.toString());
        dialeg.getIntelRadioButton().setSelected(true);
        setFiltreOptions();
        setEnabledCamps();
        this.dialeg.setVisible(true);
    }
    
    // ---------------------------------------------------------- //
    // Emplenar camps per modificar
    // ---------------------------------------------------------- //
    public void setDataModificar(Cpu c) {
        this.dialeg.getNomTextField().setText(c.getNom());
        this.dialeg.getTipusComboBox().setSelectedItem(c.getArquitectura());
        this.dialeg.getDataTextField().setText(c.getDataLlencament());
        if (c.getFabricant().equals("Intel")) {
            this.dialeg.getIntelRadioButton().setSelected(true);
        } else {
            this.dialeg.getAmdRadioButton().setSelected(true);
        }
        Integer co = c.getCores();
        this.dialeg.getCoresTextField().setText(co.toString());
        if (c.getOptionals().size() == 2) {
            this.dialeg.getIgpuCheckBox().setSelected(true);
            this.dialeg.getOverclockCheckBox().setSelected(true);
        } else if (c.getOptionals().isEmpty()) {

        } else if (c.getOptionals().get(0).equals("opt1")) {
            this.dialeg.getIgpuCheckBox().setSelected(true);
        } else {
            this.dialeg.getOverclockCheckBox().setSelected(true);
        }
        Double dd = c.getPreu();
        this.dialeg.getPreuTextField().setText(dd.toString());
    }
    
    // ---------------------------------------------------------- //
    // Deshabilitar els camps
    // ---------------------------------------------------------- //
    public void setDisableCamps() {
        this.dialeg.getNomTextField().setEnabled(false);
        this.dialeg.getTipusComboBox().setEnabled(false);
        this.dialeg.getDataTextField().setEnabled(false);
        this.dialeg.getIntelRadioButton().setEnabled(false);
        this.dialeg.getAmdRadioButton().setEnabled(false);
        this.dialeg.getCoresTextField().setEnabled(false);
        this.dialeg.getIgpuCheckBox().setEnabled(false);
        this.dialeg.getOverclockCheckBox().setEnabled(false);
        this.dialeg.getPreuTextField().setEnabled(false);
    }
    
    // ---------------------------------------------------------- //
    // Habilitar els camps
    // ---------------------------------------------------------- //
    public void setEnabledCamps() {
        this.dialeg.getNomTextField().setEnabled(true);
        this.dialeg.getTipusComboBox().setEnabled(true);
        this.dialeg.getDataTextField().setEnabled(true);
        this.dialeg.getIntelRadioButton().setEnabled(true);
        this.dialeg.getAmdRadioButton().setEnabled(true);
        this.dialeg.getCoresTextField().setEnabled(true);
        this.dialeg.getIgpuCheckBox().setEnabled(true);
        this.dialeg.getOverclockCheckBox().setEnabled(true);
        this.dialeg.getPreuTextField().setEnabled(true);
    }

    // ---------------------------------------------------------- //
    // Emplenar camps del filtre
    // ---------------------------------------------------------- //
    public void setFiltreOptions() {
        ArrayList<String> j = Magatzem.getCpuArchitectures();
        for (String object : j) {
            this.dialeg.getTipusComboBox().addItem(object);
        }
    }

    // ---------------------------------------------------------- //
    // Validacions
    // ---------------------------------------------------------- //
    public boolean checkNom() {
        String nom = dialeg.getNomTextField().getText();
        if (nom.length() > 5) {
            dialeg.getNameLabel().setVisible(false);
            return true;
        } else {
            dialeg.getNameLabel().setVisible(true);
            return false;
        }
    }
    
    public boolean checkData() {
        String nom = dialeg.getDataTextField().getText();
        if (nom.length() > 5) {
            dialeg.getDataLabel().setVisible(false);
            return true;
        } else {
            dialeg.getDataLabel().setVisible(true);
            return false;
        }
    }
    
    public boolean checkCores(){
        String nom = dialeg.getCoresTextField().getText();
        try {
            Integer num = 0;
            num = num.parseInt(nom);
        } catch (NumberFormatException e) {
            System.out.println(e);
            dialeg.getCoresLabel().setVisible(true);
            return false;
        }
        dialeg.getCoresLabel().setVisible(false);
        return true;
    }
    
    public boolean checkPreu(){
        String nom = dialeg.getPreuTextField().getText();
        try {
            Double num = 0.0;
            num = num.parseDouble(nom);
        } catch (NumberFormatException e) {
            System.out.println(e);
            dialeg.getCoresLabel().setVisible(true);
            return false;
        }
        dialeg.getCoresLabel().setVisible(false);
        return true;
    }
    
    public boolean dataValidation(){
        int pass = 0;
        if (checkNom()) {
            pass += 1;
        }
        if (checkData()) {
            pass += 1;
        }
        if (checkCores()) {
            pass += 1;
        }
        if (checkPreu()) {
            pass =+1;
        }
        
        return pass == 4;
    }
    
    // ---------------------------------------------------------- //
    // Get cpu from data:
    // ---------------------------------------------------------- //
    public Cpu cpuData(){
        Cpu newCpu = new Cpu();
        newCpu.setNom(dialeg.getNomTextField().getText());
        newCpu.setArquitectura(dialeg.getTipusComboBox().getSelectedItem().toString());
        newCpu.setDataLlencament(dialeg.getDataTextField().getText());
        if (dialeg.getIntelRadioButton().isSelected()) {
            newCpu.setFabricant("Intel");
        } else {
            newCpu.setFabricant("AMD");
        }
        newCpu.setCores(Integer.parseInt(dialeg.getCoresTextField().getText()));
        if (dialeg.getIgpuCheckBox().isSelected()) {
            newCpu.addOptional("IGPU");
        }
        if (dialeg.getOverclockCheckBox().isSelected()) {
            newCpu.addOptional("Overclock");
        }
        return newCpu;
    }
    // ---------------------------------------------------------- //
    // Boto de acceptar
    // ---------------------------------------------------------- //
    public void continueButton(){
        if (dialeg.getNomTextField().isEnabled()) {
            if (dataValidation()) {
                mag.addUpdateProduct(cpuData());
            }
        } else {
            mag.deleteProduct(cpuData());
        }
        
    }
}
