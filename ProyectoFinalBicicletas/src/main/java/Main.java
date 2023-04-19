
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //invocamos clases       
        GestorIO miMensaje = new GestorIO();
        cuenta miCuenta = new cuenta();
        Precio miPrecio = new Precio();

        // se crean variables de mensajes para hacer mas corto y legible el codigo 
     

        // variables de salida y retorno
        boolean variableRetorno = true; 
        boolean salir = true; 
        
        // se inserta un "do" que llevara por dentro todo el proceso del main 

        do {

            int opcionTipo = miMensaje.solicitarInt("1- Cliente" + "\n" + 
                                        "2- Trabajador");
           

            final String primerMenu = ("Informacion importante: " + "\n" + 
                                                  "-Precio por hora: " + miPrecio.getPrecio() + " colones + 13% de IVA " + "\n" + 
                                                  "-Este tiempo va desde que saca la bicicleta del" + "\n" + 
                                                  "estacionamiento, hasta dejarla otra vez en uno de estos. " + "\n" +
                                                  "\n" + 
                                                  "1- Alquilar Bicicleta" + "\n" +
                                                  "2- Salir");


             final String segundoMenu = ("1- Log in" + "\n" +
                                          "2- Sign in");

            if (opcionTipo == 1){

                do{

                    int opcionPrimerM = miMensaje.solicitarInt(primerMenu);

                    // insertamos un switch para desarrollar el codigo dependiendo de la eleccion del usuario 

                    switch (opcionPrimerM) {

                        case 1 :

                            int opcionSegundoM = miMensaje.solicitarInt(segundoMenu);

                            // se inserta otro switch para hacer respectivos casos (log in o sign in)

                            switch (opcionSegundoM) {

                                case 1 : 
                                    
                                    String usuario = miMensaje.solicitarString("Digite su usuario");
                                    String password = miMensaje.solicitarString("Digite su contrasena");
                                 

                                    if(miCuenta.getUsuario().equals(usuario) && miCuenta.getPassword().equals(password)) { 

                                            

                                            Parqueo1 GestorlO[]=new Parqueo1[3];
                                            Parqueo2 GestorlO2[]=new Parqueo2[3];
                                            Parqueo3 GestorlO3[]=new Parqueo3[5];

                                            GestorIO array=new GestorIO();

                                            array.llenar_arreglo1(GestorlO, GestorlO2, GestorlO3);
                                            array.leer(GestorlO, GestorlO2, GestorlO3);
                                            array.leer2(GestorlO, GestorlO2, GestorlO3);
                                            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea 1) Alquiler ó 2) Devolución: "));
                                            if(eleccion == 1){
                                               array.alquiler(GestorlO, GestorlO2, GestorlO3); 
                                            }else{
                                                array.devolucion(GestorlO, GestorlO2, GestorlO3);
                                            }
                                            break;


                                        }else{
                                             if(usuario!=miCuenta.getUsuario() && password!=miCuenta.getPassword()){
                                                miMensaje.desplegarString("El usario digito una opcion invalida");
                                                variableRetorno = true;
                                            }
                                        }
                                                                        

                                    break;


                                case 2 : 

                                   
                                    String nombreCompleto = miMensaje.solicitarString("Creacion de cuenta" + "\n" +
                                                                                      "\n" + "Nombre completo: ");
                                    miCuenta.setNombreCompleto(nombreCompleto);

                                    String usuarioNuevo = miMensaje.solicitarString("Usuario: (No se permiten caracteres especiales ni numeros) ");
                                    miCuenta.setUsuario(usuarioNuevo);

                                    String correo = miMensaje.solicitarString("Correo electronico: ");
                                    miCuenta.setCorreo(correo);

                                    String direccionFisica = miMensaje.solicitarString("Direccion fisica: ");
                                    miCuenta.setDireccionFisica(direccionFisica);

                                    String passwordNueva = miMensaje.solicitarString("Password:  ");
                                    miCuenta.setPassword(passwordNueva);

                                    variableRetorno = true; 
                                    break;
                                    
                                    
                                default:
                                miMensaje.desplegarString("El usario digito una opcion invalida");
                                salir=false;
                                break;

                            }



                            break;


                        case 2:

                            miMensaje.desplegarString("Progama cerrado");
                            
                            break;

                        default:
                        miMensaje.desplegarString("El usario digito una opcion invalida");
                        salir=false;
                        break;

                    }


                }while (variableRetorno == true);

            }else{
                if(opcionTipo == 2){
                // aqui se monta modulos de trabajador 
                
                //modulo 1 acceso al trabajador, se utiliza carnet 123456
                int validacionCarnet = miMensaje.solicitarInt("Digite el numero de carnet");
                        
                    if(validacionCarnet == 123456) {
                        miMensaje.desplegarString("Acceso otorgado");

                        // modulo 2
                        int cambioPrecio = miMensaje.solicitarInt("Si decea cambiar el precio por hora digite 1, si no desea cambiarlo digite 2");
                            if(cambioPrecio == 1) {
                                int precioNuevo = miMensaje.solicitarInt("Digite el nuevo precio");
                                miPrecio.setPrecio(precioNuevo);
                                miMensaje.desplegarString("Nuevo Precio: " + miPrecio.getPrecio());
                                salir=true;
                                

                            }else{
                            miMensaje.desplegarString("Fin de programa empleado, modulos 3 y 4 no fueron posibles de aplicar.");
                            break;
                            }
                            // modulo 3 y 4 del empleado no fueron posibles de implementar 
                    }else{
                        miMensaje.desplegarString("Acceso denegado");
                    }
                    


                }
            }

        }while (salir == true);


    }

}
