/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1sap;

import java.util.Stack;

/**
 *
 * @author solan
 */
public class Comida {
    public static int aa=0;
    public void comer(int[][] comidaE,int [][]batalla,int pos,int pos2,String[][] comida,String[][] tipo) {
    naranjaC=false;mielC=false;huesoC=false;ajoC=false;chileC=false;melonC=false;hongoC=false;carneC=false;gelatinaC = false;
        if(comidaE[pos][4] ==4){
        batalla[pos2][1] = batalla[pos2][1] + comidaE[pos][6];
        batalla[pos2][2] = batalla[pos2][2] + comidaE[pos][7];
        batalla[pos2][3] = batalla[pos2][3] + comidaE[pos][8];
        if(batalla[pos2][2]<=0){
            for(aa=  0;aa <= 5 ; aa++){
                           batalla[pos2][aa]=0; 
                        }
        }
    }else{
        if(comidaE[pos][4] ==1){
            if(comidaE[pos][5] ==3){
                evaluar(batalla);
                 if(contador>2){
                     alAzarSinRepetir(3,batalla);
                     AtaqueVida(E1,pos,comidaE,batalla,comida,tipo);
                     AtaqueVida(E2,pos,comidaE,batalla,comida,tipo);
                     AtaqueVida(E3,pos,comidaE,batalla,comida,tipo);
                                     }else{
                                         if(contador>1){
                                     alAzarSinRepetir(3,batalla);
                     AtaqueVida(E1,pos,comidaE,batalla,comida,tipo);
                     AtaqueVida(E2,pos,comidaE,batalla,comida,tipo);
                                         }else{
                                     if(contador>0){
                                        alAzarSinRepetir(3,batalla);
                     AtaqueVida(E1,pos,comidaE,batalla,comida,tipo);
                                     
                                 }
                             }
                                     }
                                 
            }else{
                if(comidaE[pos][5] ==2){
                    if(contador>1){
                     alAzarSinRepetir(3,batalla);
                     AtaqueVida(E1,pos,comidaE,batalla,comida,tipo);
                     AtaqueVida(E2,pos,comidaE,batalla,comida,tipo);
                }else{
                    if(contador>0){
                     alAzarSinRepetir(3,batalla);
                     AtaqueVida(E1,pos,comidaE,batalla,comida,tipo);
                                     
                                 }
                }
                }
            }
        
    }
       comerEvaluar(comidaE[pos][0],batalla,pos2 ); 
  }
    }
    public void comerEvaluar(int pos,int [][]batalla,int pos2){
        if(pos==2){
            Naranja comidaTienda = new Naranja();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==3){
            Miel comidaTienda = new Miel();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==5){
            Hueso comidaTienda = new Hueso();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==7){
            Ajo comidaTienda = new Ajo();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==11){
            Chile comidaTienda = new Chile();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==14){
            Melon comidaTienda = new Melon();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==15){
            Hongo comidaTienda = new Hongo();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==17){
            Carne comidaTienda = new Carne();
            comidaTienda.n(batalla,pos2);
        }
        if(pos==18){
            Gelatina comidaTienda = new Gelatina();
            comidaTienda.n(batalla,pos2);
        }
        
    }
    public static boolean naranjaC,mielC,huesoC,ajoC,chileC,melonC,hongoC,carneC,gelatinaC = false;
    public static void AtaqueVida(int pos, int x,int [][] comidaE, int [][] batalla, String [][] tipo, String [][] tipoA) {
        LecturaEscritura texto = new LecturaEscritura();
         Habilidades menu = new Habilidades();
          batalla[pos][1] = batalla[pos][1] + comidaE[x][6];
          batalla[pos][2] = batalla[pos][2] + comidaE[x][7];
          batalla[pos][3] = batalla[pos][3] + comidaE[x][8];
           System.out.format("%s le otorgo %d / %d a %s", tipo[x][0] ,comidaE[x][6],comidaE[x][7], tipoA[batalla[pos][0]-1][0]);
         System.out.println("");
         menu.SalidaTexto[menu.contadorTexto][0]=tipo[x][0] +" le otorgo "+comidaE[x][6]+" / " +comidaE[x][7]+" a "+ tipoA[batalla[pos][0]-1][0];
            menu.contadorTexto = menu.contadorTexto +1;
            
    }
    public static void evaluar(int[][]batalla){
  for (int y = 0; y < 5 ; y++) {
            if(batalla[y][0]!=0){
                contador = contador +1; }}

}
    public static int E1,E2,E3,contador=0;
    public static void alAzarSinRepetir(int cantidad, int[][]batalla){
        int aliado;
      
    Stack < Integer > Animales = new Stack < Integer > ();
    for (int y = 0; y < cantidad ; y++) {
      aliado = (int) Math.floor(Math.random() * 4);
      while (Animales.contains(aliado)||batalla[aliado][0]==0) {
        aliado = (int) Math.floor(Math.random() * 4 );
      }
      Animales.push(aliado);
      if (y==0){
          E1 = aliado;
      }else{
          if(y==1){
              E2 = aliado;
          }else{
              if(y==2){
                  E3 = aliado;
              }
          }
      }
    }
    }
}
class Naranja extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=2;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=2; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=2;  
                }
            }
        }
    }
}
class Miel extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=3;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=3; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=3;  
                }
            }
        }
    }
}
class Hueso extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=5;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=5; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=5;  
                }
            }
        }
    }
}
class Ajo extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=7;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=7; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=7;  
                }
            }
        }
    }
}
class Chile extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=11;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=11; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=11;  
                }
            }
        }
    }
}
class Melon extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=14;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=14; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=14;  
                }
            }
        }
    }
}
class Hongo extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=15;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=15; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=15;  
                }
            }
        }
    }
}
class Carne extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=17;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=17; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=17;  
                }
            }
        }
    }
}
class Gelatina extends Comida {
    public static void n(int [][]batalla,int pos2){
        if(batalla[pos2][5]==0 ){
            batalla[pos2][5]=18;
        }else{
           if(batalla[pos2][6]==0 ){
            batalla[pos2][6]=18; 
            }else{
                if(batalla[pos2][7]==0 ){
            batalla[pos2][7]=18;  
                }
            }
        }
    }
}
