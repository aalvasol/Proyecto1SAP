/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1sap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author solan
 */
public class LecturaEscritura {
     public static boolean Jugadores = true;
    public static int y,x =0;
    public static void JugadorA(String [][] tipo, int[][] nivel){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese datos del jugador A");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("Existe: " + file.exists());
        System.out.println("Se puede leer: " + file.canWrite());
MenuRondas menu = new MenuRondas();
        try {
            String cadena = "";
        int pos = 4;
            Scanner scannerArchivo = new Scanner(file);
            while (scannerArchivo.hasNextLine()) {
                
                String linea = scannerArchivo.nextLine();
                String[] matriz = linea.split(",");
                    if(matriz[0].equals("animal")){
                        for( y=  0; y < 54 ; y++){
                            cadena=tipo[y][0];
                         if(matriz[1].equals(cadena)){
                             for( x=  0; x <= 4 ; x++){
                         menu.ronda[pos][x]  = nivel[y][x];
                              menu.batalla[pos][x]  = nivel[y][x];}
                         }
                        }pos=pos-1;
                    }else{
                        if(matriz[0].equals("campo")){
                            
                        }else{
                            if(matriz[0].equals("comida")){
                                
                            }
                        }
                    }
                     
                System.out.println(String.format("LINEA: %s, LONGITUD: %d", linea, linea.length()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }
     
       
}
     public static void JugadorB(String [][] tipo, int[][] nivel){
            //ENEMIGO
            MenuRondas menu = new MenuRondas();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese datos del jugador B");
        String path2 = scanner2.nextLine();
        File file2 = new File(path2);
        System.out.println("Existe: " + file2.exists());
        System.out.println("Se puede leer: " + file2.canWrite());

        try {
        int pos = 4;
        String cadena ="";
            Scanner scannerArchivo2 = new Scanner(file2);
            while (scannerArchivo2.hasNextLine()) {
                
                String linea2 = scannerArchivo2.nextLine();
                String[] matriz2 = linea2.split(",");
                    if(matriz2[0].equals("animal")){
                        for( y=  0; y < 54 ; y++){
                            cadena=tipo[y][0];
                         if(matriz2[1].equals(cadena)){
                             for( x=  0; x <= 4 ; x++){
                         menu.rondaEnemigo[pos][x]  = nivel[y][x];
                         menu.batallaEnemigo[pos][x]  = nivel[y][x];}
                         }
                        }pos=pos-1;
                    }else{
                        if(matriz2[0].equals("campo")){
                            
                        }else{
                            if(matriz2.equals("comida")){
                                
                            }
                        }
                    }
                     
                System.out.println(String.format("LINEA: %s, LONGITUD: %d", linea2, linea2.length()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }
     }
    public static void CopiarTexto(String [][] SalidaTexto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un path a escribir");
        String path = scanner.nextLine();
        File fileDestino = new File(path);
        Habilidades habilidad = new Habilidades();
        try {
            PrintWriter printer = new PrintWriter(fileDestino);
            for( y=  0; y <= 200 ; y++){     
                if(!SalidaTexto[y][0].equals("")){
                printer.println(SalidaTexto[y][0]);
                }
            }
        printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }

    }
}
