/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio J
 */
public class Parqueo1 {
    
    private String lugar;
    private int nParqueo;
    private boolean dispo ;

    public Parqueo1(String lugar,int nParqueo, boolean dispo) {
        this.lugar = lugar;
        this.nParqueo = nParqueo;
        this.dispo = dispo;
    }

    public int getnParqueo() {
        return nParqueo;
    }

    public void setnParqueo(int nParqueo) {
        this.nParqueo = nParqueo;
    }

    public boolean getDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
