/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1sap;

import java.util.Scanner;

/**
 *
 * @author solan
 */
public class Proyecto1SAP {

    /**
     * @param args the command line arguments
     */

         public static int rondas = 1;
    public static int tier,tierC =0;
    public static int vida = 10;
    public static int perdidaVida = 0;
    public static int cantidadTienda =0;
    public static void main(String[] args) {
        // TODO code application logic here
         LecturaEscritura texto = new LecturaEscritura();
        Animales animalNuevo = new Animales();
                 MenuRondas menu = new MenuRondas();
                 Acciones accion = new Acciones();
                 Habilidades habilidad = new Habilidades();
                 Acciones finalizado = new Acciones();
Comida nuevaComida = new Comida();
        int opc = 1;
        var scanner = new Scanner(System.in); //Menu principal
        var scanner2 = new Scanner(System.in); //Menu batllas
        var scanner3 = new Scanner(System.in); //Compras
        var scanner4 = new Scanner(System.in); //Posicion animal
  
    int victorias = 0;
    int oro = 10;
    int enemigo = 0;
       while ((opc == 1) || (opc == 2)|| (opc == 3)){
            System.out.println("¿Qué desea hacer?");
                System.out.println("1. Modo arena");
                System.out.println("2. Modo versus");
                System.out.println("3. Modo creativo");
                System.out.println("4. Salir");
                 opc = scanner.nextInt();
    if (opc >= 4 || opc <=0) {
                 System.out.println("Finalizado");
       }else {
        if (opc ==1) {
                 
                 
                 int opc2=1;
                 int opc3 = 1;
                  int opc4 = 1;
                 rondas =1;
                 while ((opc == 1) || (opc == 2)|| (opc == 3)|| (opc == 4)|| (opc == 5)|| (opc == 6)){
            System.out.println("¿Qué desea hacer?");
                System.out.println("1. Comprar mascotas");
                System.out.println("2. Comprar comida");
                System.out.println("3. Fusionar mascotas");
                System.out.println("4. Vender mascotas");
                System.out.println("5. Inicar partida");
                opc2 = scanner2.nextInt(); 
                Datos();
                 
                 int x = 0;
                 int animal =0;
                 
                 habilidad.inicializarTexto();
                 animalNuevo.mascotasTipo();
                 int contador = 1;
                 //comprar mascotas
                 
        if(opc2==1){
            menu.cantidad = cantidadTienda ;
            for (x = 0; x < cantidadTienda ; x++) {
               animal = (int)(Math.random()*tier); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarAnimales(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
               menu.llenarMatriz(animalNuevo.mascotasNivelVidaAtaque());
               contador = contador + 1;
            }
             opc3 = scanner3.nextInt();  
             if (oro<3){
                 System.out.println("No se puede comprar un animal porque no hay suficiente oro.");
             }else{
                 menu.animalComprado= opc3-1;
                 //***************************usuario tiene que elegir posicion 
                 System.out.println("¿En qué posición desea colocarlo?");
                 opc4 = scanner4.nextInt();
                 while (opc > 5 || opc < 1){
                 System.out.println("Posicion no valida, ingresela de nuevo");
                 opc4 = scanner4.nextInt();
             }
                         
                 menu.posicion= opc4 -1;
                 oro = oro -3;
           
            menu.animalComprado();
           
             }
             //********************visualizar errores/ELIMINAR DESPUES
             menu.mostrarATienda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
        }else{
            if(opc2 ==2){
                contador=1;
            for (x = 0; x < 2 ; x++) {
               animal = (int)(Math.random()*tierC); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarComida(animalNuevo.Comida());
               menu.llenarTienda(animalNuevo.efectosComida());
               contador = contador + 1;
            }
             opc3 = scanner3.nextInt();  
             if (oro<1){
                 System.out.println("No se puede comprar comida porque no hay suficiente oro.");
             }else{
                // int[][] comidaE,int [][]batalla,int pos,int pos2,String[][] comida,String[][] tipo,animalNuevo.mascotasTipo()) {
  
                 menu.animalComprado= opc3-1;
                 //***************************usuario tiene que elegir posicion 
                 System.out.println("¿A que animal desea ponerselo?");
                 opc4 = scanner4.nextInt();
                 while (opc > 5 || opc < 1){
                 System.out.println("Posicion no valida, ingresela de nuevo");
                 opc4 = scanner4.nextInt();
             }
                         
                 menu.posicion= opc4 -1;
                 oro = oro -1;
                   
            nuevaComida.comer(animalNuevo.efectosComida(),menu.batalla,menu.animalComprado,menu.posicion,animalNuevo.Comida(),animalNuevo.mascotasTipo());
           
             }
             //********************visualizar errores/ELIMINAR DESPUES
             menu.mostrarATienda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
            }else{
               int  animalFuerte=0;
            
                    if(opc2==3){
                        
                    }else{
                        if(opc2==4){
                            
                        }else{
                            if(opc2==5){
                                finalizado.finalizadoE = false;
                                finalizado.finalizadoA = false;
                                    int contadorE =1;
                                for (x = 0; x < cantidadTienda ; x++) {
                                    enemigo = (int)(Math.random()*tier); 
                                    menu.numeroEnemigo = enemigo;
                                    menu.contE = contadorE;
                                    menu.oponenteAlazar(animalNuevo.mascotasNivelVidaAtaque());
                                    contadorE = contadorE + 1;
            } 
                                menu.mostrarEnemigos();
                                    accion.Atacar(menu.ronda,menu.rondaEnemigo,animalNuevo.habilidadesMascotas(),menu.batalla,menu.batallaEnemigo,animalNuevo.mascotasTipo());
                                System.out.println("");
                                    if(habilidad.BatallaGanada==true){
                                        System.out.println("Ha ganado.");
                                    }else{
                                        System.out.println("Ha perdido.");
                                    }
                                    habilidad.CopiarTexto();
                                     oro= 10;
                                    
                                rondas = rondas +1;
                            }
                        }
                    }
                }
            }}
        
        //
        
           
       }else{
            if(opc ==2){
                rondas =1;
                Datos();
                int contador =1;
                 menu.cantidad = cantidadTienda ;
            for (int x = 0; x < cantidadTienda ; x++) {
               int animal = (int)(Math.random()*tier); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarAnimales(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
               menu.llenarMatriz(animalNuevo.mascotasNivelVidaAtaque());
               contador = contador + 1;
            }
               contador=1;
            for (int x = 0; x < 2 ; x++) {
              int animal = (int)(Math.random()*tierC); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarComida(animalNuevo.Comida());
               menu.llenarTienda(animalNuevo.efectosComida());
               contador = contador + 1;
            }
                texto.JugadorA(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                  contador =1;
                 menu.cantidad = cantidadTienda ;
            for (int x = 0; x < cantidadTienda ; x++) {
               int animal = (int)(Math.random()*tier); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarAnimales(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
               menu.llenarMatriz(animalNuevo.mascotasNivelVidaAtaque());
               contador = contador + 1;
            }
               contador=1;
            for (int x = 0; x < 2 ; x++) {
              int animal = (int)(Math.random()*tierC); 
               menu.numeroAnimal = animal;
               menu.cont = contador;
               menu.comprarComida(animalNuevo.Comida());
               menu.llenarTienda(animalNuevo.efectosComida());
               contador = contador + 1;
            }
                texto.JugadorB(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                menu.mostrarRonda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
              
                menu.mostrarEnemigos();
                menu.mostrarATienda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                accion.Atacar(menu.ronda,menu.rondaEnemigo,animalNuevo.habilidadesMascotas(),menu.batalla,menu.batallaEnemigo,animalNuevo.mascotasTipo());
                                System.out.println("");
                                    if(habilidad.BatallaGanada==true){
                                        System.out.println("Ha ganado A.");
                                    }else{
                                        System.out.println("Ha ganado B.");
                                    }
                                    
                                    
            }else{
                if(opc ==3){
                    texto.JugadorA(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                     texto.JugadorB(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                menu.mostrarRonda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
              
                menu.mostrarEnemigos();
                menu.mostrarATienda(animalNuevo.mascotasTipo(), animalNuevo.mascotasNivelVidaAtaque());
                accion.Atacar(menu.ronda,menu.rondaEnemigo,animalNuevo.habilidadesMascotas(),menu.batalla,menu.batallaEnemigo,animalNuevo.mascotasTipo());
                                System.out.println("");
                                    if(habilidad.BatallaGanada==true){
                                        System.out.println("Ha ganado A.");
                                    }else{
                                        System.out.println("Ha ganado B.");
                                    }
                }
            }
        }
    }
   } 
    }
    public static void Datos() {
        if (rondas ==1){
                     tier = 8;
                     tierC=3;
                     perdidaVida = -1;
                     cantidadTienda = 3;
                 }else{
                     if(rondas ==2 || rondas ==3){
                             tier = 16; tierC=6;
                             perdidaVida = -1;
                              cantidadTienda = 3;
                     }else{
                         if(rondas ==4|| rondas ==5){
                             tier =27;
                              tierC=10;
                             perdidaVida = -2;
                              cantidadTienda = 4;
                         }else{
                             if(rondas ==6|| rondas ==7){
                                 tier = 35;
                                  tierC=13;
                             }else{
                                 if(rondas ==8|| rondas ==9){
                                    tier = 43; 
                                 }else{
                                     if(rondas ==10|| rondas ==11){
                                         tier = 52;
                                     }else{
                                      if(rondas >= 12){
                                          tier = 54;
                                      }  
                                     }
                                 }
                             }
                         }
                     }
                 }
                 if (rondas ==6){
                     perdidaVida = -2;
                      cantidadTienda = 4;
                 }else {
                     if(rondas >= 7){
                         perdidaVida = -3;
                          cantidadTienda = 5;
                           tierC=14;
                     }
                 }
    }
    
    
}
