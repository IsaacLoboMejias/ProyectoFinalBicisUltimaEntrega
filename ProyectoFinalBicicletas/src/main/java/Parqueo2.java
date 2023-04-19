/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio J
 */
public class Parqueo2 {
    
    private String lugar2;
    private int nParqueo2;
    private boolean dispo2=true;

    public Parqueo2(String lugar2, int nParqueo2, boolean dispo2) {
        this.lugar2 = lugar2;
        this.nParqueo2 = nParqueo2;
        this.dispo2 = dispo2;
    }

    public int getnParqueo2() {
        return nParqueo2;
    }

    public void setnParqueo2(int nParqueo2) {
        this.nParqueo2 = nParqueo2;
    }

    public boolean getDispo2() {
        return dispo2;
    }

    public void setDispo2(boolean dispo2) {
        this.dispo2 = dispo2;
    }

    public String getLugar2() {
        return lugar2;
    }

    public void setLugar2(String lugar) {
        this.lugar2 = lugar;
    }
    
}
