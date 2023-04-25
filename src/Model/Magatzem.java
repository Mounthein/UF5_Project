/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author marc
 */
public class Magatzem implements Serializable{
    private String nom;
    private String direccio;
    private TreeSet<Cpu> inventari = new TreeSet<>();
    private static ArrayList<String> CpuArchitectures;
    
    public Magatzem() {
        this.CpuArchitectures = setArquitectures();
    }

    public Magatzem(String nom, String direccio) {
        this.nom = nom;
        this.direccio = direccio;
        this.CpuArchitectures = setArquitectures();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public TreeSet<Cpu> getInventari() {
        return inventari;
    }

    public void setInventari(TreeSet<Cpu> inventari) {
        this.inventari = inventari;
    }

    public static ArrayList getCpuArchitectures() {
        return CpuArchitectures;
    }

    @Override
    public String toString() {
        return "Magatzem{" + "nom=" + nom + ", direccio=" + direccio + ", inventari=" + inventari + '}';
    }
    
    // Add to inventori
    public void addProduct(Cpu c){
        if (c.getCodi()> 0) {
            inventari.add(c);
        }
    }
    
    // Update product
    public void updateProduct(Cpu c){
        this.inventari.remove(c);
        this.inventari.add(c);
    }
    
    // Delete product
    public void deleteProduct(Cpu c){
        this.inventari.remove(c);
    }
    
    // File interaction
    public void saveToFile(File arxiu){
        try {
            FileOutputStream fos = new FileOutputStream(arxiu);//Li passo l'arxiu
            ObjectOutputStream oos = new ObjectOutputStream(fos);// Li passo el FOS al OOS
            oos.writeObject(this.inventari);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat" + e);
        } catch (IOException e) {
            System.out.println("Error d'entrada/sortida" + e);
        }
    }
    
    public void importToList(File arxiu){
        TreeSet<Cpu> lst = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(arxiu);
            ois = new ObjectInputStream(fis);
            lst = (TreeSet<Cpu>) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat " + e);
        } catch (IOException e) {
            System.out.println("Error d'entrada/sortida " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("La Classe no s'ha trobat " + e);
        }finally{
            try{
                if(ois !=null){
                    ois.close();
                }
            }catch (IOException io){
                System.out.println(io);
            }
        }

        setInventari(lst);
    }
    
    // End file interaction
    
    // get product
    public Cpu getProduct(Cpu c){
        for (Cpu next : inventari) {
            if (next.getCodi() == c.getCodi()) {
                c = next;
            }
        }
        return c;
    }
    
    
    public static ArrayList setArquitectures() {
        // Create an ArrayList of AMD CPU architectures
        ArrayList<String> CpuArchitectures = new ArrayList<>();
        CpuArchitectures.add("K5");
        CpuArchitectures.add("K6");
        CpuArchitectures.add("K7");
        CpuArchitectures.add("K8");
        CpuArchitectures.add("K10");
        CpuArchitectures.add("Bulldozer");
        CpuArchitectures.add("Piledriver");
        CpuArchitectures.add("Steamroller");
        CpuArchitectures.add("Excavator");
        CpuArchitectures.add("Zen");
        CpuArchitectures.add("Zen+");
        CpuArchitectures.add("Zen 2");
        CpuArchitectures.add("Zen 3");

        CpuArchitectures.add("8086");
        CpuArchitectures.add("80286");
        CpuArchitectures.add("80386");
        CpuArchitectures.add("80486");
        CpuArchitectures.add("Pentium (P5)");
        CpuArchitectures.add("Pentium Pro (P6)");
        CpuArchitectures.add("Pentium II");
        CpuArchitectures.add("Pentium III");
        CpuArchitectures.add("Pentium 4");
        CpuArchitectures.add("Pentium M");
        CpuArchitectures.add("Core");
        CpuArchitectures.add("Nehalem");
        CpuArchitectures.add("Sandy Bridge)");
        CpuArchitectures.add("Ivy Bridge");
        CpuArchitectures.add("Haswell");
        CpuArchitectures.add("Broadwell");
        CpuArchitectures.add("Skylake");
        CpuArchitectures.add("Kaby Lake");
        CpuArchitectures.add("Coffee Lake");
        CpuArchitectures.add("Ice Lake");
        CpuArchitectures.add("Tiger Lake");
        CpuArchitectures.add("Rocket Lake");

        return CpuArchitectures;
    }
    
}

