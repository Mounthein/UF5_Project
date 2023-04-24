/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author marc
 */
public class Cpu implements Comparable<Cpu>, Serializable {

    private int codi;
    private String nom;
    private String arquitectura;
    private String dataLlencament;
    private String fabricant;
    private int cores;
    private double preu;
    private ArrayList<String> optionals = new ArrayList<>();

    public Cpu(int codi, String nom, String arquitectura, String dataLlencament, String fabricant, int cores, double preu) {
        this.codi = codi;
        this.arquitectura = arquitectura;
        this.nom = nom;
        this.fabricant = fabricant;
        this.cores = cores;
        this.preu = preu;
        this.dataLlencament = dataLlencament;
    }

    public Cpu(int codi) {
        this.codi = codi;
    }

    public Cpu() {
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public ArrayList<String> getOptionals() {
        return optionals;
    }

    public void setOptionals(ArrayList<String> optionals) {
        this.optionals = optionals;
    }

    public String getDataLlencament() {
        return dataLlencament;
    }

    public void setDataLlencament(String dataLlencament) {
        this.dataLlencament = dataLlencament;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Cpu{" + "codi=" + codi + ", nom=" + nom + ", arquitectura=" + arquitectura + ", dataLlencament=" + dataLlencament + ", fabricant=" + fabricant + ", cores=" + cores + ", preu=" + preu + ", optionals=" + optionals + '}';
    }

    @Override
    public int compareTo(Cpu o) {
        if (this.getCodi() > o.getCodi()) {

            return 1;
        } else if (this.getCodi() < o.getCodi()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cpu other = (Cpu) obj;
        return this.codi == other.codi;
    }

    public String getOptionalString() {
        String x = "";
        if (optionals.size() > 0) {
            for (String optional : optionals) {
                x += optional;
            }
        }
        return x;
    }

}
