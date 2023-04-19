/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaac
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GestorIO {

cuenta miCuenta = new cuenta();
    
    //Metodo para solicitar un String
    public String solicitarString(String mensaje) {
        String hilera = JOptionPane.showInputDialog(null, mensaje);
        return hilera;
    }

    //Metodo para solicitar un numero con decimales
    public double solicitarDouble(String mensaje) {
        double numeroDecima = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
        return numeroDecima;
    }

    //Metodo para solicitar un numero entero
    public int solicitarInt(String mensaje) {
        int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        return numeroEntero;
    }

    //Metodo para solicitar un caracter
    public char solicitarChar(String mensaje) {
        String hilera = JOptionPane.showInputDialog(null, mensaje);
        char caracter = hilera.charAt(0);
        return caracter;
    }

    //Metodo para mostrar una hilera de texto
    // Y creamos los arreglos
    public void desplegarString(String mensaje) {
      JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void llenar_arreglo1(Parqueo1[] array, Parqueo2[] array2, Parqueo3[] array3){
        array[0] = new Parqueo1("Alajuela", 1, false);
        array[1] = new Parqueo1("Alajuela", 2, false);
        array[2] = new Parqueo1("Alajuela", 3, false);
        
        array2[0] = new Parqueo2("San Jóse", 1, false);
        array2[1] = new Parqueo2("San Jóse", 2, false);
        array2[2] = new Parqueo2("San Jóse", 3, false);
        
        
        array3[0] = new Parqueo3("Heredia", 1, true);
        array3[1] = new Parqueo3("Heredia", 2, true);
        array3[2] = new Parqueo3("Heredia", 3, true);
        array3[3] = new Parqueo3("Heredia", 4, false);
        array3[4] = new Parqueo3("Heredia", 5, true);
    }
    
    public void leer(Parqueo1[] array, Parqueo2[] array2, Parqueo3[] array3){
        
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getLugar()+" "+array[i].getnParqueo()+" "+array[i].getDispo());
            if(array[i].getDispo()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
        System.out.println(" ");
        
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i].getLugar2()+" "+array2[i].getnParqueo2()+" "+array2[i].getDispo2());
            if(array2[i].getDispo2()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
        System.out.println(" ");
       
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i].getLugar3()+" "+array3[i].getnParqueo3()+" "+array3[i].isDispo3());
            if(array3[i].isDispo3()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
    
    
    }
    
    
    public void leer2(Parqueo1[] array, Parqueo2[] array2, Parqueo3[] array3){
        for(int i =0; i < array.length; i++){
            String disponible= "";
            if(array[i].getDispo()== true){
                disponible = "Disponible";
            }else{
                disponible = "Rentado";
            }
           JOptionPane.showMessageDialog(null,"***************\n"+
                                                        "    Parqueos    \n"+
                                                         ""+array[i].getLugar()+" "+array[i].getnParqueo()+" "+disponible+"\n"+
                                                         "               \n"+
                                                         "***************"); 
        }      
        for(int i =0; i < array2.length; i++){
            String disponible= "";
            if(array2[i].getDispo2()== true){
                disponible = "Disponible";
            }else{
                disponible = "Rentado";
            }
           JOptionPane.showMessageDialog(null,"***************\n"+
                                                        "    Parqueos    \n"+
                                                         ""+array2[i].getLugar2()+" "+array2[i].getnParqueo2()+" "+disponible+"\n"+
                                                         "               \n"+
                                                         "***************\n"); 
        }
        for(int i =0; i < array3.length; i++){
            String disponible= "";
            if(array3[i].isDispo3()== true){
                disponible = "Disponible";
            }else{
                disponible = "Rentado";
            }
           JOptionPane.showMessageDialog(null,"***************\n"+
                                                        "    Parqueos    \n"+
                                                         ""+array3[i].getLugar3()+" "+array3[i].getnParqueo3()+" "+disponible+"\n"+
                                                         "               \n"+
                                                         "***************"); 
        }
        
    }
    
    public void alquiler(Parqueo1[] array, Parqueo2[] array2, Parqueo3[] array3){
        int conteo = 0;
        int repe=1;
        int opcion=0;
        do{
            repe = Integer.parseInt(JOptionPane.showInputDialog("Desea alquilar una bicicleta "+
                                                                  " digite 1) para SI "+
                                                                  " Ó 2) para NO"+
                                                                  "...: "));
            if(repe == 1){
                int numero_parqueo = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de parqueo que necesita "+
                                                                                    " 1) Alajuela, "+
                                                                                    " 2) San Jose, "+
                                                                                    " 3) Heredia, "+
                                                                                    " 4) Salir "+
                                                                                    "...: "));
                switch(numero_parqueo){
                    case 1:
                        for (int i = 0; i < array.length; i++) {
                            System.out.println(array[i].getLugar()+" "+array[i].getnParqueo()+" "+array[i].getDispo());
                            if(array[i].getDispo()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                        }    
                        JOptionPane.showMessageDialog(null, "Lo sentimo el parqueo de Alajuela esta rentado por completo, esperamos su comprención");
                        
                        
                        break;
                    case 2:
                        for (int i = 0; i < array2.length; i++) {
                            System.out.println(array2[i].getLugar2()+" "+array2[i].getnParqueo2()+" "+array2[i].getDispo2());
                            if(array2[i].getDispo2()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Lo sentimo el parqueo de San  Jóse esta rentado por completo, esperamos su comprención");
                        break;
                    case 3:
                        for (int i = 0; i < array3.length; i++) {
                            System.out.println(array3[i].getLugar3()+" "+array3[i].getnParqueo3()+" ");
                            if(array3[i].isDispo3()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                            
                            int numero_espacio = Integer.parseInt(JOptionPane.showInputDialog("Cual numero de los 5 espacios de parqueo desea: "));
                            if(array3[i].getnParqueo3()==numero_espacio){
                                if(array3[i].isDispo3()==true){
                                    array3[numero_espacio-1].setDispo3(false);
                                JOptionPane.showMessageDialog(null, "Usted alquilo la bicicleta con exito");
                                    System.out.println("*** Factura ***");
                                    System.out.println(" ");
                                    System.out.println("Usuario: "+ miCuenta.getUsuario());
                                    System.out.println("Parqueo: "+array[i].getnParqueo());
                                    System.out.println("Hora: ");
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "Lo sentimos ya fue alquilada la bicicleta");
                                    repe = Integer.parseInt(JOptionPane.showInputDialog("Desea alquilar una bicicleta "+
                                                                                          " digite 1) para SI "+
                                                                                          " Ó 2) para NO"+
                                                                                          "...: "));
                                }
                            }
                                break;
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Obcion invalida.");
                }
        
            
            }
            
        }while(repe == 1);
        System.out.println("El programa ha finalisado.");
    }
    
    public void devolucion(Parqueo1[] array, Parqueo2[] array2, Parqueo3[] array3){
        int devo = Integer.parseInt(JOptionPane.showInputDialog("Desea devolver una bicicleta 1) SI ó 2) NO: "));
        if(devo == 1){
            for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getLugar()+" "+array[i].getnParqueo()+" "+array[i].getDispo());
            if(array[i].getDispo()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
        System.out.println(" ");
        
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i].getLugar2()+" "+array2[i].getnParqueo2()+" "+array2[i].getDispo2());
            if(array2[i].getDispo2()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
        System.out.println(" ");
       
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i].getLugar3()+" "+array3[i].getnParqueo3()+" "+array3[i].isDispo3());
            if(array3[i].isDispo3()== true){
                System.out.println("Disponible");
            }else{
                System.out.println("Rentado");
            }
        }
        int numero_devo = Integer.parseInt(JOptionPane.showInputDialog("Cual parqueo ocupa 1) Alajuela, 2) San Jóse, 3) Heredia, 4) SALIR: "));
        switch(numero_devo){
                    case 1:
                        for (int i = 0; i < array.length; i++) {
                            System.out.println(array[i].getLugar()+" "+array[i].getnParqueo()+" "+array[i].getDispo());
                            if(array[i].getDispo()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                        }    
                        JOptionPane.showMessageDialog(null, "Lo sentimo el parqueo de Alajuela esta ocupado por completo, esperamos su comprención");
                        
                        
                        break;
                    case 2:
                        for (int i = 0; i < array2.length; i++) {
                            System.out.println(array2[i].getLugar2()+" "+array2[i].getnParqueo2()+" "+array2[i].getDispo2());
                            if(array2[i].getDispo2()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Lo sentimo el parqueo de San  Jóse esta ocupado por completo, esperamos su comprención");
                        break;
                    case 3:
                        for (int i = 0; i < array3.length; i++) {
                            System.out.println(array3[i].getLugar3()+" "+array3[i].getnParqueo3()+" ");
                            if(array3[i].isDispo3()== true){
                                System.out.println("Disponible");
                            }else{
                                System.out.println("Rentado");
                            }
                            int numeroD = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del espacio del parqueo que desea devolver la bicicleta: "));
                            if(array3[i].getnParqueo3()==numeroD){
                                System.out.println("11");
                                if(array3[i].isDispo3()==false){
                                    array3[numeroD-1].setDispo3(true);
                                    JOptionPane.showMessageDialog(null, "Usted devolvio la bicicleta con exito");
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "Lo sentimos el espacio digitado no esta disponible");
                                }
                            }
                            break;
                        }
                        break;
                    case 4:
                        System.out.println("Tenga buen día");
                        break;
                    default:
                        System.out.println("Obcion invalida.");
                }
        }
        
    }

}