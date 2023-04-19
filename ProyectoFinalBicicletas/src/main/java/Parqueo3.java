/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio J
 */
public class Parqueo3 {
    
    private String lugar3;
    private int nParqueo3;
    private boolean dispo3 = true;

    public Parqueo3(String lugar3, int nParqueo3, boolean dispo3) {
        this.lugar3 = lugar3;
        this.nParqueo3 = nParqueo3;
        this.dispo3 = dispo3;
    }
    
    
    

    public int getnParqueo3() {
        return nParqueo3;
    }

    public void setnParqueo3(int nParqueo3) {
        this.nParqueo3 = nParqueo3;
    }

    public boolean isDispo3() {
        return dispo3;
    }

    public void setDispo3(boolean dispo3) {
        this.dispo3 = dispo3;
    }

    public String getLugar3() {
        return lugar3;
    }

    public void setLugar3(String lugar) {
        this.lugar3 = lugar;
    }
    
}
