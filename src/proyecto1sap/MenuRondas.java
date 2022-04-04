/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1sap;

/**
 *
 * @author solan
 */
public class MenuRondas {
     public static int x = 0;
    public static int y = 0;
    //TIENDA ANIMALES
    public static int numeroAnimal =0;
    public static String nombre = "";
    public static int ataque = 0;
    public static int vida = 0;
    public static int cantidad = 0;
    public static int cont;  
    public static int [][] tienda = new int[5][6];
    public static int [][] tiendaC = new int[5][5];
    public static int [][] batalla = new int[5][6];
    public static int [][] ronda = new int[5][6];
    public static double [][] batalla2 = new double[5][6];
    public static double [][] ronda2 = new double[5][6];
    public static int condicional = 0;
    public static int animalComprado = 0;
    public static int posicion = 0;
    //INICIO PARTIDA
    public static int numeroEnemigo =0;
    public static int [][] batallaEnemigo = new int[5][6];
    public static int [][] rondaEnemigo = new int[5][6];
    public static double [][] batallaEnemigo2 = new double[5][6];
    public static double [][] rondaEnemigo2 = new double[5][6];
     public static int contE;  
   
      public static void comprarAnimales(String [][] tipo, int [][] nivel){
      nombre= tipo[numeroAnimal][0];
      ataque= nivel[numeroAnimal][1];
      vida= nivel[numeroAnimal][2];
      System.out.format("%d  %s  %d / %d", cont,nombre,ataque, vida);
         System.out.println();
  }
      public static void comprarComida(String [][] tipo){
      nombre= tipo[numeroAnimal][0];
      System.out.format(" %d  %s  ", cont,nombre);
         System.out.println();
  }
     public static void llenarMatriz(int [][] nivel){
         for( x=  0; x <= 4 ; x++){
      tienda[cont-1][x]  = nivel[numeroAnimal][x];
  }
     }
     public static void llenarTienda(int [][] nivel){
      tiendaC[cont-1][0]  = nivel[numeroAnimal][1];
  
     }
     public static void animalComprado(){
         //********************mostrar animales
          for( x=  0; x <= 4 ; x++){
      batalla[posicion][x]  = tienda[animalComprado][x];
      ronda[posicion][x]  = tienda[animalComprado][x];
       batalla2[posicion][x]  = tienda[animalComprado][x];
      ronda2[posicion][x]  = tienda[animalComprado][x];
          }
  }
     //por si acaso
    public void mostrarATienda(String [][] tipo, int [][] nivel) {
        int res =0;
       for( x=  0; x <= ronda.length -1 ; x++){
    condicional = 1;
            for ( y=  0; y <= 2; y++){
                if (ronda[x][0]==0){
                    y = 100;
                }else{
                    res = ronda[x][0]-1;
                    if(y==0){
                       System.out.print(tipo[res][y]);
                       System.out.print(" ");
                    }else{
                        System.out.print(nivel[res][y]); 
                        System.out.print(" ");
                    }
                   
                }      
            }          
        }
    }
    public void oponenteAlazar(int [][] nivel) {
 for( x=  0; x <= 4 ; x++){
      batallaEnemigo[contE-1][x]  = nivel[numeroEnemigo][x];
      rondaEnemigo[contE-1][x]  = nivel[numeroEnemigo][x];
  }
 
    }
    public void ordenar( ) {
         int i, j, aux;
        for (i = 0; i < batalla.length - 1; i++) {
            for (j = 0; j < batalla.length - i - 1; j++) {                                                              
                if (batalla[i + 1][1] < batalla[i][1]) {
                    aux = batalla[i + 1][j];
                    batalla[i + 1][j] = batalla[i][j];
                    batalla[i][j] = aux;
                }
            }
        }
    }
     public void mostrarRonda(String [][] tipo, int [][] nivel) {
   int res =0;
       for( x=  0; x <= ronda.length -1 ; x++){
    condicional = 1;
            for ( y=  0; y <= 2; y++){
                if (ronda[x][0]==0){
                    y = 100;
                }else{
                    res = ronda[x][0]-1;
                    if(y==0){
                       System.out.print(tipo[res][y]);
                       System.out.print(" ");
                    }else{
                        System.out.print(nivel[res][y]); 
                        System.out.print(" ");
                    }
                   
                }      
            }          
        }
       System.out.print("    ");
        for( x=  batallaEnemigo.length -1; x >= 0 ; x--){
    condicional = 1;
            for ( y= 0 ; y <= 2; y++){
                if (rondaEnemigo[x][0]==0){
                    y = 100;
                }else{
                    res = rondaEnemigo[x][0]-1;
                    if(y==0){
                       System.out.print(tipo[res][y]);
                       System.out.print(" ");
                    }else{
                        System.out.print(nivel[res][y]); 
                        System.out.print(" ");
                    }
                   
                }      
            }          
        }
        System.out.println("");
    }
    
    public void mostrarEnemigos() {
         for( x=  batallaEnemigo.length -1; x >= 0 ; x--){
    condicional = 1;
            for ( y= 0 ; y <= batallaEnemigo[0].length -1; y++){

                  System.out.print(batallaEnemigo[x][y]);  
            }
            if (condicional == 2){
                
            }else{
               System.out.println();  
            }
               
        }
    }
}
